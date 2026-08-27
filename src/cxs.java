public class cxs extends csq {
   public static final dgc<hc.a> a = dfu.H;
   protected static final int b = 2;
   protected static final eib c = csq.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eib d = csq.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   public cxs(dfd.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hc.a.a));
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      switch ((hc.a)$$0.c(a)) {
         case c:
            return d;
         case a:
         default:
            return c;
      }
   }

   @Override
   public void b(dfe $$0, akn $$1, gw $$2, arx $$3) {
      if ($$1.x_().j() && $$1.X().b(cpm.e) && $$3.a(2000) < $$1.ai().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bip.bs)) {
            bil $$4 = bip.bs.a($$1, $$2.c(), bjf.d);
            if ($$4 != null) {
               $$4.as();
            }
         }
      }
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      hc.a $$6 = $$1.o();
      hc.a $$7 = $$0.c(a);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new ebf($$3, $$4, $$7).c() ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, bil $$3) {
      if ($$3.cs()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aoz.sU, apa.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(ix.X, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public cja a(cow $$0, gw $$1, dfe $$2) {
      return cja.b;
   }

   @Override
   public dfe a(dfe $$0, czc $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((hc.a)$$0.c(a)) {
               case c:
                  return $$0.a(a, hc.a.a);
               case a:
                  return $$0.a(a, hc.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dff.a<csq, dfe> $$0) {
      $$0.a(a);
   }
}
