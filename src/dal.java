public class dal extends csv {
   private static final eig a = csv.a(2.0, 13.0, 2.0, 14.0, 16.0, 14.0);
   private static final int b = 14;
   private static final int c = 10;
   private static final int d = 10;

   public dal(dfi.d $$0) {
      super($$0);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return csv.a($$1, $$2.c(), ha.a) && !$$1.y($$2);
   }

   @Override
   public dfj a(dfj $$0, ha $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return $$1 == ha.b && !this.a($$0, $$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      int $$4 = $$2.u();
      int $$5 = $$2.v();
      int $$6 = $$2.w();
      double $$7 = (double)$$4 + $$3.j();
      double $$8 = (double)$$5 + 0.7;
      double $$9 = (double)$$6 + $$3.j();
      $$1.a(iv.at, $$7, $$8, $$9, 0.0, 0.0, 0.0);
      gw.a $$10 = new gw.a();

      for (int $$11 = 0; $$11 < 14; $$11++) {
         $$10.d($$4 + arw.a($$3, -10, 10), $$5 - $$3.a(10), $$6 + arw.a($$3, -10, 10));
         dfj $$12 = $$1.a_($$10);
         if (!$$12.r($$1, $$10)) {
            $$1.a(iv.ax, (double)$$10.u() + $$3.j(), (double)$$10.v() + $$3.j(), (double)$$10.w() + $$3.j(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return a;
   }
}
