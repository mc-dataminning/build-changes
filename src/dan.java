public class dan extends csx {
   private static final eii a = csx.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int b = 14;
   private static final int c = 10;
   private static final int d = 10;

   public dan(dfk.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return csx.a($$1, $$2.c(), hc.a) && !$$1.y($$2);
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$1 == hc.b && !this.a($$0, $$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(ix.at, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      gw.a $$10 = new gw.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + ary.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + ary.a($$3, -10, 10));
         dfl $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(ix.ax, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return a;
   }
}
