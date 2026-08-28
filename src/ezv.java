import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class ezv {
   private static final int a = 786432;
   private final ezo b;
   @Nullable
   private static ezv c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new ezv();
      }
   }

   public static ezv b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public ezv(int $$0) {
      this.b = new ezo($$0);
   }

   public ezv() {
      this(786432);
   }

   public void c() {
      ezp.a(this.b.d());
   }

   public ezo d() {
      return this.b;
   }
}
