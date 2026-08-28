import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class fab {
   private static final int a = 786432;
   private final ezu b;
   @Nullable
   private static fab c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new fab();
      }
   }

   public static fab b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public fab(int $$0) {
      this.b = new ezu($$0);
   }

   public fab() {
      this(786432);
   }

   public void c() {
      ezv.a(this.b.d());
   }

   public ezu d() {
      return this.b;
   }
}
