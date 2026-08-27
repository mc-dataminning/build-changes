import com.mojang.blaze3d.systems.RenderSystem;

public class emj {
   private static final int a = 8388608;
   private static final int b = 2097152;
   private final emc c;
   private static final emj d = new emj();

   public static emj a() {
      RenderSystem.assertOnGameThreadOrInit();
      return d;
   }

   public emj(int $$0) {
      this.c = new emc($$0);
   }

   public emj() {
      this(2097152);
   }

   public void b() {
      emd.a(this.c.d());
   }

   public emc c() {
      return this.c;
   }
}
