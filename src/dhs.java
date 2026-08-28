import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhs extends ddv<dqe> implements dmc {
   public static final MapCodec<dhs> b = b(dhs::new);
   public static final dsy c = dix.aE;
   public static final dsv d = dsu.C;
   protected static final ewm e = dfb.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final xp f = xp.c("container.enderchest");

   @Override
   public MapCodec<dhs> a() {
      return b;
   }

   protected dhs(dsd.d $$0) {
      super($$0, () -> dpl.d);
      this.k(this.E.b().a(c, je.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dhi.c<? extends dpq> a(dse $$0, dca $$1, iz $$2, boolean $$3) {
      return dhi.b::b;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return e;
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.b;
   }

   @Override
   public dse a(cyc $$0) {
      enx $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == eny.c));
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      cri $$5 = $$3.gp();
      dpj $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dqe) {
         iz $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bqw.a($$1.B);
         } else if ($$1.B) {
            return bqw.a;
         } else {
            dqe $$8 = (dqe)$$6;
            $$5.a($$8);
            $$3.a(new brg(($$1x, $$2x, $$3x) -> cqd.a($$1x, $$2x, $$5), f));
            $$3.a(awk.aj);
            clq.a($$3, true);
            return bqw.c;
         }
      } else {
         return bqw.a($$1.B);
      }
   }

   @Override
   public dpj a(iz $$0, dse $$1) {
      return new dqe($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dpj> dpk<T> a(dca $$0, dse $$1, dpl<T> $$2) {
      return $$0.B ? a($$2, dpl.d, dqe::a) : null;
   }

   @Override
   public void a(dse $$0, dca $$1, iz $$2, azh $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(li.ac, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dse a(dse $$0, dlo $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dse a(dse $$0, djy $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected enx b_(dse $$0) {
      return $$0.c(d) ? eny.c.a(false) : super.b_($$0);
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, eny.c, eny.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dse $$0, eom $$1) {
      return false;
   }

   @Override
   protected void a(dse $$0, arf $$1, iz $$2, azh $$3) {
      dpj $$4 = $$1.c_($$2);
      if ($$4 instanceof dqe) {
         ((dqe)$$4).b();
      }
   }
}
