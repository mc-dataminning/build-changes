import com.mojang.blaze3d.systems.RenderSystem;

public class elj {
   private static final int a = 8388608;
   private static final int b = 2097152;
   private final elc c;
   private static final elj d = new elj();

   public static elj a() {
      RenderSystem.assertOnGameThreadOrInit();
      return d;
   }

   public elj(int $$0) {
      this.c = new elc($$0);
   }

   public elj() {
      this(2097152);
   }

   public void b() {
      eld.a(this.c.d());
   }

   public elc c() {
      return this.c;
   }
}
