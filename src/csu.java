public class csu extends csm {
   protected csu(dez.d $$0) {
      super($$0);
   }

   protected boolean d(dfa $$0, cos $$1, gu $$2) {
      return $$0.a(apl.af) || $$0.a(csn.cC);
   }

   @Override
   public dfa a(dfa $$0, ha $$1, dfa $$2, cpn $$3, gu $$4, gu $$5) {
      return !$$0.a($$3, $$4) ? csn.a.n() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public boolean a(dfa $$0, cpp $$1, gu $$2) {
      gu $$3 = $$2.d();
      return this.d($$1.a_($$3), $$1, $$3);
   }

   @Override
   public boolean c(dfa $$0, cos $$1, gu $$2) {
      return $$0.u().c();
   }

   @Override
   public boolean a(dfa $$0, cos $$1, gu $$2, eat $$3) {
      return $$3 == eat.c && !this.aE ? true : super.a($$0, $$1, $$2, $$3);
   }
}
