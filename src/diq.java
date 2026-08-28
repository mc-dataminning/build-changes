import com.mojang.serialization.MapCodec;

public class diq extends die {
   public static final MapCodec<diq> a = b(diq::new);
   public static final int b = 6;
   public static final dwj c = dvz.ay;
   public static final int d = b(0);
   protected static final float e = 1.0F;
   protected static final float f = 2.0F;
   protected static final fah[] g = new fah[]{
      die.a(1.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      die.a(3.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      die.a(5.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      die.a(7.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      die.a(9.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      die.a(11.0, 0.0, 1.0, 15.0, 8.0, 15.0),
      die.a(13.0, 0.0, 1.0, 15.0, 8.0, 15.0)
   };

   @Override
   public MapCodec<diq> a() {
      return a;
   }

   protected diq(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return g[$$0.c(c)];
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      cvx $$7 = $$0.h();
      if ($$0.a(axj.aN) && $$1.c(c) == 0 && die.a($$7) instanceof dit $$8) {
         $$0.a(1, $$4);
         $$2.a(null, $$3, awl.ds, awm.e, 1.0F, 1.0F);
         $$2.b($$3, diu.a($$8));
         $$2.a($$4, eag.c, $$3);
         $$4.b(awv.c.b($$7));
         return bsd.a;
      } else {
         return bsd.f;
      }
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      if ($$1.C) {
         if (a($$1, $$2, $$0, $$3).a()) {
            return bsd.a;
         }

         if ($$3.b(bsc.a).f()) {
            return bsd.c;
         }
      }

      return a($$1, $$2, $$0, $$3);
   }

   protected static bsd a(dfc $$0, jh $$1, dvj $$2, com $$3) {
      if (!$$3.u(false)) {
         return bsd.e;
      } else {
         $$3.a(awv.U);
         $$3.gu().a(2, 0.1F);
         int $$4 = $$2.c(c);
         $$0.a($$3, eag.m, $$1);
         if ($$4 < 6) {
            $$0.a($$1, $$2.b(c, Integer.valueOf($$4 + 1)), 3);
         } else {
            $$0.a($$1, false);
            $$0.a($$3, eag.f, $$1);
         }

         return bsd.a;
      }
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      return $$1 == jm.a && !$$0.a($$3, $$4) ? dig.a.m() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvj $$0, dfe $$1, jh $$2) {
      return $$1.a_($$2.e()).e();
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c);
   }

   @Override
   protected int a(dvj $$0, dfb $$1, jh $$2) {
      return b($$0.c(c));
   }

   public static int b(int $$0) {
      return (7 - $$0) * 2;
   }

   @Override
   protected boolean c_(dvj $$0) {
      return true;
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }
}
