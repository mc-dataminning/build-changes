import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fak {
   @Nullable
   private static far a;

   public static void a() {
      if (a != null) {
         b();
         far.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(faj.b $$0) {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> c($$0));
      } else {
         c($$0);
      }
   }

   private static void c(faj.b $$0) {
      far $$1 = d($$0);
      if ($$1 != null) {
         $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
      }
   }

   public static void b(faj.b $$0) {
      far $$1 = d($$0);
      if ($$1 != null) {
         $$1.c();
      }
   }

   @Nullable
   private static far d(faj.b $$0) {
      RenderSystem.assertOnRenderThread();
      if ($$0.d()) {
         $$0.e();
         return null;
      } else {
         far $$1 = a($$0.c().g());
         $$1.a($$0);
         return $$1;
      }
   }

   private static far a(fat $$0) {
      far $$1 = $$0.g();
      a($$1);
      return $$1;
   }

   private static void a(far $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
