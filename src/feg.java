import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class feg {
   @Nullable
   private static fen a;

   public static void a() {
      if (a != null) {
         b();
         fen.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(fej $$0) {
      RenderSystem.assertOnRenderThread();
      fen $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(fej $$0) {
      RenderSystem.assertOnRenderThread();
      fen $$1 = c($$0);
      $$1.c();
   }

   private static fen c(fej $$0) {
      fen $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static fen a(fep $$0) {
      fen $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(fen $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
