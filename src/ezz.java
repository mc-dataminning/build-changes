import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class ezz {
   private static final int a = 786432;
   private final ezs b;
   @Nullable
   private static ezz c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new ezz();
      }
   }

   public static ezz b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public ezz(int $$0) {
      this.b = new ezs($$0);
   }

   public ezz() {
      this(786432);
   }

   public void c() {
      ezt.a(this.b.d());
   }

   public ezs d() {
      return this.b;
   }
}
