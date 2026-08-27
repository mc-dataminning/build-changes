import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eud {
   private static final int a = 786432;
   private final etw b;
   @Nullable
   private static eud c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new eud();
      }
   }

   public static eud b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public eud(int $$0) {
      this.b = new etw($$0);
   }

   public eud() {
      this(786432);
   }

   public void c() {
      etx.a(this.b.d());
   }

   public etw d() {
      return this.b;
   }
}
