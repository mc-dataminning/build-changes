import com.mojang.blaze3d.systems.RenderSystem;

public class eli {
   private static final int a = 8388608;
   private static final int b = 2097152;
   private final elb c;
   private static final eli d = new eli();

   public static eli a() {
      RenderSystem.assertOnGameThreadOrInit();
      return d;
   }

   public eli(int $$0) {
      this.c = new elb($$0);
   }

   public eli() {
      this(2097152);
   }

   public void b() {
      elc.a(this.c.d());
   }

   public elb c() {
      return this.c;
   }
}
