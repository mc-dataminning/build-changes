import com.mojang.serialization.MapCodec;

public class dqh extends din implements dih {
   public static final MapCodec<dqh> a = b(dqh::new);
   private static final float d = 0.003F;
   public static final int b = 3;
   public static final dwj c = dvz.as;
   private static final fah e = die.a(3.0, 0.0, 3.0, 13.0, 8.0, 13.0);
   private static final fah f = die.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dqh> a() {
      return a;
   }

   public dqh(dvi.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Integer.valueOf(0)));
   }

   @Override
   public cwb a(dfe $$0, jh $$1, dvj $$2) {
      return new cwb(cwf.wx);
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      if ($$0.c(c) == 0) {
         return e;
      } else {
         return $$0.c(c) < 3 ? f : super.a($$0, $$1, $$2, $$3);
      }
   }

   @Override
   protected boolean f(dvj $$0) {
      return $$0.c(c) < 3;
   }

   @Override
   protected void b(dvj $$0, arn $$1, jh $$2, azs $$3) {
      int $$4 = $$0.c(c);
      if ($$4 < 3 && $$3.a(5) == 0 && $$1.b($$2.d(), 0) >= 9) {
         dvj $$5 = $$0.b(c, Integer.valueOf($$4 + 1));
         $$1.a($$2, $$5, 2);
         $$1.a(eag.c, $$2, eag.a.a($$5));
      }
   }

   @Override
   protected void a(dvj $$0, dfb $$1, jh $$2, bue $$3) {
      if ($$3 instanceof bva && $$3.ar() != bul.Q && $$3.ar() != bul.h) {
         $$3.a($$0, new ezn(0.8F, 0.75, 0.8F));
         if (!$$1.C && $$0.c(c) != 0) {
            ezn $$4 = $$3 instanceof aro ? $$3.ai() : $$3.bD().d($$3.dv());
            if ($$4.j() > 0.0) {
               double $$5 = Math.abs($$4.a());
               double $$6 = Math.abs($$4.c());
               if ($$5 >= 0.003F || $$6 >= 0.003F) {
                  $$3.a($$1.ai().u(), 1.0F);
               }
            }
         }
      }
   }

   @Override
   protected bsd a(cwb $$0, dvj $$1, dfb $$2, jh $$3, com $$4, bsc $$5, ezj $$6) {
      int $$7 = $$1.c(c);
      boolean $$8 = $$7 == 3;
      return (bsd)(!$$8 && $$0.a(cwf.rz) ? bsd.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      int $$5 = $$0.c(c);
      boolean $$6 = $$5 == 3;
      if ($$5 > 1) {
         int $$7 = 1 + $$1.A.a(2);
         a($$1, $$2, new cwb(cwf.wx, $$7 + ($$6 ? 1 : 0)));
         $$1.a(null, $$2, awl.zw, awm.e, 1.0F, 0.8F + $$1.A.i() * 0.4F);
         dvj $$8 = $$0.b(c, Integer.valueOf(1));
         $$1.a($$2, $$8, 2);
         $$1.a(eag.c, $$2, eag.a.a($$3, $$8));
         return bsd.a;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c);
   }

   @Override
   public boolean b(dfe $$0, jh $$1, dvj $$2) {
      return $$2.c(c) < 3;
   }

   @Override
   public boolean a(dfb $$0, azs $$1, jh $$2, dvj $$3) {
      return true;
   }

   @Override
   public void a(arn $$0, azs $$1, jh $$2, dvj $$3) {
      int $$4 = Math.min(3, $$3.c(c) + 1);
      $$0.a($$2, $$3.b(c, Integer.valueOf($$4)), 2);
   }
}
