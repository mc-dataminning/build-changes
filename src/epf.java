import com.mojang.blaze3d.systems.RenderSystem;
import javax.annotation.Nullable;

public class epf {
   private static final int a = 786432;
   private final eoy b;
   @Nullable
   private static epf c;

   public static void a() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c != null) {
         throw new IllegalStateException("Tesselator has already been initialized");
      } else {
         c = new epf();
      }
   }

   public static epf b() {
      RenderSystem.assertOnGameThreadOrInit();
      if (c == null) {
         throw new IllegalStateException("Tesselator has not been initialized");
      } else {
         return c;
      }
   }

   public epf(int $$0) {
      this.b = new eoy($$0);
   }

   public epf() {
      this(786432);
   }

   public void c() {
      eoz.a(this.b.d());
   }

   public eoy d() {
      return this.b;
   }
}
