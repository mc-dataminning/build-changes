import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class esj {
   private static final int a = 786432;
   private final esc b;
   @Nullable
   private static esj c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new esj();
      }
   }

   public static esj b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public esj(int $$0) {
      this.b = new esc($$0);
   }

   public esj() {
      this(786432);
   }

   public void c() {
      esd.a(this.b.d());
   }

   public esc d() {
      return this.b;
   }
}
