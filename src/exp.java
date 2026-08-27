import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class exp {
   private static final int a = 786432;
   private final exi b;
   @Nullable
   private static exp c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new exp();
      }
   }

   public static exp b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public exp(int $$0) {
      this.b = new exi($$0);
   }

   public exp() {
      this(786432);
   }

   public void c() {
      exj.a(this.b.d());
   }

   public exi d() {
      return this.b;
   }
}
