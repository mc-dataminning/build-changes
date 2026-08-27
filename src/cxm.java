public class cxm extends csk {
   public static final dfw<hb.a> a = dfo.H;
   protected static final int b = 2;
   protected static final ehy c = csk.a(0.0, 0.0, 6.0, 16.0, 16.0, 10.0);
   protected static final ehy d = csk.a(6.0, 0.0, 0.0, 10.0, 16.0, 16.0);

   public cxm(dex.d $$0) {
      super($$0);
      this.k(this.C.b().a(a, hb.a.a));
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      switch ((hb.a)$$0.c(a)) {
         case c:
            return d;
         case a:
         default:
            return c;
      }
   }

   @Override
   public void b(dey $$0, aki $$1, gv $$2, art $$3) {
      if ($$1.x_().j() && $$1.X().b(cpg.e) && $$3.a(2000) < $$1.ai().a()) {
         while ($$1.a_($$2).a(this)) {
            $$2 = $$2.d();
         }

         if ($$1.a_($$2).a($$1, $$2, bik.bs)) {
            big $$4 = bik.bs.a($$1, $$2.c(), bja.d);
            if ($$4 != null) {
               $$4.as();
            }
         }
      }
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      hb.a $$6 = $$1.o();
      hb.a $$7 = $$0.c(a);
      boolean $$8 = $$7 != $$6 && $$6.d();
      return !$$8 && !$$2.a(this) && !new eaz($$3, $$4, $$7).c() ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, big $$3) {
      if ($$3.cs()) {
         $$3.f($$2);
      }
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      if ($$3.a(100) == 0) {
         $$1.a((double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, aou.sU, aov.e, 0.5F, $$3.i() * 0.4F + 0.8F, false);
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

         $$1.a(iw.X, $$5, $$6, $$7, $$8, $$9, $$10);
      }
   }

   @Override
   public ciw a(coq $$0, gv $$1, dey $$2) {
      return ciw.b;
   }

   @Override
   public dey a(dey $$0, cyw $$1) {
      switch ($$1) {
         case d:
         case b:
            switch ((hb.a)$$0.c(a)) {
               case c:
                  return $$0.a(a, hb.a.a);
               case a:
                  return $$0.a(a, hb.a.c);
               default:
                  return $$0;
            }
         default:
            return $$0;
      }
   }

   @Override
   protected void a(dez.a<csk, dey> $$0) {
      $$0.a(a);
   }
}
