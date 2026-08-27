import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eqm {
   private static final int a = 786432;
   private final eqf b;
   @Nullable
   private static eqm c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new eqm();
      }
   }

   public static eqm b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public eqm(int $$0) {
      this.b = new eqf($$0);
   }

   public eqm() {
      this(786432);
   }

   public void c() {
      eqg.a(this.b.d());
   }

   public eqf d() {
      return this.b;
   }
}
