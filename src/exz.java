import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class exz {
   private static final int a = 786432;
   private final exs b;
   @Nullable
   private static exz c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new exz();
      }
   }

   public static exz b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public exz(int $$0) {
      this.b = new exs($$0);
   }

   public exz() {
      this(786432);
   }

   public void c() {
      ext.a(this.b.d());
   }

   public exs d() {
      return this.b;
   }
}
