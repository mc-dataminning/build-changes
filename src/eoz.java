import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eoz {
   @Nullable
   private static epg a;

   public static void a() {
      if (a != null) {
         b();
         epg.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(eoy.b $$0) {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> c($$0));
      } else {
         c($$0);
      }
   }

   private static void c(eoy.b $$0) {
      epg $$1 = d($$0);
      if ($$1 != null) {
         $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
      }
   }

   public static void b(eoy.b $$0) {
      epg $$1 = d($$0);
      if ($$1 != null) {
         $$1.c();
      }
   }

   @Nullable
   private static epg d(eoy.b $$0) {
      RenderSystem.assertOnRenderThread();
      if ($$0.d()) {
         $$0.e();
         return null;
      } else {
         epg $$1 = a($$0.c().g());
         $$1.a($$0);
         return $$1;
      }
   }

   private static epg a(epi $$0) {
      epg $$1 = $$0.g();
      a($$1);
      return $$1;
   }

   private static void a(epg $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
