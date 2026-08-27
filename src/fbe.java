import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fbe {
   private static final int a = 786432;
   private final fax b;
   @Nullable
   private static fbe c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fbe();
      }
   }

   public static fbe b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fbe(int $$0) {
      this.b = new fax($$0);
   }

   public fbe() {
      this(786432);
   }

   public void c() {
      fay.a(this.b.d());
   }

   public fax d() {
      return this.b;
   }
}
