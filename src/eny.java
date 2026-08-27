import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class eny {
   private static final int a = 786432;
   private final enr b;
   @Nullable
   private static eny c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new eny();
      }
   }

   public static eny b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public eny(int $$0) {
      this.b = new enr($$0);
   }

   public eny() {
      this(786432);
   }

   public void c() {
      ens.a(this.b.d());
   }

   public enr d() {
      return this.b;
   }
}
