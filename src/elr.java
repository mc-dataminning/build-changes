import com.mojang.blaze3d.systems.RenderSystem;

public class elr {
   private static final int a = 8388608;
   private static final int b = 2097152;
   private final elk c;
   private static final elr d = new elr();

   public static elr a() {
      RenderSystem.assertOnGameThreadOrInit();
      return d;
   }

   public elr(int $$0) {
      this.c = new elk($$0);
   }

   public elr() {
      this(2097152);
   }

   public void b() {
      ell.a(this.c.d());
   }

   public elk c() {
      return this.c;
   }
}
