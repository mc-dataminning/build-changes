import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eqd {
   private static final int a = 786432;
   private final epw b;
   @Nullable
   private static eqd c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new eqd();
      }
   }

   public static eqd b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public eqd(int $$0) {
      this.b = new epw($$0);
   }

   public eqd() {
      this(786432);
   }

   public void c() {
      epx.a(this.b.d());
   }

   public epw d() {
      return this.b;
   }
}
