import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eqc {
   private static final int a = 786432;
   private final epv b;
   @Nullable
   private static eqc c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new eqc();
      }
   }

   public static eqc b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public eqc(int $$0) {
      this.b = new epv($$0);
   }

   public eqc() {
      this(786432);
   }

   public void c() {
      epw.a(this.b.d());
   }

   public epv d() {
      return this.b;
   }
}
