package com.mojang.renderpearl.backend.api;

import com.mojang.renderpearl.api.pipeline.ShaderType;
import com.mojang.renderpearl.util.ShaderCompileException;
import java.nio.ByteBuffer;
import java.util.List;
import org.jspecify.annotations.Nullable;

public interface SpvModule extends AutoCloseable {
   @Override
   void close();

   ByteBuffer spv();

   ShaderType type();

   SpvModule.Reflection reflect() throws ShaderCompileException;

   @Nullable
   SpvModule.Reflection getReflectionInfoIfAvailable();

   public interface Reflection {
      List<SpvModule.Reflection.InterfaceVariable> inputs();

      List<SpvModule.Reflection.InterfaceVariable> outputs();

      List<SpvModule.Reflection.Descriptor> descriptors(int resourceType);

      List<SpvModule.Reflection.Descriptor> descriptors();

      List<SpvModule.Reflection.PushConstant> pushConstants();

      public interface Descriptor {
         String name();

         SpvModule.Reflection.Type type();

         int resourceType();

         int descriptorSetIndex();

         void descriptorSetIndex(int index);

         int binding();

         void binding(int location);
      }

      public interface InterfaceVariable {
         String name();

         SpvModule.Reflection.Type type();

         int location();

         void location(int location);

         default boolean hasDecoration(final int decoration) {
            return this.decoration(decoration) != 0;
         }

         int decoration(int decoration);
      }

      public interface PushConstant {
         int size();
      }

      public interface Type {
         int baseType();

         int dimensions();

         int vectorSize();

         int arrayDimensions();

         int arrayLength(int dimensionIndex);
      }
   }
}
