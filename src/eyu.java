import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eyu {
   private static final int a = 786432;
   private final eyn b;
   @Nullable
   private static eyu c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new eyu();
      }
   }

   public static eyu b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public eyu(int $$0) {
      this.b = new eyn($$0);
   }

   public eyu() {
      this(786432);
   }

   public void c() {
      eyo.a(this.b.d());
   }

   public eyn d() {
      return this.b;
   }
}
