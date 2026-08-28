import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class faa {
   private static final int a = 786432;
   private final ezt b;
   @Nullable
   private static faa c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new faa();
      }
   }

   public static faa b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public faa(int $$0) {
      this.b = new ezt($$0);
   }

   public faa() {
      this(786432);
   }

   public void c() {
      ezu.a(this.b.d());
   }

   public ezt d() {
      return this.b;
   }
}
