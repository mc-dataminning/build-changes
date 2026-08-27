public class daa extends csk {
   private static final ehy a = csk.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int b = 14;
   private static final int c = 10;
   private static final int d = 10;

   public daa(dex.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return csk.a($$1, $$2.c(), hb.a) && !$$1.y($$2);
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$1 == hb.b && !this.a($$0, $$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(iw.at, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      gv.a $$10 = new gv.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + aro.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + aro.a($$3, -10, 10));
         dey $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(iw.ax, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return a;
   }
}
