public class dbi extends csx {
   protected static final int g = 2;
   protected static final eii h = csx.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);
   protected final iv i;

   protected dbi(dfk.d $$0, iv $$1) {
      super($$0);
      this.i = $$1;
   }

   @Override
   public eii a(dfl $$0, cpd $$1, gw $$2, ehu $$3) {
      return h;
   }

   @Override
   public dfl a(dfl $$0, hc $$1, dfl $$2, cpy $$3, gw $$4, gw $$5) {
      return $$1 == hc.a && !this.a($$0, $$3, $$4) ? csy.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfl $$0, cqa $$1, gw $$2) {
      return a($$1, $$2.d(), hc.b);
   }

   @Override
   public void a(dfl $$0, cpx $$1, gw $$2, ase $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(ix.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.i, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
