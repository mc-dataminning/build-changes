import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dip extends des<drd> implements dna {
   public static final MapCodec<dip> b = b(dip::new);
   public static final dtw c = dju.aE;
   public static final dtt d = dts.C;
   protected static final ext e = dfy.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final wz f = wz.c("container.enderchest");

   @Override
   public MapCodec<dip> a() {
      return b;
   }

   protected dip(dtb.d $$0) {
      super($$0, () -> dqj.d);
      this.k(this.E.b().a(c, ji.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dif.c<? extends dqo> a(dtc $$0, dcw $$1, jd $$2, boolean $$3) {
      return dif.b::b;
   }

   @Override
   protected ext a(dtc $$0, dcc $$1, jd $$2, exf $$3) {
      return e;
   }

   @Override
   protected dmf a_(dtc $$0) {
      return dmf.b;
   }

   @Override
   public dtc a(cyd $$0) {
      epc $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == epd.c));
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      crh $$5 = $$3.gm();
      dqh $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof drd) {
         jd $$7 = $$2.d();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bqr.a($$1.B);
         } else if ($$1.B) {
            return bqr.a;
         } else {
            drd $$8 = (drd)$$6;
            $$5.a($$8);
            $$3.a(new brb(($$1x, $$2x, $$3x) -> cqc.a($$1x, $$2x, $$5), f));
            $$3.a(avz.aj);
            clo.a($$3, true);
            return bqr.c;
         }
      } else {
         return bqr.a($$1.B);
      }
   }

   @Override
   public dqh a(jd $$0, dtc $$1) {
      return new drd($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dqh> dqi<T> a(dcw $$0, dtc $$1, dqj<T> $$2) {
      return $$0.B ? a($$2, dqj.d, drd::a) : null;
   }

   @Override
   public void a(dtc $$0, dcw $$1, jd $$2, ayw $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lm.ac, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected epc b_(dtc $$0) {
      return $$0.c(d) ? epd.c.a(false) : super.b_($$0);
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, epd.c, epd.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dtc $$0, epr $$1) {
      return false;
   }

   @Override
   protected void a(dtc $$0, aqu $$1, jd $$2, ayw $$3) {
      dqh $$4 = $$1.c_($$2);
      if ($$4 instanceof drd) {
         ((drd)$$4).b();
      }
   }
}
