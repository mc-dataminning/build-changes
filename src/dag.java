public class dag extends csq {
   private static final eib a = csq.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int b = 14;
   private static final int c = 10;
   private static final int d = 10;

   public dag(dfd.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return csq.a($$1, $$2.c(), hc.a) && !$$1.y($$2);
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return $$1 == hc.b && !this.a($$0, $$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(ix.at, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      gw.a $$10 = new gw.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + ars.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + ars.a($$3, -10, 10));
         dfe $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(ix.ax, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return a;
   }
}
