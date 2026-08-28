import com.mojang.serialization.MapCodec;

public class dnk extends din {
   public static final MapCodec<dnk> a = b(dnk::new);
   public static final int b = 3;
   public static final dwj c = dvz.as;
   private static final fah[] d = new fah[]{
      die.a(0.0, 0.0, 0.0, 16.0, 5.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 8.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 11.0, 16.0),
      die.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)
   };

   @Override
   public MapCodec<dnk> a() {
      return a;
   }

   protected dnk(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return d[$$0.c(c)];
   }

   @Override
   protected boolean b(dvj $$0, deg $$1, jh $$2) {
      return $$0.a(dig.dW);
   }

   @Override
   protected boolean f(dvj $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(10) == 0) {
         $$0 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$0, 2);
      }
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return new cwb(cwf.sk);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c);
   }
}
