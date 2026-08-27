import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class esc {
   private static final int a = 786432;
   private final erv b;
   @Nullable
   private static esc c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new esc();
      }
   }

   public static esc b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public esc(int $$0) {
      this.b = new erv($$0);
   }

   public esc() {
      this(786432);
   }

   public void c() {
      erw.a(this.b.d());
   }

   public erv d() {
      return this.b;
   }
}
