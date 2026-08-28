import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fda {
   @Nullable
   private static fdh a;

   public static void a() {
      if (a != null) {
         b();
         fdh.b();
      }
   }

   public static void b() {
      a = null;
   }

   public static void a(fdd $$0) {
      RenderSystem.assertOnRenderThread();
      fdh $$1 = c($$0);
      $$1.a(RenderSystem.getModelViewMatrix(), RenderSystem.getProjectionMatrix(), RenderSystem.getShader());
   }

   public static void b(fdd $$0) {
      RenderSystem.assertOnRenderThread();
      fdh $$1 = c($$0);
      $$1.c();
   }

   private static fdh c(fdd $$0) {
      fdh $$1 = a($$0.c().a());
      $$1.a($$0);
      return $$1;
   }

   private static fdh a(fdj $$0) {
      fdh $$1 = $$0.i();
      a($$1);
      return $$1;
   }

   private static void a(fdh $$0) {
      if ($$0 != a) {
         $$0.a();
         a = $$0;
      }
   }
}
