import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class epv {
   private static final int a = 786432;
   private final epo b;
   @Nullable
   private static epv c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new epv();
      }
   }

   public static epv b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public epv(int $$0) {
      this.b = new epo($$0);
   }

   public epv() {
      this(786432);
   }

   public void c() {
      epp.a(this.b.d());
   }

   public epo d() {
      return this.b;
   }
}
