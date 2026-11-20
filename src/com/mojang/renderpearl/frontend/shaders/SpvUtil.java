package com.mojang.renderpearl.frontend.shaders;

import com.mojang.renderpearl.api.pipeline.ShaderType;
import com.mojang.renderpearl.api.pipeline.UniformType;
import com.mojang.renderpearl.util.ShaderCompileException;
import it.unimi.dsi.fastutil.ints.IntList;
import java.nio.IntBuffer;
import org.lwjgl.util.spvc.Spvc;
import org.lwjgl.util.spvc.SpvcReflectedResource;

public class SpvUtil {
   public static final IntList DESCRIPTOR_TYPES = IntList.of(new int[]{5, 1, 2, 6, 7, 10, 11});

   public static void crashIfError(final int result, final String message) {
      if (result != 0) {
         throw new IllegalStateException(message + " (" + spvcErrorString(result) + ")");
      }
   }

   public static void throwIfError(final int result, final String message) throws ShaderCompileException {
      if (result != 0) {
         throw new ShaderCompileException(message + " (" + spvcErrorString(result) + ")");
      }
   }

   public static String spvcErrorString(final int result) {
      return switch (result) {
         case -4 -> "SPVC_ERROR_INVALID_ARGUMENT";
         case -3 -> "SPVC_ERROR_OUT_OF_MEMORY";
         case -2 -> "SPVC_ERROR_UNSUPPORTED_SPIRV";
         case -1 -> "SPVC_ERROR_INVALID_SPIRV";
         default -> Integer.toString(result);
      };
   }

   public static int getDecorationOffset(final long compiler, final SpvcReflectedResource resource, final int decoration, final IntBuffer returnBuffer) throws ShaderCompileException {
      if (!Spvc.spvc_compiler_get_binary_offset_for_decoration(compiler, resource.id(), decoration, returnBuffer)) {
         throw new ShaderCompileException("Couldn't find byte offset for location decoration of " + resource.nameString());
      } else {
         return returnBuffer.get(0);
      }
   }

   public static int resourceType(final UniformType uniformType) {
      return switch (uniformType) {
         case COMBINED_IMAGE_SAMPLER -> 7;
         case UNIFORM_BUFFER -> 1;
         case TEXEL_BUFFER -> 7;
         case INPUT_ATTACHMENT -> 5;
      };
   }

   public static String baseTypeString(final int baseType) {
      return switch (baseType) {
         case 0 -> "unknown";
         case 1 -> "void";
         case 2 -> "bool";
         case 3 -> "int8";
         case 4 -> "uint8";
         case 5 -> "int16";
         case 6 -> "uint16";
         case 7 -> "int32";
         case 8 -> "uint32";
         case 9 -> "int64";
         case 10 -> "uint64";
         case 11 -> "atomic_counter";
         case 12 -> "fp16";
         case 13 -> "fp32";
         case 14 -> "fp64";
         case 15 -> "struct";
         case 16 -> "image";
         case 17 -> "sampled_image";
         case 18 -> "sampler";
         case 19 -> "acceleration_structure";
         default -> "UNKNOWN_TYPE";
      };
   }

   public static int executionModel(final ShaderType type) {
      return switch (type) {
         case VERTEX -> 0;
         case FRAGMENT -> 4;
      };
   }

   public static String validationErrorString(final int result) {
      return switch (result) {
         case -17 -> "SPV_ERROR_FNVAR";
         case -16 -> "SPV_ERROR_WRONG_VERSION";
         case -15 -> "SPV_ERROR_MISSING_EXTENSION";
         case -14 -> "SPV_ERROR_INVALID_DATA";
         case -13 -> "SPV_ERROR_INVALID_CAPABILITY";
         case -12 -> "SPV_ERROR_INVALID_LAYOUT";
         case -11 -> "SPV_ERROR_INVALID_CFG";
         case -10 -> "SPV_ERROR_INVALID_ID";
         case -9 -> "SPV_ERROR_INVALID_LOOKUP";
         case -8 -> "SPV_ERROR_INVALID_DIAGNOSTIC";
         case -7 -> "SPV_ERROR_INVALID_VALUE";
         case -6 -> "SPV_ERROR_INVALID_TABLE";
         case -5 -> "SPV_ERROR_INVALID_TEXT";
         case -4 -> "SPV_ERROR_INVALID_BINARY";
         case -3 -> "SPV_ERROR_INVALID_POINTER";
         case -2 -> "SPV_ERROR_OUT_OF_MEMORY";
         case -1 -> "SPV_ERROR_INTERNAL";
         case 0 -> "SPV_SUCCESS";
         case 1 -> "SPV_UNSUPPORTED";
         case 2 -> "SPV_END_OF_STREAM";
         case 3 -> "SPV_WARNING";
         case 4 -> "SPV_FAILED_MATCH";
         case 5 -> "SPV_REQUESTED_TERMINATION";
         default -> "Unknown(" + result + ")";
      };
   }
}
