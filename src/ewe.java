import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class ewe {
   @Nullable
   private static ewl a;

   public static void a() {
      if (a != null) {
         b();
         ewl.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(ewd.b $$0) {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> c($$0));
      } else {
         c($$0);
      }
   }

   private static void c(ewd.b $$0) {
      ewl $$1 = d($$0);
      if ($$1 != null) {
         $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
      }
   }

   public static void b(ewd.b $$0) {
      ewl $$1 = d($$0);
      if ($$1 != null) {
         $$1.c();
      }
   }

   @Nullable
   private static ewl d(ewd.b $$0) {
      RenderSystem.assertOnRenderThread();
      if ($$0.d()) {
         $$0.e();
         return null;
      } else {
         ewl $$1 = a($$0.c().g());
         $$1.a($$0);
         return $$1;
      }
   }

   private static ewl a(ewn $$0) {
      ewl $$1 = $$0.g();
      a($$1);
      return $$1;
   }

   private static void a(ewl $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
