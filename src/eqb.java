import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eqb {
   private static final int a = 786432;
   private final epu b;
   @Nullable
   private static eqb c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new eqb();
      }
   }

   public static eqb b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public eqb(int $$0) {
      this.b = new epu($$0);
   }

   public eqb() {
      this(786432);
   }

   public void c() {
      epv.a(this.b.d());
   }

   public epu d() {
      return this.b;
   }
}
