import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class ffr {
   @Nullable
   private static ffy a;

   public static void a() {
      if (a != null) {
         b();
         ffy.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(ffu $$0) {
      RenderSystem.assertOnRenderThread();
      ffy $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(ffu $$0) {
      RenderSystem.assertOnRenderThread();
      ffy $$1 = c($$0);
      $$1.c();
   }

   private static ffy c(ffu $$0) {
      ffy $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static ffy a(fga $$0) {
      ffy $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(ffy $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
