import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fao {
   private static final int a = 786432;
   private final fah b;
   @Nullable
   private static fao c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fao();
      }
   }

   public static fao b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fao(int $$0) {
      this.b = new fah($$0);
   }

   public fao() {
      this(786432);
   }

   public void c() {
      fai.a(this.b.d());
   }

   public fah d() {
      return this.b;
   }
}
