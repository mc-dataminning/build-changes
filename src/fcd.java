import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.Objects;

public abstract class fcd {
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
   private final float[] n = ad.a(() -> new float[]{1.0F, 1.0F, 1.0F, 0.0F});
   public int k;

   public fcd(boolean $$0) {
      this.g = $$0;
      this.h = -1;
      this.i = -1;
      this.j = -1;
   }

   public void a(int $$0, int $$1) {
      RenderSystem.assertOnRenderThreadOrInit();
      GlStateManager._enableDepthTest();
      if (this.h >= 0) {
         this.a();
      }

      this.b($$0, $$1);
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

   public void a(fcd $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      GlStateManager._glBindFramebuffer(36008, $$0.h);
      GlStateManager._glBindFramebuffer(36009, this.h);
      GlStateManager._glBlitFrameBuffer(0, 0, $$0.c, $$0.d, 0, 0, this.c, this.d, 256, 9728);
      GlStateManager._glBindFramebuffer(36160, 0);
   }

   public void b(int $$0, int $$1) {
      RenderSystem.assertOnRenderThreadOrInit();
      int $$2 = RenderSystem.maxSupportedTextureSize();
      if ($$0 > 0 && $$0 <= $$2 && $$1 > 0 && $$1 <= $$2) {
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
         this.f();
         this.d();
      } else {
         throw new IllegalArgumentException("Window " + $$0 + "x" + $$1 + " size out of bounds (max. size: " + $$2 + ")");
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
      RenderSystem.assertOnRenderThreadOrInit();
      GlStateManager._glBindFramebuffer(36160, this.h);
      if ($$0) {
         GlStateManager._viewport(0, 0, this.e, this.f);
      }
   }

   public void e() {
      RenderSystem.assertOnRenderThreadOrInit();
      GlStateManager._glBindFramebuffer(36160, 0);
   }

   public void a(float $$0, float $$1, float $$2, float $$3) {
      this.n[0] = $$0;
      this.n[1] = $$1;
      this.n[2] = $$2;
      this.n[3] = $$3;
   }

   public void c(int $$0, int $$1) {
      GlStateManager._glBindFramebuffer(36008, this.h);
      GlStateManager._glBlitFrameBuffer(0, 0, this.c, this.d, 0, 0, $$0, $$1, 16384, 9728);
      GlStateManager._glBindFramebuffer(36008, 0);
   }

   public void d(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();
      GlStateManager._colorMask(true, true, true, false);
      GlStateManager._disableDepthTest();
      GlStateManager._depthMask(false);
      GlStateManager._viewport(0, 0, $$0, $$1);
      ghf $$2 = Objects.requireNonNull(RenderSystem.setShader(ghg.a), "Blit shader not loaded");
      $$2.a("InSampler", this.i);
      fdo $$3 = RenderSystem.renderThreadTesselator().a(fdy.c.h, fdr.a);
      $$3.a(0.0F, 0.0F, 0.0F);
      $$3.a(1.0F, 0.0F, 0.0F);
      $$3.a(1.0F, 1.0F, 0.0F);
      $$3.a(0.0F, 1.0F, 0.0F);
      fdp.a($$3.b());
      GlStateManager._depthMask(true);
      GlStateManager._colorMask(true, true, true, true);
   }

   public void f() {
      RenderSystem.assertOnRenderThreadOrInit();
      this.a(true);
      GlStateManager._clearColor(this.n[0], this.n[1], this.n[2], this.n[3]);
      int $$0 = 16384;
      if (this.g) {
         GlStateManager._clearDepth(1.0);
         $$0 |= 256;
      }

      GlStateManager._clear($$0);
      this.e();
   }

   public int g() {
      return this.i;
   }

   public int h() {
      return this.j;
   }
}
