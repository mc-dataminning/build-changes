public class cxx extends csv {
   public static final dgh<ha.a> a = dfz.H;
   protected static final int b = 2;
   protected static final eig c = csv.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final eig d = csv.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   public cxx(dfi.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, ha.a.a));
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      switch ((ha.a)$$0.c(a)) {
         case c:
            return d;
         case a:
         default:
            return c;
      }
   }

   @Override
   public void b(dfj $$0, akq $$1, gw $$2, asc $$3) {
      if ($$1.C_().j() && $$1.X().b(cpr.e) && $$3.a(2000) < $$1.ai().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, biu.bs)) {
            biq $$4 = biu.bs.a($$1, $$2.c(), bjk.d);
            if ($$4 != null) {
               $$4.as();
            }
         }
      }
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      ha.a $$6 = $$1.o();
      ha.a $$7 = $$0.c(a);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new ebk($$3, $$4, $$7).c() ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, biq $$3) {
      if ($$3.cs()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, apd.sU, ape.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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
   public cjf a(cpb $$0, gw $$1, dfj $$2) {
      return cjf.b;
   }

   @Override
   public dfj a(dfj $$0, czh $$1) {
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
   protected void a(dfk.a<csv, dfj> $$0) {
      $$0.a(a);
   }
}
