import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fde {
   @Nullable
   private static fdl a;

   public static void a() {
      if (a != null) {
         b();
         fdl.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(fdh $$0) {
      RenderSystem.assertOnRenderThread();
      fdl $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(fdh $$0) {
      RenderSystem.assertOnRenderThread();
      fdl $$1 = c($$0);
      $$1.c();
   }

   private static fdl c(fdh $$0) {
      fdl $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static fdl a(fdn $$0) {
      fdl $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(fdl $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
