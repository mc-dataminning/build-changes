import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class ezy {
   private static final int a = 786432;
   private final ezr b;
   @Nullable
   private static ezy c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new ezy();
      }
   }

   public static ezy b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public ezy(int $$0) {
      this.b = new ezr($$0);
   }

   public ezy() {
      this(786432);
   }

   public void c() {
      ezs.a(this.b.d());
   }

   public ezr d() {
      return this.b;
   }
}
