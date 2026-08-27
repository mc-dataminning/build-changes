import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class ewk {
   private static final int a = 786432;
   private final ewd b;
   @Nullable
   private static ewk c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new ewk();
      }
   }

   public static ewk b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public ewk(int $$0) {
      this.b = new ewd($$0);
   }

   public ewk() {
      this(786432);
   }

   public void c() {
      ewe.a(this.b.d());
   }

   public ewd d() {
      return this.b;
   }
}
