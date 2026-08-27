public class dbb extends csq {
   protected static final int g = 2;
   protected static final eib h = csq.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);
   protected final iv i;

   protected dbb(dfd.d $$0, iv $$1) {
      super($$0);
      this.i = $$1;
   }

   @Override
   public eib a(dfe $$0, cow $$1, gw $$2, ehn $$3) {
      return h;
   }

   @Override
   public dfe a(dfe $$0, hc $$1, dfe $$2, cpr $$3, gw $$4, gw $$5) {
      return $$1 == hc.a && !this.a($$0, $$3, $$4) ? csr.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfe $$0, cpt $$1, gw $$2) {
      return a($$1, $$2.d(), hc.b);
   }

   @Override
   public void a(dfe $$0, cpq $$1, gw $$2, arx $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(ix.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.i, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
