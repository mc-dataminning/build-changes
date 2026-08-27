import com.mojang.blaze3d.systems.RenderSystem;

public class elh {
   private static final int a = 8388608;
   private static final int b = 2097152;
   private final ela c;
   private static final elh d = new elh();

   public static elh a() {
      RenderSystem.assertOnGameThreadOrInit();
      return d;
   }

   public elh(int $$0) {
      this.c = new ela($$0);
   }

   public elh() {
      this(2097152);
   }

   public void b() {
      elb.a(this.c.d());
   }

   public ela c() {
      return this.c;
   }
}
