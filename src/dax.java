public class dax extends csm {
   protected static final int g = 2;
   protected static final ehx h = csm.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);
   protected final it i;

   protected dax(dez.d $$0, it $$1) {
      super($$0);
      this.i = $$1;
   }

   @Override
   public ehx a(dfa $$0, cos $$1, gu $$2, ehj $$3) {
      return h;
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return $$1 == ha.a && !this.a($$0, $$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      return a($$1, $$2.d(), ha.b);
   }

   @Override
   public void a(dfa $$0, cpm $$1, gu $$2, aru $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(iv.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.i, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
