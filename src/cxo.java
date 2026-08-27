public class cxo extends csm {
   public static final dfy<ha.a> a = dfq.H;
   protected static final int b = 2;
   protected static final ehx c = csm.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ehx d = csm.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   public cxo(dez.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.a.a));
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      switch ((ha.a)$$0.c(a)) {
         case c:
            return d;
         case a:
         default:
            return c;
      }
   }

   @Override
   public void b(dfa $$0, akk $$1, gu $$2, aru $$3) {
      if ($$1.x_().j() && $$1.X().b(cpi.e) && $$3.a(2000) < $$1.ai().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bim.bs)) {
            bii $$4 = bim.bs.a($$1, $$2.c(), bjc.d);
            if ($$4 != null) {
               $$4.as();
            }
         }
      }
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      ha.a $$6 = $$1.o();
      ha.a $$7 = $$0.c(a);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new ebb($$3, $$4, $$7).c() ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, bii $$3) {
      if ($$3.cs()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aow.sU, aox.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
      }

      for (int $$4 = 0; $$4 < 4; $$4++) {
         double $$5 = (double)$$2.u() + $$3.j();
         double $$6 = (double)$$2.v() + $$3.j();
         double $$7 = (double)$$2.w() + $$3.j();
         double $$8 = ((double)$$3.i() - 0.5) * 0.5;
         double $$9 = ((double)$$3.i() - 0.5) * 0.5;
         double $$10 = ((double)$$3.i() - 0.5) * 0.5;
         int $$11 = $$3.a(2) * 2 - 1;
         if (!$$1.a_($$2.g()).a(this) && !$$1.a_($$2.h()).a(this)) {
            $$5 = (double)$$2.u() + 0.5 + 0.25 * (double)$$11;
            $$8 = (double)($$3.i() * 2.0F * (float)$$11);
         } else {
            $$7 = (double)$$2.w() + 0.5 + 0.25 * (double)$$11;
            $$10 = (double)($$3.i() * 2.0F * (float)$$11);
         }

         $$1.a(iv.X, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return ciy.b;
   }

   @Override
   public dfa a(dfa $$0, cyy $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((ha.a)$$0.c(a)) {
               case c:
                  return $$0.a(a, ha.a.a);
               case a:
                  return $$0.a(a, ha.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(a);
   }
}
