import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.platform.TextureUtil;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;

public class eva extends evd {
   public static final int a = 854;
   public static final int b = 480;
   static final eva.b l = new eva.b(854, 480);

   public eva(int $$0, int $$1) {
      super(true);
      RenderSystem.assertOnRenderThreadOrInit();
      if (!RenderSystem.isOnRenderThread()) {
         RenderSystem.recordRenderCall(() -> this.b($$0, $$1));
      } else {
         this.b($$0, $$1);
      }
   }

   private void b(int $$0, int $$1) {
      RenderSystem.assertOnRenderThreadOrInit();
      eva.b $$2 = this.c($$0, $$1);
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

   private eva.b c(int $$0, int $$1) {
      RenderSystem.assertOnRenderThreadOrInit();
      this.i = TextureUtil.generateTextureId();
      this.j = TextureUtil.generateTextureId();
      eva.a $$2 = eva.a.a;

      for (eva.b $$3 : eva.b.a($$0, $$1)) {
         $$2 = eva.a.a;
         if (this.a($$3)) {
            $$2 = $$2.a(eva.a.b);
         }

         if (this.b($$3)) {
            $$2 = $$2.a(eva.a.c);
         }

         if ($$2 == eva.a.d) {
            return $$3;
         }
      }

      throw new RuntimeException("Unrecoverable GL_OUT_OF_MEMORY (allocated attachments = " + $$2.name() + ")");
   }

   private boolean a(eva.b $$0) {
      RenderSystem.assertOnRenderThreadOrInit();
      GlStateManager._getError();
      GlStateManager._bindTexture(this.i);
      GlStateManager._texImage2D(3553, 0, 32856, $$0.a, $$0.b, 0, 6408, 5121, null);
      return GlStateManager._getError() != 1285;
   }

   private boolean b(eva.b $$0) {
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

      private static final eva.a[] e = values();

      eva.a a(eva.a $$0) {
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

      static List<eva.b> a(int $$0, int $$1) {
         RenderSystem.assertOnRenderThreadOrInit();
         int $$2 = RenderSystem.maxSupportedTextureSize();
         return $$0 > 0 && $$0 <= $$2 && $$1 > 0 && $$1 <= $$2 ? ImmutableList.of(new eva.b($$0, $$1), eva.l) : ImmutableList.of(eva.l);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            eva.b $$1 = (eva.b)$$0;
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
