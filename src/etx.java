import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class etx {
   @Nullable
   private static eue a;

   public static void a() {
      if (a != null) {
         b();
         eue.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(etw.b $$0) {
      if (!RenderSystem.isOnRenderThreadOrInit()) {
         RenderSystem.recordRenderCall(() -> c($$0));
      } else {
         c($$0);
      }
   }

   private static void c(etw.b $$0) {
      eue $$1 = d($$0);
      if ($$1 != null) {
         $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
      }
   }

   public static void b(etw.b $$0) {
      eue $$1 = d($$0);
      if ($$1 != null) {
         $$1.c();
      }
   }

   @Nullable
   private static eue d(etw.b $$0) {
      RenderSystem.assertOnRenderThread();
      if ($$0.d()) {
         $$0.e();
         return null;
      } else {
         eue $$1 = a($$0.c().g());
         $$1.a($$0);
         return $$1;
      }
   }

   private static eue a(eug $$0) {
      eue $$1 = $$0.g();
      a($$1);
      return $$1;
   }

   private static void a(eue $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
