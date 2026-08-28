import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fdx {
   @Nullable
   private static fee a;

   public static void a() {
      if (a != null) {
         b();
         fee.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(fea $$0) {
      RenderSystem.assertOnRenderThread();
      fee $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(fea $$0) {
      RenderSystem.assertOnRenderThread();
      fee $$1 = c($$0);
      $$1.c();
   }

   private static fee c(fea $$0) {
      fee $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static fee a(feg $$0) {
      fee $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(fee $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
