package com.mojang.blaze3d.shaders;

import javax.annotation.Nullable;

@fic
public enum ShaderType {
   VERTEX("vertex", ".vsh"),
   FRAGMENT("fragment", ".fsh");

   private static final ShaderType[] TYPES = values();
   private final String name;
   private final String extension;

   private ShaderType(final String $$0, final String $$1) {
      this.name = $$0;
      this.extension = $$1;
   }

   @Nullable
   public static ShaderType byLocation(alr $$0) {
      for (ShaderType $$1 : TYPES) {
         if ($$0.a().endsWith($$1.extension)) {
            return $$1;
         }
      }

      return null;
   }

   public String getName() {
      return this.name;
   }

   public alk idConverter() {
      return new alk("shaders", this.extension);
   }
}
