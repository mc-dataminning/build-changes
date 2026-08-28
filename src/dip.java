import com.mojang.serialization.MapCodec;

public class dip extends die {
   public static final MapCodec<dip> a = b(dip::new);
   public static final dwj b = dvz.aw;
   public static final int c = 15;
   protected static final int d = 1;
   protected static final fah e = die.a(1.0, 0.0, 1.0, 15.0, 15.0, 15.0);
   protected static final fah f = die.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dip> a() {
      return a;
   }

   protected dip(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      jh $$4 = $$2.d();
      if ($$1.u($$4)) {
         int $$5 = 1;

         while ($$1.a_($$2.c($$5)).a(this)) {
            $$5++;
         }

         if ($$5 < 3) {
            int $$6 = $$0.c(b);
            if ($$6 == 15) {
               $$1.b($$4, this.m());
               dvj $$7 = $$0.b(b, Integer.valueOf(0));
               $$1.a($$2, $$7, 4);
               $$1.a($$7, $$4, this, null, false);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$6 + 1)), 4);
            }
         }
      }
   }

   @Override
   protected fah b(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return e;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return f;
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if (!$$0.a($$3, $$4)) {
         $$3.a($$4, this, 1);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      for (jm $$3 : jm.c.a) {
         dvj $$4 = $$1.a_($$2.a($$3));
         if ($$4.e() || $$1.b_($$2.a($$3)).a(axg.b)) {
            return false;
         }
      }

      dvj $$5 = $$1.a_($$2.e());
      return ($$5.a(dig.dQ) || $$5.a(axa.I)) && !$$1.a_($$2.d()).n();
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      $$3.a($$1.ai().k(), 1.0F);
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
