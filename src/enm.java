import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class enm {
   private static final int a = 786432;
   private final enf b;
   @Nullable
   private static enm c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new enm();
      }
   }

   public static enm b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public enm(int $$0) {
      this.b = new enf($$0);
   }

   public enm() {
      this(786432);
   }

   public void c() {
      eng.a(this.b.d());
   }

   public enf d() {
      return this.b;
   }
}
