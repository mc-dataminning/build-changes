public class daw extends csl {
   protected static final int g = 2;
   protected static final ehw h = csl.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);
   protected final it i;

   protected daw(dey.d $$0, it $$1) {
      super($$0);
      this.i = $$1;
   }

   @Override
   public ehw a(dez $$0, cor $$1, gu $$2, ehi $$3) {
      return h;
   }

   @Override
   public dez a(dez $$0, ha $$1, dez $$2, cpm $$3, gu $$4, gu $$5) {
      return $$1 == ha.a && !this.a($$0, $$3, $$4) ? csm.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dez $$0, cpo $$1, gu $$2) {
      return a($$1, $$2.d(), ha.b);
   }

   @Override
   public void a(dez $$0, cpl $$1, gu $$2, aru $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(iv.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.i, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
