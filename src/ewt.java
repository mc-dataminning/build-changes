import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class ewt {
   private static final int a = 786432;
   private final ewm b;
   @Nullable
   private static ewt c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new ewt();
      }
   }

   public static ewt b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public ewt(int $$0) {
      this.b = new ewm($$0);
   }

   public ewt() {
      this(786432);
   }

   public void c() {
      ewn.a(this.b.d());
   }

   public ewm d() {
      return this.b;
   }
}
