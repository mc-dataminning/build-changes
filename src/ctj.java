public class ctj extends cvy implements cso, cth {
   public ctj(dez.d $$0) {
      super($$0, ha.a, r_, false);
      this.k(this.C.b().a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected cvz b() {
      return (cvz)csn.ru;
   }

   @Override
   protected dfa a(dfa $$0, dfa $$1) {
      return $$1.a(s_, $$0.c(s_));
   }

   @Override
   public ciy a(cos $$0, gu $$1, dfa $$2) {
      return new ciy(cjb.vw);
   }

   @Override
   public bgq a(dfa $$0, cpm $$1, gu $$2, cbn $$3, bgp $$4, eha $$5) {
      return cth.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dfb.a<csm, dfa> $$0) {
      $$0.a(s_);
   }

   @Override
   public boolean a(cpp $$0, gu $$1, dfa $$2) {
      return !$$2.c(s_);
   }

   @Override
   public boolean a(cpm $$0, aru $$1, gu $$2, dfa $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dfa $$3) {
      $$0.a($$2, $$3.a(s_, Boolean.valueOf(true)), 2);
   }
}
