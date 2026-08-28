import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkv extends dgy<dti> implements dpf {
   public static final MapCodec<dkv> b = b(dkv::new);
   public static final dwd c = dlz.aF;
   public static final dwa d = dvz.C;
   protected static final fah e = die.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xi f = xi.c("container.enderchest");

   @Override
   public MapCodec<dkv> a() {
      return b;
   }

   protected dkv(dvi.d $$0) {
      super($$0, () -> dso.d);
      this.l(this.F.b().b(c, jm.c).b(d, Boolean.valueOf(false)));
   }

   @Override
   public dkl.c<? extends dst> a(dvj $$0, dfb $$1, jh $$2, boolean $$3) {
      return dkl.b::b;
   }

   @Override
   protected fah a(dvj $$0, deg $$1, jh $$2, ezs $$3) {
      return e;
   }

   @Override
   protected dok a_(dvj $$0) {
      return dok.b;
   }

   @Override
   public dvj a(czs $$0) {
      erk $$1 = $$0.q().b_($$0.a());
      return this.m().b(c, $$0.g().g()).b(d, Boolean.valueOf($$1.a() == erl.c));
   }

   @Override
   protected bsd a(dvj $$0, dfb $$1, jh $$2, com $$3, ezj $$4) {
      ctc $$5 = $$3.gx();
      if ($$5 != null && $$1.c_($$2) instanceof dti $$7) {
         jh $$9 = $$2.d();
         if ($$1.a_($$9).d($$1, $$9)) {
            return bsd.a;
         } else {
            if (!$$1.C) {
               $$5.a($$7);
               $$3.a(new bsl(($$1x, $$2x, $$3x) -> crx.a($$1x, $$2x, $$5), f));
               $$3.a(awv.aj);
               cnc.a($$3, true);
            }

            return bsd.a;
         }
      } else {
         return bsd.a;
      }
   }

   @Override
   public dsm a(jh $$0, dvj $$1) {
      return new dti($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsm> dsn<T> a(dfb $$0, dvj $$1, dso<T> $$2) {
      return $$0.C ? a($$2, dso.d, dti::a) : null;
   }

   @Override
   public void a(dvj $$0, dfb $$1, jh $$2, azs $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lr.ac, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dvj a(dvj $$0, dor $$1) {
      return $$0.b(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dvj a(dvj $$0, dna $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dvk.a<die, dvj> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected erk b_(dvj $$0) {
      return $$0.c(d) ? erl.c.a(false) : super.b_($$0);
   }

   @Override
   protected dvj a(dvj $$0, jm $$1, dvj $$2, dfc $$3, jh $$4, jh $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, erl.c, erl.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dvj $$0, erz $$1) {
      return false;
   }

   @Override
   protected void a(dvj $$0, arn $$1, jh $$2, azs $$3) {
      dsm $$4 = $$1.c_($$2);
      if ($$4 instanceof dti) {
         ((dti)$$4).b();
      }
   }
}
