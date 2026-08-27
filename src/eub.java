import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eub {
   private static final int a = 786432;
   private final etu b;
   @Nullable
   private static eub c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new eub();
      }
   }

   public static eub b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public eub(int $$0) {
      this.b = new etu($$0);
   }

   public eub() {
      this(786432);
   }

   public void c() {
      etv.a(this.b.d());
   }

   public etu d() {
      return this.b;
   }
}
