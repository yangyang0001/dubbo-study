package com.inspur.service.impl;

import com.inspur.service.UserService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @program: dubbo_study
 * @description: No Description
 * @author: Yang jian wei
 * @create: 2019-10-01 21:51
 */
@Service(version = "1.0.0")
public class UserServiceImpl implements UserService {

    @Override
    public String sayHello(String message) {
        return null;
    }

}
