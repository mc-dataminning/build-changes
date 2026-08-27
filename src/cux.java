import javax.annotation.Nullable;

public class cux extends cre<dde> implements czl {
   public static final dfs b = cwd.aC;
   public static final dfp c = dfo.C;
   protected static final ehy d = csk.a(1.0, 0.0, 1.0, 15.0, 14.0, 15.0);
   private static final te e = te.c("container.enderchest");

   protected cux(dex.d $$0) {
      super($$0, () -> dcm.d);
      this.k(this.C.b().a(b, hb.c).a(c, Boolean.valueOf(false)));
   }

   @Override
   public cun.c<? extends dcr> a(dey $$0, cpk $$1, gv $$2, boolean $$3) {
      return cun.b::b;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return d;
   }

   @Override
   public cyp b_(dey $$0) {
      return cyp.b;
   }

   @Override
   public dey a(cle $$0) {
      eab $$1 = $$0.q().b_($$0.a());
      return this.n().a(b, $$0.g().g()).a(c, Boolean.valueOf($$1.a() == eac.c));
   }

   @Override
   public bgo a(dey $$0, cpk $$1, gv $$2, cbl $$3, bgn $$4, ehb $$5) {
      cfl $$6 = $$3.gd();
      dck $$7 = $$1.c_($$2);
      if ($$6 != null && $$7 instanceof dde) {
         gv $$8 = $$2.c();
         if ($$1.a_($$8).g($$1, $$8)) {
            return bgo.a($$1.B);
         } else if ($$1.B) {
            return bgo.a;
         } else {
            dde $$9 = (dde)$$7;
            $$6.a($$9);
            $$3.a(new bgw(($$1x, $$2x, $$3x) -> cej.a($$1x, $$2x, $$6), e));
            $$3.a(ape.aj);
            cac.a($$3, true);
            return bgo.b;
         }
      } else {
         return bgo.a($$1.B);
      }
   }

   @Override
   public dck a(gv $$0, dey $$1) {
      return new dde($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dck> dcl<T> a(cpk $$0, dey $$1, dcm<T> $$2) {
      return $$0.B ? a($$2, dcm.d, dde::a) : null;
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      for (int $$4 = 0; $$4 < 3; $$4++) {
         int $$5 = $$3.a(2) * 2 - 1;
         int $$6 = $$3.a(2) * 2 - 1;
         double $$7 = (double)$$2.u() + 0.5 + 0.25 * (double)$$5;
         double $$8 = (double)((float)$$2.v() + $$3.i());
         double $$9 = (double)$$2.w() + 0.5 + 0.25 * (double)$$6;
         double $$10 = (double)($$3.i() * (float)$$5);
         double $$11 = ((double)$$3.i() - 0.5) * 0.125;
         double $$12 = (double)($$3.i() * (float)$$6);
         $$1.a(iw.X, $$7, $$8, $$9, $$10, $$11, $$12);
      }
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   public dey a(dey $$0, cxf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(b, c);
   }

   @Override
   public eab c_(dey $$0) {
      return $$0.c(c) ? eac.c.a(false) : super.c_($$0);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      if ($$0.c(c)) {
         $$3.a($$4, eac.c, eac.c.a($$3));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dey $$0, coq $$1, gv $$2, ear $$3) {
      return false;
   }

   @Override
   public void a(dey $$0, aki $$1, gv $$2, art $$3) {
      dck $$4 = $$1.c_($$2);
      if ($$4 instanceof dde) {
         ((dde)$$4).c();
      }
   }
}
