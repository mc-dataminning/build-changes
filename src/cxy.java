public class cxy extends cpn {
   protected static final int g = 2;
   protected static final efb h = cpn.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);
   protected final it i;

   protected cxy(dca.d $$0, it $$1) {
      super($$0);
      this.i = $$1;
   }

   @Override
   public efb a(dcb $$0, cls $$1, gu $$2, een $$3) {
      return h;
   }

   @Override
   public dcb a(dcb $$0, ha $$1, dcb $$2, cmn $$3, gu $$4, gu $$5) {
      return $$1 == ha.a && !this.a($$0, $$3, $$4) ? cpo.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dcb $$0, cmp $$1, gu $$2) {
      return a($$1, $$2.d(), ha.b);
   }

   @Override
   public void a(dcb $$0, cmm $$1, gu $$2, apf $$3) {
      double $$4 = (double)$$2.u() + 0.5;
      double $$5 = (double)$$2.v() + 0.7;
      double $$6 = (double)$$2.w() + 0.5;
      $$1.a(iv.Z, $$4, $$5, $$6, 0.0, 0.0, 0.0);
      $$1.a(this.i, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }
}
