import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhz extends dec<dqm> implements dmj {
   public static final MapCodec<dhz> b = b(dhz::new);
   public static final dtf c = dje.aE;
   public static final dtc d = dtb.C;
   protected static final exa e = dfi.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final wu f = wu.c("container.enderchest");

   @Override
   public MapCodec<dhz> a() {
      return b;
   }

   protected dhz(dsk.d $$0) {
      super($$0, () -> dps.d);
      this.k(this.E.b().a(c, jf.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dhp.c<? extends dpx> a(dsl $$0, dcg $$1, ja $$2, boolean $$3) {
      return dhp.b::b;
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return e;
   }

   @Override
   protected dlo a_(dsl $$0) {
      return dlo.b;
   }

   @Override
   public dsl a(cxn $$0) {
      eoj $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == eok.c));
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      cqv $$5 = $$3.gn();
      dpq $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dqm) {
         ja $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bqh.a($$1.B);
         } else if ($$1.B) {
            return bqh.a;
         } else {
            dqm $$8 = (dqm)$$6;
            $$5.a($$8);
            $$3.a(new bqr(($$1x, $$2x, $$3x) -> cpq.a($$1x, $$2x, $$5), f));
            $$3.a(avr.aj);
            clc.a($$3, true);
            return bqh.c;
         }
      } else {
         return bqh.a($$1.B);
      }
   }

   @Override
   public dpq a(ja $$0, dsl $$1) {
      return new dqm($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpq> dpr<T> a(dcg $$0, dsl $$1, dps<T> $$2) {
      return $$0.B ? a($$2, dps.d, dqm::a) : null;
   }

   @Override
   public void a(dsl $$0, dcg $$1, ja $$2, ayo $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(lj.ac, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dsl a(dsl $$0, dlv $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dsl a(dsl $$0, dkf $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected eoj b_(dsl $$0) {
      return $$0.c(d) ? eok.c.a(false) : super.b_($$0);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eok.c, eok.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      dpq $$4 = $$1.c_($$2);
      if ($$4 instanceof dqm) {
         ((dqm)$$4).b();
      }
   }
}
