import com.mojang.serialization.MapCodec;

public class dqp extends djz {
   public static final MapCodec<dqp> a = b(dqp::new);
   public static final int b = 2;
   public static final dwj c = dvz.aq;
   private static final float g = 3.0F;
   private static final fah[] h = new fah[]{die.a(5.0, 0.0, 5.0, 11.0, 6.0, 11.0), die.a(5.0, 0.0, 5.0, 11.0, 10.0, 11.0)};
   private static final int i = 1;

   @Override
   public MapCodec<dqp> a() {
      return a;
   }

   public dqp(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c);
   }

   @Override
   public fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return h[this.h($$0)];
   }

   @Override
   protected dwj b() {
      return c;
   }

   @Override
   public int c() {
      return 2;
   }

   @Override
   protected dfa d() {
      return cwf.vk;
   }

   @Override
   public dvj b(int $$0) {
      return $$0 == 2 ? dig.bS.m() : super.b($$0);
   }

   @Override
   public void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dfb $$0) {
      return 1;
   }
}
