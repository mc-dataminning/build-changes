import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class ffp {
   @Nullable
   private static ffw a;

   public static void a() {
      if (a != null) {
         b();
         ffw.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(ffs $$0) {
      RenderSystem.assertOnRenderThread();
      ffw $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(ffs $$0) {
      RenderSystem.assertOnRenderThread();
      ffw $$1 = c($$0);
      $$1.c();
   }

   private static ffw c(ffs $$0) {
      ffw $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static ffw a(ffy $$0) {
      ffw $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(ffw $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
