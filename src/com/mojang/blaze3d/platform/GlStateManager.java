package com.mojang.blaze3d.platform;

import com.google.common.base.Charsets;
import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.IntStream;
import javax.annotation.Nullable;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.lwjgl.PointerBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL20C;
import org.lwjgl.opengl.GL30;
import org.lwjgl.opengl.GL32C;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;

@eye
public class GlStateManager {
   private static final boolean ON_LINUX = ac.k() == ac.a.a;
   public static final int TEXTURE_COUNT = 12;
   private static final GlStateManager.a BLEND = new GlStateManager.a();
   private static final GlStateManager.f DEPTH = new GlStateManager.f();
   private static final GlStateManager.e CULL = new GlStateManager.e();
   private static final GlStateManager.h POLY_OFFSET = new GlStateManager.h();
   private static final GlStateManager.c COLOR_LOGIC = new GlStateManager.c();
   private static final GlStateManager.k STENCIL = new GlStateManager.k();
   private static final GlStateManager.i SCISSOR = new GlStateManager.i();
   private static int activeTexture;
   private static final GlStateManager.l[] TEXTURES = IntStream.range(0, 12).mapToObj($$0 -> new GlStateManager.l()).toArray(GlStateManager.l[]::new);
   private static final GlStateManager.d COLOR_MASK = new GlStateManager.d();

   public static void _disableScissorTest() {
      RenderSystem.assertOnRenderThreadOrInit();
      SCISSOR.a.a();
   }

   public static void _enableScissorTest() {
      RenderSystem.assertOnRenderThreadOrInit();
      SCISSOR.a.b();
   }

   public static void _scissorBox(int $$0, int $$1, int $$2, int $$3) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL20.glScissor($$0, $$1, $$2, $$3);
   }

   public static void _disableDepthTest() {
      RenderSystem.assertOnRenderThreadOrInit();
      DEPTH.a.a();
   }

   public static void _enableDepthTest() {
      RenderSystem.assertOnRenderThreadOrInit();
      DEPTH.a.b();
   }

   public static void _depthFunc(int $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      if ($$0 != DEPTH.c) {
         DEPTH.c = $$0;
         GL11.glDepthFunc($$0);
      }
   }

   public static void _depthMask(boolean $$0) {
      RenderSystem.assertOnRenderThread();
      if ($$0 != DEPTH.b) {
         DEPTH.b = $$0;
         GL11.glDepthMask($$0);
      }
   }

   public static void _disableBlend() {
      RenderSystem.assertOnRenderThread();
      BLEND.a.a();
   }

   public static void _enableBlend() {
      RenderSystem.assertOnRenderThread();
      BLEND.a.b();
   }

   public static void _blendFunc(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();
      if ($$0 != BLEND.b || $$1 != BLEND.c) {
         BLEND.b = $$0;
         BLEND.c = $$1;
         GL11.glBlendFunc($$0, $$1);
      }
   }

   public static void _blendFuncSeparate(int $$0, int $$1, int $$2, int $$3) {
      RenderSystem.assertOnRenderThread();
      if ($$0 != BLEND.b || $$1 != BLEND.c || $$2 != BLEND.d || $$3 != BLEND.e) {
         BLEND.b = $$0;
         BLEND.c = $$1;
         BLEND.d = $$2;
         BLEND.e = $$3;
         glBlendFuncSeparate($$0, $$1, $$2, $$3);
      }
   }

   public static void _blendEquation(int $$0) {
      RenderSystem.assertOnRenderThread();
      GL14.glBlendEquation($$0);
   }

   public static int glGetProgrami(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();
      return GL20.glGetProgrami($$0, $$1);
   }

   public static void glAttachShader(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();
      GL20.glAttachShader($$0, $$1);
   }

   public static void glDeleteShader(int $$0) {
      RenderSystem.assertOnRenderThread();
      GL20.glDeleteShader($$0);
   }

   public static int glCreateShader(int $$0) {
      RenderSystem.assertOnRenderThread();
      return GL20.glCreateShader($$0);
   }

   public static void glShaderSource(int $$0, List<String> $$1) {
      RenderSystem.assertOnRenderThread();
      StringBuilder $$2 = new StringBuilder();

      for (String $$3 : $$1) {
         $$2.append($$3);
      }

      byte[] $$4 = $$2.toString().getBytes(Charsets.UTF_8);
      ByteBuffer $$5 = MemoryUtil.memAlloc($$4.length + 1);
      $$5.put($$4);
      $$5.put((byte)0);
      $$5.flip();

      try {
         MemoryStack $$6 = MemoryStack.stackPush();

         try {
            PointerBuffer $$7 = $$6.mallocPointer(1);
            $$7.put($$5);
            GL20C.nglShaderSource($$0, 1, $$7.address0(), 0L);
         } catch (Throwable var13) {
            if ($$6 != null) {
               try {
                  $$6.close();
               } catch (Throwable var12) {
                  var13.addSuppressed(var12);
               }
            }

            throw var13;
         }

         if ($$6 != null) {
            $$6.close();
         }
      } finally {
         MemoryUtil.memFree($$5);
      }
   }

   public static void glCompileShader(int $$0) {
      RenderSystem.assertOnRenderThread();
      GL20.glCompileShader($$0);
   }

   public static int glGetShaderi(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();
      return GL20.glGetShaderi($$0, $$1);
   }

   public static void _glUseProgram(int $$0) {
      RenderSystem.assertOnRenderThread();
      GL20.glUseProgram($$0);
   }

   public static int glCreateProgram() {
      RenderSystem.assertOnRenderThread();
      return GL20.glCreateProgram();
   }

   public static void glDeleteProgram(int $$0) {
      RenderSystem.assertOnRenderThread();
      GL20.glDeleteProgram($$0);
   }

   public static void glLinkProgram(int $$0) {
      RenderSystem.assertOnRenderThread();
      GL20.glLinkProgram($$0);
   }

   public static int _glGetUniformLocation(int $$0, CharSequence $$1) {
      RenderSystem.assertOnRenderThread();
      return GL20.glGetUniformLocation($$0, $$1);
   }

   public static void _glUniform1(int $$0, IntBuffer $$1) {
      RenderSystem.assertOnRenderThread();
      GL20.glUniform1iv($$0, $$1);
   }

   public static void _glUniform1i(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();
      GL20.glUniform1i($$0, $$1);
   }

   public static void _glUniform1(int $$0, FloatBuffer $$1) {
      RenderSystem.assertOnRenderThread();
      GL20.glUniform1fv($$0, $$1);
   }

   public static void _glUniform2(int $$0, IntBuffer $$1) {
      RenderSystem.assertOnRenderThread();
      GL20.glUniform2iv($$0, $$1);
   }

   public static void _glUniform2(int $$0, FloatBuffer $$1) {
      RenderSystem.assertOnRenderThread();
      GL20.glUniform2fv($$0, $$1);
   }

   public static void _glUniform3(int $$0, IntBuffer $$1) {
      RenderSystem.assertOnRenderThread();
      GL20.glUniform3iv($$0, $$1);
   }

   public static void _glUniform3(int $$0, FloatBuffer $$1) {
      RenderSystem.assertOnRenderThread();
      GL20.glUniform3fv($$0, $$1);
   }

   public static void _glUniform4(int $$0, IntBuffer $$1) {
      RenderSystem.assertOnRenderThread();
      GL20.glUniform4iv($$0, $$1);
   }

   public static void _glUniform4(int $$0, FloatBuffer $$1) {
      RenderSystem.assertOnRenderThread();
      GL20.glUniform4fv($$0, $$1);
   }

   public static void _glUniformMatrix2(int $$0, boolean $$1, FloatBuffer $$2) {
      RenderSystem.assertOnRenderThread();
      GL20.glUniformMatrix2fv($$0, $$1, $$2);
   }

   public static void _glUniformMatrix3(int $$0, boolean $$1, FloatBuffer $$2) {
      RenderSystem.assertOnRenderThread();
      GL20.glUniformMatrix3fv($$0, $$1, $$2);
   }

   public static void _glUniformMatrix4(int $$0, boolean $$1, FloatBuffer $$2) {
      RenderSystem.assertOnRenderThread();
      GL20.glUniformMatrix4fv($$0, $$1, $$2);
   }

   public static int _glGetAttribLocation(int $$0, CharSequence $$1) {
      RenderSystem.assertOnRenderThread();
      return GL20.glGetAttribLocation($$0, $$1);
   }

   public static void _glBindAttribLocation(int $$0, int $$1, CharSequence $$2) {
      RenderSystem.assertOnRenderThread();
      GL20.glBindAttribLocation($$0, $$1, $$2);
   }

   public static int _glGenBuffers() {
      RenderSystem.assertOnRenderThreadOrInit();
      return GL15.glGenBuffers();
   }

   public static int _glGenVertexArrays() {
      RenderSystem.assertOnRenderThreadOrInit();
      return GL30.glGenVertexArrays();
   }

   public static void _glBindBuffer(int $$0, int $$1) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL15.glBindBuffer($$0, $$1);
   }

   public static void _glBindVertexArray(int $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL30.glBindVertexArray($$0);
   }

   public static void _glBufferData(int $$0, ByteBuffer $$1, int $$2) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL15.glBufferData($$0, $$1, $$2);
   }

   public static void _glBufferData(int $$0, long $$1, int $$2) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL15.glBufferData($$0, $$1, $$2);
   }

   @Nullable
   public static ByteBuffer _glMapBuffer(int $$0, int $$1) {
      RenderSystem.assertOnRenderThreadOrInit();
      return GL15.glMapBuffer($$0, $$1);
   }

   public static void _glUnmapBuffer(int $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL15.glUnmapBuffer($$0);
   }

   public static void _glDeleteBuffers(int $$0) {
      RenderSystem.assertOnRenderThread();
      if (ON_LINUX) {
         GL32C.glBindBuffer(34962, $$0);
         GL32C.glBufferData(34962, 0L, 35048);
         GL32C.glBindBuffer(34962, 0);
      }

      GL15.glDeleteBuffers($$0);
   }

   public static void _glCopyTexSubImage2D(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL20.glCopyTexSubImage2D($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public static void _glDeleteVertexArrays(int $$0) {
      RenderSystem.assertOnRenderThread();
      GL30.glDeleteVertexArrays($$0);
   }

   public static void _glBindFramebuffer(int $$0, int $$1) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL30.glBindFramebuffer($$0, $$1);
   }

   public static void _glBlitFrameBuffer(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL30.glBlitFramebuffer($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8, $$9);
   }

   public static void _glBindRenderbuffer(int $$0, int $$1) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL30.glBindRenderbuffer($$0, $$1);
   }

   public static void _glDeleteRenderbuffers(int $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL30.glDeleteRenderbuffers($$0);
   }

   public static void _glDeleteFramebuffers(int $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL30.glDeleteFramebuffers($$0);
   }

   public static int glGenFramebuffers() {
      RenderSystem.assertOnRenderThreadOrInit();
      return GL30.glGenFramebuffers();
   }

   public static int glGenRenderbuffers() {
      RenderSystem.assertOnRenderThreadOrInit();
      return GL30.glGenRenderbuffers();
   }

   public static void _glRenderbufferStorage(int $$0, int $$1, int $$2, int $$3) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL30.glRenderbufferStorage($$0, $$1, $$2, $$3);
   }

   public static void _glFramebufferRenderbuffer(int $$0, int $$1, int $$2, int $$3) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL30.glFramebufferRenderbuffer($$0, $$1, $$2, $$3);
   }

   public static int glCheckFramebufferStatus(int $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      return GL30.glCheckFramebufferStatus($$0);
   }

   public static void _glFramebufferTexture2D(int $$0, int $$1, int $$2, int $$3, int $$4) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL30.glFramebufferTexture2D($$0, $$1, $$2, $$3, $$4);
   }

   public static int getBoundFramebuffer() {
      RenderSystem.assertOnRenderThread();
      return _getInteger(36006);
   }

   public static void glActiveTexture(int $$0) {
      RenderSystem.assertOnRenderThread();
      GL13.glActiveTexture($$0);
   }

   public static void glBlendFuncSeparate(int $$0, int $$1, int $$2, int $$3) {
      RenderSystem.assertOnRenderThread();
      GL14.glBlendFuncSeparate($$0, $$1, $$2, $$3);
   }

   public static String glGetShaderInfoLog(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();
      return GL20.glGetShaderInfoLog($$0, $$1);
   }

   public static String glGetProgramInfoLog(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();
      return GL20.glGetProgramInfoLog($$0, $$1);
   }

   public static void setupLevelDiffuseLighting(Vector3f $$0, Vector3f $$1, Matrix4f $$2) {
      RenderSystem.assertOnRenderThread();
      RenderSystem.setShaderLights($$2.transformDirection($$0, new Vector3f()), $$2.transformDirection($$1, new Vector3f()));
   }

   public static void setupGuiFlatDiffuseLighting(Vector3f $$0, Vector3f $$1) {
      RenderSystem.assertOnRenderThread();
      Matrix4f $$2 = new Matrix4f().rotationY((float) (-Math.PI / 8)).rotateX((float) (Math.PI * 3.0 / 4.0));
      setupLevelDiffuseLighting($$0, $$1, $$2);
   }

   public static void setupGui3DDiffuseLighting(Vector3f $$0, Vector3f $$1) {
      RenderSystem.assertOnRenderThread();
      Matrix4f $$2 = new Matrix4f()
         .scaling(1.0F, -1.0F, 1.0F)
         .rotateYXZ(1.0821041F, 3.2375858F, 0.0F)
         .rotateYXZ((float) (-Math.PI / 8), (float) (Math.PI * 3.0 / 4.0), 0.0F);
      setupLevelDiffuseLighting($$0, $$1, $$2);
   }

   public static void _enableCull() {
      RenderSystem.assertOnRenderThread();
      CULL.a.b();
   }

   public static void _disableCull() {
      RenderSystem.assertOnRenderThread();
      CULL.a.a();
   }

   public static void _polygonMode(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();
      GL11.glPolygonMode($$0, $$1);
   }

   public static void _enablePolygonOffset() {
      RenderSystem.assertOnRenderThread();
      POLY_OFFSET.a.b();
   }

   public static void _disablePolygonOffset() {
      RenderSystem.assertOnRenderThread();
      POLY_OFFSET.a.a();
   }

   public static void _polygonOffset(float $$0, float $$1) {
      RenderSystem.assertOnRenderThread();
      if ($$0 != POLY_OFFSET.c || $$1 != POLY_OFFSET.d) {
         POLY_OFFSET.c = $$0;
         POLY_OFFSET.d = $$1;
         GL11.glPolygonOffset($$0, $$1);
      }
   }

   public static void _enableColorLogicOp() {
      RenderSystem.assertOnRenderThread();
      COLOR_LOGIC.a.b();
   }

   public static void _disableColorLogicOp() {
      RenderSystem.assertOnRenderThread();
      COLOR_LOGIC.a.a();
   }

   public static void _logicOp(int $$0) {
      RenderSystem.assertOnRenderThread();
      if ($$0 != COLOR_LOGIC.b) {
         COLOR_LOGIC.b = $$0;
         GL11.glLogicOp($$0);
      }
   }

   public static void _activeTexture(int $$0) {
      RenderSystem.assertOnRenderThread();
      if (activeTexture != $$0 - 33984) {
         activeTexture = $$0 - 33984;
         glActiveTexture($$0);
      }
   }

   public static void _texParameter(int $$0, int $$1, float $$2) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL11.glTexParameterf($$0, $$1, $$2);
   }

   public static void _texParameter(int $$0, int $$1, int $$2) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL11.glTexParameteri($$0, $$1, $$2);
   }

   public static int _getTexLevelParameter(int $$0, int $$1, int $$2) {
      RenderSystem.assertInInitPhase();
      return GL11.glGetTexLevelParameteri($$0, $$1, $$2);
   }

   public static int _genTexture() {
      RenderSystem.assertOnRenderThreadOrInit();
      return GL11.glGenTextures();
   }

   public static void _genTextures(int[] $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL11.glGenTextures($$0);
   }

   public static void _deleteTexture(int $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL11.glDeleteTextures($$0);

      for (GlStateManager.l $$1 : TEXTURES) {
         if ($$1.a == $$0) {
            $$1.a = -1;
         }
      }
   }

   public static void _deleteTextures(int[] $$0) {
      RenderSystem.assertOnRenderThreadOrInit();

      for (GlStateManager.l $$1 : TEXTURES) {
         for (int $$2 : $$0) {
            if ($$1.a == $$2) {
               $$1.a = -1;
            }
         }
      }

      GL11.glDeleteTextures($$0);
   }

   public static void _bindTexture(int $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      if ($$0 != TEXTURES[activeTexture].a) {
         TEXTURES[activeTexture].a = $$0;
         GL11.glBindTexture(3553, $$0);
      }
   }

   public static int _getActiveTexture() {
      return activeTexture + 33984;
   }

   public static void _texImage2D(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, @Nullable IntBuffer $$8) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL11.glTexImage2D($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public static void _texSubImage2D(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, long $$8) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL11.glTexSubImage2D($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7, $$8);
   }

   public static void upload(int $$0, int $$1, int $$2, int $$3, int $$4, ezn.a $$5, IntBuffer $$6, Consumer<IntBuffer> $$7) {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> _upload($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7));
      } else {
         _upload($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }

   private static void _upload(int $$0, int $$1, int $$2, int $$3, int $$4, ezn.a $$5, IntBuffer $$6, Consumer<IntBuffer> $$7) {
      try {
         RenderSystem.assertOnRenderThreadOrInit();
         _pixelStore(3314, $$3);
         _pixelStore(3316, 0);
         _pixelStore(3315, 0);
         $$5.c();
         GL11.glTexSubImage2D(3553, $$0, $$1, $$2, $$3, $$4, $$5.d(), 5121, $$6);
      } finally {
         $$7.accept($$6);
      }
   }

   public static void _getTexImage(int $$0, int $$1, int $$2, int $$3, long $$4) {
      RenderSystem.assertOnRenderThread();
      GL11.glGetTexImage($$0, $$1, $$2, $$3, $$4);
   }

   public static void _viewport(int $$0, int $$1, int $$2, int $$3) {
      RenderSystem.assertOnRenderThreadOrInit();
      GlStateManager.m.a.b = $$0;
      GlStateManager.m.a.c = $$1;
      GlStateManager.m.a.d = $$2;
      GlStateManager.m.a.e = $$3;
      GL11.glViewport($$0, $$1, $$2, $$3);
   }

   public static void _colorMask(boolean $$0, boolean $$1, boolean $$2, boolean $$3) {
      RenderSystem.assertOnRenderThread();
      if ($$0 != COLOR_MASK.a || $$1 != COLOR_MASK.b || $$2 != COLOR_MASK.c || $$3 != COLOR_MASK.d) {
         COLOR_MASK.a = $$0;
         COLOR_MASK.b = $$1;
         COLOR_MASK.c = $$2;
         COLOR_MASK.d = $$3;
         GL11.glColorMask($$0, $$1, $$2, $$3);
      }
   }

   public static void _stencilFunc(int $$0, int $$1, int $$2) {
      RenderSystem.assertOnRenderThread();
      if ($$0 != STENCIL.a.a || $$0 != STENCIL.a.b || $$0 != STENCIL.a.c) {
         STENCIL.a.a = $$0;
         STENCIL.a.b = $$1;
         STENCIL.a.c = $$2;
         GL11.glStencilFunc($$0, $$1, $$2);
      }
   }

   public static void _stencilMask(int $$0) {
      RenderSystem.assertOnRenderThread();
      if ($$0 != STENCIL.b) {
         STENCIL.b = $$0;
         GL11.glStencilMask($$0);
      }
   }

   public static void _stencilOp(int $$0, int $$1, int $$2) {
      RenderSystem.assertOnRenderThread();
      if ($$0 != STENCIL.c || $$1 != STENCIL.d || $$2 != STENCIL.e) {
         STENCIL.c = $$0;
         STENCIL.d = $$1;
         STENCIL.e = $$2;
         GL11.glStencilOp($$0, $$1, $$2);
      }
   }

   public static void _clearDepth(double $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL11.glClearDepth($$0);
   }

   public static void _clearColor(float $$0, float $$1, float $$2, float $$3) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL11.glClearColor($$0, $$1, $$2, $$3);
   }

   public static void _clearStencil(int $$0) {
      RenderSystem.assertOnRenderThread();
      GL11.glClearStencil($$0);
   }

   public static void _clear(int $$0, boolean $$1) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL11.glClear($$0);
      if ($$1) {
         _getError();
      }
   }

   public static void _glDrawPixels(int $$0, int $$1, int $$2, int $$3, long $$4) {
      RenderSystem.assertOnRenderThread();
      GL11.glDrawPixels($$0, $$1, $$2, $$3, $$4);
   }

   public static void _vertexAttribPointer(int $$0, int $$1, int $$2, boolean $$3, int $$4, long $$5) {
      RenderSystem.assertOnRenderThread();
      GL20.glVertexAttribPointer($$0, $$1, $$2, $$3, $$4, $$5);
   }

   public static void _vertexAttribIPointer(int $$0, int $$1, int $$2, int $$3, long $$4) {
      RenderSystem.assertOnRenderThread();
      GL30.glVertexAttribIPointer($$0, $$1, $$2, $$3, $$4);
   }

   public static void _enableVertexAttribArray(int $$0) {
      RenderSystem.assertOnRenderThread();
      GL20.glEnableVertexAttribArray($$0);
   }

   public static void _disableVertexAttribArray(int $$0) {
      RenderSystem.assertOnRenderThread();
      GL20.glDisableVertexAttribArray($$0);
   }

   public static void _drawElements(int $$0, int $$1, int $$2, long $$3) {
      RenderSystem.assertOnRenderThread();
      GL11.glDrawElements($$0, $$1, $$2, $$3);
   }

   public static void _pixelStore(int $$0, int $$1) {
      RenderSystem.assertOnRenderThreadOrInit();
      GL11.glPixelStorei($$0, $$1);
   }

   public static void _readPixels(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, ByteBuffer $$6) {
      RenderSystem.assertOnRenderThread();
      GL11.glReadPixels($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static void _readPixels(int $$0, int $$1, int $$2, int $$3, int $$4, int $$5, long $$6) {
      RenderSystem.assertOnRenderThread();
      GL11.glReadPixels($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   public static int _getError() {
      RenderSystem.assertOnRenderThread();
      return GL11.glGetError();
   }

   public static String _getString(int $$0) {
      RenderSystem.assertOnRenderThread();
      return GL11.glGetString($$0);
   }

   public static int _getInteger(int $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      return GL11.glGetInteger($$0);
   }

   @eye
   public static enum DestFactor {
      CONSTANT_ALPHA(32771),
      CONSTANT_COLOR(32769),
      DST_ALPHA(772),
      DST_COLOR(774),
      ONE(1),
      ONE_MINUS_CONSTANT_ALPHA(32772),
      ONE_MINUS_CONSTANT_COLOR(32770),
      ONE_MINUS_DST_ALPHA(773),
      ONE_MINUS_DST_COLOR(775),
      ONE_MINUS_SRC_ALPHA(771),
      ONE_MINUS_SRC_COLOR(769),
      SRC_ALPHA(770),
      SRC_COLOR(768),
      ZERO(0);

      public final int value;

      private DestFactor(final int $$0) {
         this.value = $$0;
      }
   }

   @eye
   public static enum SourceFactor {
      CONSTANT_ALPHA(32771),
      CONSTANT_COLOR(32769),
      DST_ALPHA(772),
      DST_COLOR(774),
      ONE(1),
      ONE_MINUS_CONSTANT_ALPHA(32772),
      ONE_MINUS_CONSTANT_COLOR(32770),
      ONE_MINUS_DST_ALPHA(773),
      ONE_MINUS_DST_COLOR(775),
      ONE_MINUS_SRC_ALPHA(771),
      ONE_MINUS_SRC_COLOR(769),
      SRC_ALPHA(770),
      SRC_ALPHA_SATURATE(776),
      SRC_COLOR(768),
      ZERO(0);

      public final int value;

      private SourceFactor(final int $$0) {
         this.value = $$0;
      }
   }

   static class a {
      public final GlStateManager.b a = new GlStateManager.b(3042);
      public int b = 1;
      public int c = 0;
      public int d = 1;
      public int e = 0;
   }

   static class b {
      private final int a;
      private boolean b;

      public b(int $$0) {
         this.a = $$0;
      }

      public void a() {
         this.a(false);
      }

      public void b() {
         this.a(true);
      }

      public void a(boolean $$0) {
         RenderSystem.assertOnRenderThreadOrInit();
         if ($$0 != this.b) {
            this.b = $$0;
            if ($$0) {
               GL11.glEnable(this.a);
            } else {
               GL11.glDisable(this.a);
            }
         }
      }
   }

   static class c {
      public final GlStateManager.b a = new GlStateManager.b(3058);
      public int b = 5379;
   }

   static class d {
      public boolean a = true;
      public boolean b = true;
      public boolean c = true;
      public boolean d = true;
   }

   static class e {
      public final GlStateManager.b a = new GlStateManager.b(2884);
      public int b = 1029;
   }

   static class f {
      public final GlStateManager.b a = new GlStateManager.b(2929);
      public boolean b = true;
      public int c = 513;
   }

   public static enum g {
      a(5377),
      b(5380),
      c(5378),
      d(5376),
      e(5379),
      f(5388),
      g(5385),
      h(5386),
      i(5390),
      j(5381),
      k(5384),
      l(5383),
      m(5389),
      n(5387),
      o(5391),
      p(5382);

      public final int q;

      private g(final int $$0) {
         this.q = $$0;
      }
   }

   static class h {
      public final GlStateManager.b a = new GlStateManager.b(32823);
      public final GlStateManager.b b = new GlStateManager.b(10754);
      public float c;
      public float d;
   }

   static class i {
      public final GlStateManager.b a = new GlStateManager.b(3089);
   }

   static class j {
      public int a = 519;
      public int b;
      public int c = -1;
   }

   static class k {
      public final GlStateManager.j a = new GlStateManager.j();
      public int b = -1;
      public int c = 7680;
      public int d = 7680;
      public int e = 7680;
   }

   static class l {
      public int a;
   }

   public static enum m {
      a;

      protected int b;
      protected int c;
      protected int d;
      protected int e;

      public static int a() {
         return a.b;
      }

      public static int b() {
         return a.c;
      }

      public static int c() {
         return a.d;
      }

      public static int d() {
         return a.e;
      }
   }
}
