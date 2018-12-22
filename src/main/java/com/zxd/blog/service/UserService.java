package com.zxd.blog.service;

import com.zxd.blog.bean.User;
import com.zxd.blog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper mapper;

    public void addUser(User user) {
        mapper.insert(user);
    }

    public void updateUser(User user) {
        mapper.update(user);
    }

    public User findUser(int id) {
        return mapper.find(id);
    }

    public void deleteUser(int id){
        mapper.delete(id);
    }

}
