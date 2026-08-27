import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class etf {
   private static final int a = 786432;
   private final esy b;
   @Nullable
   private static etf c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new etf();
      }
   }

   public static etf b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public etf(int $$0) {
      this.b = new esy($$0);
   }

   public etf() {
      this(786432);
   }

   public void c() {
      esz.a(this.b.d());
   }

   public esy d() {
      return this.b;
   }
}
