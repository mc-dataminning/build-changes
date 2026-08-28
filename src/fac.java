import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fac {
   private static final int a = 786432;
   private final ezv b;
   @Nullable
   private static fac c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fac();
      }
   }

   public static fac b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fac(int $$0) {
      this.b = new ezv($$0);
   }

   public fac() {
      this(786432);
   }

   public void c() {
      ezw.a(this.b.d());
   }

   public ezv d() {
      return this.b;
   }
}
