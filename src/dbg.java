public class dbg extends csv {
   protected static final int g = 2;
   protected static final eig h = csv.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);
   protected final iv i;

   protected dbg(dfi.d $$0, iv $$1) {
      super($$0);
      this.i = $$1;
   }

   @Override
   public eig a(dfj $$0, cpb $$1, gw $$2, ehs $$3) {
      return h;
   }

   @Override
   public dfj a(dfj $$0, hc $$1, dfj $$2, cpw $$3, gw $$4, gw $$5) {
      return $$1 == hc.a && !this.a($$0, $$3, $$4) ? csw.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfj $$0, cpy $$1, gw $$2) {
      return a($$1, $$2.d(), hc.b);
   }

   @Override
   public void a(dfj $$0, cpv $$1, gw $$2, asc $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(ix.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.i, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
