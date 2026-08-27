import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eod {
   private static final int a = 786432;
   private final enw b;
   @Nullable
   private static eod c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new eod();
      }
   }

   public static eod b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public eod(int $$0) {
      this.b = new enw($$0);
   }

   public eod() {
      this(786432);
   }

   public void c() {
      enx.a(this.b.d());
   }

   public enw d() {
      return this.b;
   }
}
