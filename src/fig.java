import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class fig extends fij {
   public static final int a = 854;
   public static final int b = 480;
   static final fig.a m = new fig.a(854, 480);

   public fig(int $$0, int $$1) {
      super("Main", true);
      this.d($$0, $$1);
   }

   private void d(int $$0, int $$1) {
      fig.a $$2 = this.e($$0, $$1);
      if (this.j != null && this.k != null) {
         this.i = GlStateManager.glGenFramebuffers();
         GlStateManager._glBindFramebuffer(36160, this.i);
         this.j.a(fjv.a, false);
         this.j.a(fju.b);
         GlStateManager._glFramebufferTexture2D(36160, 36064, 3553, this.j.d(), 0);
         this.j.a(fjv.a, false);
         this.j.a(fju.b);
         GlStateManager._glFramebufferTexture2D(36160, 36096, 3553, this.k.d(), 0);
         GlStateManager._bindTexture(0);
         this.e = $$2.a;
         this.f = $$2.b;
         this.c = $$2.a;
         this.d = $$2.b;
         this.b();
         GlStateManager._glBindFramebuffer(36160, 0);
      } else {
         throw new IllegalStateException("Missing color and/or depth textures");
      }
   }

   private fig.a e(int $$0, int $$1) {
      RenderSystem.assertOnRenderThread();

      for (fig.a $$2 : fig.a.a($$0, $$1)) {
         if (this.j != null) {
            this.j.close();
            this.j = null;
         }

         if (this.k != null) {
            this.k.close();
            this.k = null;
         }

         this.j = this.a($$2);
         this.k = this.b($$2);
         if (this.j != null && this.k != null) {
            return $$2;
         }
      }

      throw new RuntimeException(
         "Unrecoverable GL_OUT_OF_MEMORY ("
            + (this.j == null ? "missing color" : "have color")
            + ", "
            + (this.k == null ? "missing depth" : "have depth")
            + ")"
      );
   }

   @Nullable
   private fjw a(fig.a $$0) {
      RenderSystem.assertOnRenderThread();
      GlStateManager._getError();

      try {
         return new fjw(() -> this.g + " / Color", fjx.a, $$0.a, $$0.b, 1);
      } catch (fhe var3) {
         return null;
      }
   }

   @Nullable
   private fjw b(fig.a $$0) {
      RenderSystem.assertOnRenderThread();
      GlStateManager._getError();

      try {
         return new fjw(() -> this.g + " / Depth", fjx.c, $$0.a, $$0.b, 1);
      } catch (fhe var3) {
         return null;
      }
   }

   static class a {
      public final int a;
      public final int b;

      a(int $$0, int $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      static List<fig.a> a(int $$0, int $$1) {
         RenderSystem.assertOnRenderThread();
         int $$2 = RenderSystem.maxSupportedTextureSize();
         return $$0 > 0 && $$0 <= $$2 && $$1 > 0 && $$1 <= $$2 ? ImmutableList.of(new fig.a($$0, $$1), fig.m) : ImmutableList.of(fig.m);
      }

      @Override
      public boolean equals(Object $$0) {
         if (this == $$0) {
            return true;
         } else if ($$0 != null && this.getClass() == $$0.getClass()) {
            fig.a $$1 = (fig.a)$$0;
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
