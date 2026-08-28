import com.mojang.serialization.MapCodec;

public class dqe extends die {
   public static final MapCodec<dqe> a = b(dqe::new);
   public static final dwj b = dvz.aw;
   protected static final float c = 6.0F;
   protected static final fah d = die.a(2.0, 0.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dqe> a() {
      return a;
   }

   protected dqe(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, Integer.valueOf(0)));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return d;
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if (!$$0.a($$1, $$2)) {
         $$1.b($$2, true);
      }
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      if ($$1.u($$2.d())) {
         int $$4 = 1;

         while ($$1.a_($$2.c($$4)).a(this)) {
            $$4++;
         }

         if ($$4 < 3) {
            int $$5 = $$0.c(b);
            if ($$5 == 15) {
               $$1.b($$2.d(), this.m());
               $$1.a($$2, $$0.b(b, Integer.valueOf(0)), 4);
            } else {
               $$1.a($$2, $$0.b(b, Integer.valueOf($$5 + 1)), 4);
            }
         }
      }
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
      dvj $$3 = $$1.a_($$2.e());
      if ($$3.a(this)) {
         return true;
      } else {
         if ($$3.a(axa.ag) || $$3.a(axa.I)) {
            jh $$4 = $$2.e();

            for (jm $$5 : jm.c.a) {
               dvj $$6 = $$1.a_($$4.a($$5));
               erk $$7 = $$1.b_($$4.a($$5));
               if ($$7.a(axg.a) || $$6.a(dig.kI)) {
                  return true;
               }
            }
         }

         return false;
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(b);
   }
}
