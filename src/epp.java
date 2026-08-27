import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class epp {
   @Nullable
   private static epw a;

   public static void a() {
      if (a != null) {
         b();
         epw.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(epo.b $$0) {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> c($$0));
      } else {
         c($$0);
      }
   }

   private static void c(epo.b $$0) {
      epw $$1 = d($$0);
      if ($$1 != null) {
         $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
      }
   }

   public static void b(epo.b $$0) {
      epw $$1 = d($$0);
      if ($$1 != null) {
         $$1.c();
      }
   }

   @Nullable
   private static epw d(epo.b $$0) {
      RenderSystem.assertOnRenderThread();
      if ($$0.d()) {
         $$0.e();
         return null;
      } else {
         epw $$1 = a($$0.c().g());
         $$1.a($$0);
         return $$1;
      }
   }

   private static epw a(epy $$0) {
      epw $$1 = $$0.g();
      a($$1);
      return $$1;
   }

   private static void a(epw $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
