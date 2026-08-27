public class dav extends csk {
   protected static final int g = 2;
   protected static final ehy h = csk.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);
   protected final iu i;

   protected dav(dex.d $$0, iu $$1) {
      super($$0);
      this.i = $$1;
   }

   @Override
   public ehy a(dey $$0, coq $$1, gv $$2, ehk $$3) {
      return h;
   }

   @Override
   public dey a(dey $$0, hb $$1, dey $$2, cpl $$3, gv $$4, gv $$5) {
      return $$1 == hb.a && !this.a($$0, $$3, $$4) ? csl.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dey $$0, cpn $$1, gv $$2) {
      return a($$1, $$2.d(), hb.b);
   }

   @Override
   public void a(dey $$0, cpk $$1, gv $$2, art $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(iw.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.i, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
