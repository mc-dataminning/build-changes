import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import org.joml.Matrix4f;

public abstract class evz {
   private static final int a = 0;
   private static final int b = 1;
   private static final int l = 2;
   private static final int m = 3;
   public int c;
   public int d;
   public int e;
   public int f;
   public final boolean g;
   public int h;
   protected int i;
   protected int j;
   private final float[] n = ac.a(() -> new float[]{1.0F, 1.0F, 1.0F, 0.0F});
   public int k;

   public evz(boolean $$0) {
      this.g = $$0;
      this.h = -1;
      this.i = -1;
      this.j = -1;
   }

   public void a(int $$0, int $$1, boolean $$2) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.d($$0, $$1, $$2));
      } else {
         this.d($$0, $$1, $$2);
      }
   }

   private void d(int $$0, int $$1, boolean $$2) {
      RenderSystem.assertOnRenderThreadOrInit();
      GlStateManager._enableDepthTest();
      if (this.h >= 0) {
         this.a();
      }

      this.b($$0, $$1, $$2);
      GlStateManager._glBindFramebuffer(36160, 0);
   }

   public void a() {
      RenderSystem.assertOnRenderThreadOrInit();
      this.d();
      this.e();
      if (this.j > -1) {
         TextureUtil.releaseTextureId(this.j);
         this.j = -1;
      }

      if (this.i > -1) {
         TextureUtil.releaseTextureId(this.i);
         this.i = -1;
      }

      if (this.h > -1) {
         GlStateManager._glBindFramebuffer(36160, 0);
         GlStateManager._glDeleteFramebuffers(this.h);
         this.h = -1;
      }
   }

   public void a(evz $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      GlStateManager._glBindFramebuffer(36008, $$0.h);
      GlStateManager._glBindFramebuffer(36009, this.h);
      GlStateManager._glBlitFrameBuffer(0, 0, $$0.c, $$0.d, 0, 0, this.c, this.d, 256, 9728);
      GlStateManager._glBindFramebuffer(36160, 0);
   }

   public void b(int $$0, int $$1, boolean $$2) {
      RenderSystem.assertOnRenderThreadOrInit();
      int $$3 = RenderSystem.maxSupportedTextureSize();
      if ($$0 > 0 && $$0 <= $$3 && $$1 > 0 && $$1 <= $$3) {
         this.e = $$0;
         this.f = $$1;
         this.c = $$0;
         this.d = $$1;
         this.h = GlStateManager.glGenFramebuffers();
         this.i = TextureUtil.generateTextureId();
         if (this.g) {
            this.j = TextureUtil.generateTextureId();
            GlStateManager._bindTexture(this.j);
            GlStateManager._texParameter(3553, 10241, 9728);
            GlStateManager._texParameter(3553, 10240, 9728);
            GlStateManager._texParameter(3553, 34892, 0);
            GlStateManager._texParameter(3553, 10242, 33071);
            GlStateManager._texParameter(3553, 10243, 33071);
            GlStateManager._texImage2D(3553, 0, 6402, this.c, this.d, 0, 6402, 5126, null);
         }

         this.a(9728, true);
         GlStateManager._bindTexture(this.i);
         GlStateManager._texParameter(3553, 10242, 33071);
         GlStateManager._texParameter(3553, 10243, 33071);
         GlStateManager._texImage2D(3553, 0, 32856, this.c, this.d, 0, 6408, 5121, null);
         GlStateManager._glBindFramebuffer(36160, this.h);
         GlStateManager._glFramebufferTexture2D(36160, 36064, 3553, this.i, 0);
         if (this.g) {
            GlStateManager._glFramebufferTexture2D(36160, 36096, 3553, this.j, 0);
         }

         this.b();
         this.b($$2);
         this.d();
      } else {
         throw new IllegalArgumentException("Window " + $$0 + "x" + $$1 + " size out of bounds (max. size: " + $$3 + ")");
      }
   }

   public void a(int $$0) {
      this.a($$0, false);
   }

   private void a(int $$0, boolean $$1) {
      RenderSystem.assertOnRenderThreadOrInit();
      if ($$1 || $$0 != this.k) {
         this.k = $$0;
         GlStateManager._bindTexture(this.i);
         GlStateManager._texParameter(3553, 10241, $$0);
         GlStateManager._texParameter(3553, 10240, $$0);
         GlStateManager._bindTexture(0);
      }
   }

   public void b() {
      RenderSystem.assertOnRenderThreadOrInit();
      int $$0 = GlStateManager.glCheckFramebufferStatus(36160);
      if ($$0 != 36053) {
         if ($$0 == 36054) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT");
         } else if ($$0 == 36055) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT");
         } else if ($$0 == 36059) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_DRAW_BUFFER");
         } else if ($$0 == 36060) {
            throw new RuntimeException("GL_FRAMEBUFFER_INCOMPLETE_READ_BUFFER");
         } else if ($$0 == 36061) {
            throw new RuntimeException("GL_FRAMEBUFFER_UNSUPPORTED");
         } else if ($$0 == 1285) {
            throw new RuntimeException("GL_OUT_OF_MEMORY");
         } else {
            throw new RuntimeException("glCheckFramebufferStatus returned unknown status:" + $$0);
         }
      }
   }

   public void c() {
      RenderSystem.assertOnRenderThread();
      GlStateManager._bindTexture(this.i);
   }

   public void d() {
      RenderSystem.assertOnRenderThreadOrInit();
      GlStateManager._bindTexture(0);
   }

   public void a(boolean $$0) {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.c($$0));
      } else {
         this.c($$0);
      }
   }

   private void c(boolean $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      GlStateManager._glBindFramebuffer(36160, this.h);
      if ($$0) {
         GlStateManager._viewport(0, 0, this.e, this.f);
      }
   }

   public void e() {
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> GlStateManager._glBindFramebuffer(36160, 0));
      } else {
         GlStateManager._glBindFramebuffer(36160, 0);
      }
   }

   public void a(float $$0, float $$1, float $$2, float $$3) {
      this.n[0] = $$0;
      this.n[1] = $$1;
      this.n[2] = $$2;
      this.n[3] = $$3;
   }

   public void a(int $$0, int $$1) {
      this.c($$0, $$1, true);
   }

   public void c(int $$0, int $$1, boolean $$2) {
      RenderSystem.assertOnGameThreadOrInit();
      if (!RenderSystem.isInInitPhase()) {
         RenderSystem.recordRenderCall(() -> this.e($$0, $$1, $$2));
      } else {
         this.e($$0, $$1, $$2);
      }
   }

   private void e(int $$0, int $$1, boolean $$2) {
      RenderSystem.assertOnRenderThread();
      GlStateManager._colorMask(true, true, true, false);
      GlStateManager._disableDepthTest();
      GlStateManager._depthMask(false);
      GlStateManager._viewport(0, 0, $$0, $$1);
      if ($$2) {
         GlStateManager._disableBlend();
      }

      fcu $$3 = fcu.Q();
      gbs $$4 = $$3.j.d;
      $$4.a("DiffuseSampler", this.i);
      Matrix4f $$5 = new Matrix4f().setOrtho(0.0F, (float)$$0, (float)$$1, 0.0F, 1000.0F, 3000.0F);
      RenderSystem.setProjectionMatrix($$5, exv.b);
      if ($$4.b != null) {
         $$4.b.a(new Matrix4f().translation(0.0F, 0.0F, -2000.0F));
      }

      if ($$4.c != null) {
         $$4.c.a($$5);
      }

      $$4.g();
      float $$6 = (float)$$0;
      float $$7 = (float)$$1;
      float $$8 = (float)this.e / (float)this.c;
      float $$9 = (float)this.f / (float)this.d;
      exp $$10 = RenderSystem.renderThreadTesselator();
      exi $$11 = $$10.d();
      $$11.a(exs.b.h, exl.s);
      $$11.a(0.0, (double)$$7, 0.0).a(0.0F, 0.0F).a(255, 255, 255, 255).e();
      $$11.a((double)$$6, (double)$$7, 0.0).a($$8, 0.0F).a(255, 255, 255, 255).e();
      $$11.a((double)$$6, 0.0, 0.0).a($$8, $$9).a(255, 255, 255, 255).e();
      $$11.a(0.0, 0.0, 0.0).a(0.0F, $$9).a(255, 255, 255, 255).e();
      exj.b($$11.d());
      $$4.f();
      GlStateManager._depthMask(true);
      GlStateManager._colorMask(true, true, true, true);
   }

   public void b(boolean $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      this.a(true);
      GlStateManager._clearColor(this.n[0], this.n[1], this.n[2], this.n[3]);
      int $$1 = 16384;
      if (this.g) {
         GlStateManager._clearDepth(1.0);
         $$1 |= 256;
      }

      GlStateManager._clear($$1, $$0);
      this.e();
   }

   public int f() {
      return this.i;
   }

   public int g() {
      return this.j;
   }
}
