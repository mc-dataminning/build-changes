import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public abstract class fij {
   private static int a = 0;
   private static final int b = 0;
   private static final int m = 1;
   private static final int n = 2;
   private static final int o = 3;
   public int c;
   public int d;
   public int e;
   public int f;
   protected final String g;
   public final boolean h;
   public int i;
   @Nullable
   protected fjw j;
   @Nullable
   protected fjw k;
   private final float[] p = ag.a(() -> new float[]{1.0F, 1.0F, 1.0F, 0.0F});
   public fjv l;

   public fij(@Nullable String $$0, boolean $$1) {
      this.g = $$0 == null ? "FBO " + a++ : $$0;
      this.h = $$1;
      this.i = -1;
   }

   public void a(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();
      GlStateManager._enableDepthTest();
      if (this.i >= 0) {
         this.a();
      }

      this.b($$0, $$1);
      GlStateManager._glBindFramebuffer(36160, 0);
   }

   public void a() {
      RenderSystem.assertOnRenderThread();
      this.c();
      this.d();
      if (this.k != null) {
         this.k.close();
         this.k = null;
      }

      if (this.j != null) {
         this.j.close();
         this.j = null;
      }

      if (this.i > -1) {
         GlStateManager._glBindFramebuffer(36160, 0);
         GlStateManager._glDeleteFramebuffers(this.i);
         this.i = -1;
      }
   }

   public void a(fij $$0) {
      RenderSystem.assertOnRenderThread();
      GlStateManager._glBindFramebuffer(36008, $$0.i);
      GlStateManager._glBindFramebuffer(36009, this.i);
      GlStateManager._glBlitFrameBuffer(0, 0, $$0.c, $$0.d, 0, 0, this.c, this.d, 256, 9728);
      GlStateManager._glBindFramebuffer(36160, 0);
   }

   public void b(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();
      int $$2 = RenderSystem.maxSupportedTextureSize();
      if ($$0 > 0 && $$0 <= $$2 && $$1 > 0 && $$1 <= $$2) {
         this.e = $$0;
         this.f = $$1;
         this.c = $$0;
         this.d = $$1;
         this.i = GlStateManager.glGenFramebuffers();
         if (this.h) {
            this.k = new fjw(() -> this.g + " / Depth", fjx.c, $$0, $$1, 1);
            this.k.a(fjv.a, false);
            this.k.a(fju.b);
         }

         this.j = new fjw(() -> this.g + " / Color", fjx.a, $$0, $$1, 1);
         this.j.a(fju.b);
         this.a(fjv.a, true);
         GlStateManager._glBindFramebuffer(36160, this.i);
         GlStateManager._glFramebufferTexture2D(36160, 36064, 3553, this.j.d(), 0);
         if (this.h) {
            GlStateManager._glFramebufferTexture2D(36160, 36096, 3553, this.k.d(), 0);
         }

         this.b();
         this.f();
         this.c();
      } else {
         throw new IllegalArgumentException("Window " + $$0 + "x" + $$1 + " size out of bounds (max. size: " + $$2 + ")");
      }
   }

   public void a(fjv $$0) {
      this.a($$0, false);
   }

   private void a(fjv $$0, boolean $$1) {
      if (this.j == null) {
         throw new IllegalStateException("Can't change filter mode, color texture doesn't exist yet");
      } else {
         if ($$1 || $$0 != this.l) {
            this.l = $$0;
            this.j.a($$0, false);
         }
      }
   }

   public void b() {
      RenderSystem.assertOnRenderThread();
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
      GlStateManager._bindTexture(0);
   }

   public void a(boolean $$0) {
      RenderSystem.assertOnRenderThread();
      GlStateManager._glBindFramebuffer(36160, this.i);
      if ($$0) {
         GlStateManager._viewport(0, 0, this.e, this.f);
      }
   }

   public void d() {
      RenderSystem.assertOnRenderThread();
      GlStateManager._glBindFramebuffer(36160, 0);
   }

   public void a(float $$0, float $$1, float $$2, float $$3) {
      this.p[0] = $$0;
      this.p[1] = $$1;
      this.p[2] = $$2;
      this.p[3] = $$3;
   }

   public void c(int $$0, int $$1) {
      GlStateManager._glBindFramebuffer(36008, this.i);
      GlStateManager._glBlitFrameBuffer(0, 0, this.c, this.d, 0, 0, $$0, $$1, 16384, 9728);
      GlStateManager._glBindFramebuffer(36008, 0);
   }

   public void e() {
      RenderSystem.assertOnRenderThread();
      RenderSystem.getQuadVertices().a(grc.Q(), $$0 -> $$0.a("InSampler", this.j));
   }

   public void f() {
      this.b(this.p[0], this.p[1], this.p[2], this.p[3]);
   }

   public void b(float $$0, float $$1, float $$2, float $$3) {
      RenderSystem.assertOnRenderThread();
      this.a(true);
      GlStateManager._clearColor($$0, $$1, $$2, $$3);
      int $$4 = 16384;
      if (this.h) {
         GlStateManager._clearDepth(1.0);
         $$4 |= 256;
      }

      GlStateManager._clear($$4);
      this.d();
   }

   @Nullable
   public fjw g() {
      return this.j;
   }

   @Nullable
   public fjw h() {
      return this.k;
   }
}
