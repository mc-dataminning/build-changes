import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eyw {
   private static final int a = 786432;
   private final eyp b;
   @Nullable
   private static eyw c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new eyw();
      }
   }

   public static eyw b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public eyw(int $$0) {
      this.b = new eyp($$0);
   }

   public eyw() {
      this(786432);
   }

   public void c() {
      eyq.a(this.b.d());
   }

   public eyp d() {
      return this.b;
   }
}
