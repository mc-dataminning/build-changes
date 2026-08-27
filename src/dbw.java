import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbw extends cxz<dkg> implements dgf {
   public static final MapCodec<dbw> b = b(dbw::new);
   public static final dmy c = dda.aE;
   public static final dmv d = dmu.C;
   protected static final epo e = czf.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final vs f = vs.c("container.enderchest");

   @Override
   public MapCodec<dbw> a() {
      return b;
   }

   protected dbw(dmd.d $$0) {
      super($$0, () -> djn.d);
      this.k(this.E.b().a(c, ih.c).a(d, Boolean.valueOf(false)));
   }

   @Override
   public dbm.c<? extends djs> a(dme $$0, cwe $$1, ib $$2, boolean $$3) {
      return dbm.b::b;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return e;
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.b;
   }

   @Override
   public dme a(crx $$0) {
      ehr $$1 = $$0.q().b_($$0.a());
      return this.o().a(c, $$0.g().g()).a(d, Boolean.valueOf($$1.a() == ehs.c));
   }

   @Override
   protected bml a(dme $$0, cwe $$1, ib $$2, cia $$3, eor $$4) {
      cmg $$5 = $$3.gi();
      djl $$6 = $$1.c_($$2);
      if ($$5 != null && $$6 instanceof dkg) {
         ib $$7 = $$2.c();
         if ($$1.a_($$7).g($$1, $$7)) {
            return bml.a($$1.B);
         } else if ($$1.B) {
            return bml.a;
         } else {
            dkg $$8 = (dkg)$$6;
            $$5.a($$8);
            $$3.a(new bmv(($$1x, $$2x, $$3x) -> clb.a($$1x, $$2x, $$5), f));
            $$3.a(atz.aj);
            cgr.a($$3, true);
            return bml.b;
         }
      } else {
         return bml.a($$1.B);
      }
   }

   @Override
   public djl a(ib $$0, dme $$1) {
      return new dkg($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends djl> djm<T> a(cwe $$0, dme $$1, djn<T> $$2) {
      return $$0.B ? a($$2, djn.d, dkg::a) : null;
   }

   @Override
   public void a(dme $$0, cwe $$1, ib $$2, awt $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(kb.Z, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   protected dme a(dme $$0, dfr $$1) {
      return $$0.a(c, $$1.a($$0.c(c)));
   }

   @Override
   protected dme a(dme $$0, deb $$1) {
      return $$0.a($$1.a($$0.c(c)));
   }

   @Override
   protected void a(dmf.a<czf, dme> $$0) {
      $$0.a(c, d);
   }

   @Override
   protected ehr c_(dme $$0) {
      return $$0.c(d) ? ehs.c.a(false) : super.c_($$0);
   }

   @Override
   protected dme a(dme $$0, ih $$1, dme $$2, cwf $$3, ib $$4, ib $$5) {
      if ($$0.c(d)) {
         $$3.a($$4, ehs.c, ehs.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dme $$0, cvk $$1, ib $$2, eih $$3) {
      return false;
   }

   @Override
   protected void a(dme $$0, apa $$1, ib $$2, awt $$3) {
      djl $$4 = $$1.c_($$2);
      if ($$4 instanceof dkg) {
         ((dkg)$$4).b();
      }
   }
}
