import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fai {
   private static final int a = 786432;
   private final fab b;
   @Nullable
   private static fai c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fai();
      }
   }

   public static fai b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fai(int $$0) {
      this.b = new fab($$0);
   }

   public fai() {
      this(786432);
   }

   public void c() {
      fac.a(this.b.d());
   }

   public fab d() {
      return this.b;
   }
}
