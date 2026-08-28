import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;

public class fey extends ffa {
   public static final int a = 854;
   public static final int b = 480;
   static final fey.b l = new fey.b(854, 480);

   public fey(int $$0, int $$1) {
      super(true);
      this.e($$0, $$1);
   }

   private void e(int $$0, int $$1) {
      fey.b $$2 = this.f($$0, $$1);
      this.h = GlStateManager.glGenFramebuffers();
      GlStateManager._glBindFramebuffer(36160, this.h);
      GlStateManager._bindTexture(this.i);
      GlStateManager._texParameter(3553, 10241, 9728);
      GlStateManager._texParameter(3553, 10240, 9728);
      GlStateManager._texParameter(3553, 10242, 33071);
      GlStateManager._texParameter(3553, 10243, 33071);
      GlStateManager._glFramebufferTexture2D(36160, 36064, 3553, this.i, 0);
      GlStateManager._bindTexture(this.j);
      GlStateManager._texParameter(3553, 34892, 0);
      GlStateManager._texParameter(3553, 10241, 9728);
      GlStateManager._texParameter(3553, 10240, 9728);
      GlStateManager._texParameter(3553, 10242, 33071);
      GlStateManager._texParameter(3553, 10243, 33071);
      GlStateManager._glFramebufferTexture2D(36160, 36096, 3553, this.j, 0);
      GlStateManager._bindTexture(0);
      this.e = $$2.a;
      this.f = $$2.b;
      this.c = $$2.a;
      this.d = $$2.b;
      this.b();
      GlStateManager._glBindFramebuffer(36160, 0);
   }

   private fey.b f(int $$0, int $$1) {
      RenderSystem.assertOnRenderThreadOrInit();
      this.i = TextureUtil.generateTextureId();
      this.j = TextureUtil.generateTextureId();
      fey.a $$2 = fey.a.a;

      for (fey.b $$3 : fey.b.a($$0, $$1)) {
         $$2 = fey.a.a;
         if (this.a($$3)) {
            $$2 = $$2.a(fey.a.b);
         }

         if (this.b($$3)) {
            $$2 = $$2.a(fey.a.c);
         }

         if ($$2 == fey.a.d) {
            return $$3;
         }
      }

      throw new RuntimeException("Unrecoverable GL_OUT_OF_MEMORY (allocated attachments = " + $$2.name() + ")");
   }

   private boolean a(fey.b $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      GlStateManager._getError();
      GlStateManager._bindTexture(this.i);
      GlStateManager._texImage2D(3553, 0, 32856, $$0.a, $$0.b, 0, 6408, 5121, null);
      return GlStateManager._getError() != 1285;
   }

   private boolean b(fey.b $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      GlStateManager._getError();
      GlStateManager._bindTexture(this.j);
      GlStateManager._texImage2D(3553, 0, 6402, $$0.a, $$0.b, 0, 6402, 5126, null);
      return GlStateManager._getError() != 1285;
   }

   static enum a {
      a,
      b,
      c,
      d;

      private static final fey.a[] e = values();

      fey.a a(fey.a $$0) {
         return e[this.ordinal() | $$0.ordinal()];
      }
   }

   static class b {
      public final int a;
      public final int b;

      b(int $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      static List<fey.b> a(int $$0, int $$1) {
         RenderSystem.assertOnRenderThreadOrInit();
         int $$2 = RenderSystem.maxSupportedTextureSize();
         return $$0 > 0 && $$0 <= $$2 && $$1 > 0 && $$1 <= $$2 ? ImmutableList.of(new fey.b($$0, $$1), fey.l) : ImmutableList.of(fey.l);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            fey.b $$1 = (fey.b)$$0;
            return this.a == $$1.a && this.b == $$1.b;
         } else {
            return false;
         }
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.a, this.b);
      }

      @Override
      public String toString() {
         return this.a + "x" + this.b;
      }
   }
}
