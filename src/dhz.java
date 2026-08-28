import com.mojang.serialization.MapCodec;

public class dhz extends djz {
   public static final MapCodec<dhz> a = b(dhz::new);
   public static final int b = 3;
   public static final dwj c = dvz.as;
   private static final fah[] g = new fah[]{
      die.a(0.0, 0.0, 0.0, 16.0, 2.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 4.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 6.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)
   };

   @Override
   public MapCodec<dhz> a() {
      return a;
   }

   public dhz(dvi.d $$0) {
      super($$0);
   }

   @Override
   protected dwj b() {
      return c;
   }

   @Override
   public int c() {
      return 3;
   }

   @Override
   protected dfa d() {
      return cwf.vn;
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$3.a(3) != 0) {
         super.b($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected int a(dfb $$0) {
      return super.a($$0) / 3;
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return g[this.h($$0)];
   }
}
