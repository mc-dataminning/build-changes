public class cth extends cvy implements csn, ctg {
   private static final float f = 0.11F;

   public cth(dey.d $$0) {
      super($$0, ha.a, r_, false, 0.1);
      this.k(this.C.b().a(d, Integer.valueOf(0)).a(s_, Boolean.valueOf(false)));
   }

   @Override
   protected int a(aru $$0) {
      return 1;
   }

   @Override
   protected boolean g(dez $$0) {
      return $$0.i();
   }

   @Override
   protected csl a() {
      return csm.rv;
   }

   @Override
   protected dez a(dez $$0, dez $$1) {
      return $$1.a(s_, $$0.c(s_));
   }

   @Override
   protected dez a(dez $$0, aru $$1) {
      return super.a($$0, $$1).a(s_, Boolean.valueOf($$1.i() < 0.11F));
   }

   @Override
   public cix a(cor $$0, gu $$1, dez $$2) {
      return new cix(cja.vw);
   }

   @Override
   public bgq a(dez $$0, cpl $$1, gu $$2, cbm $$3, bgp $$4, egz $$5) {
      return ctg.a($$3, $$0, $$1, $$2);
   }

   @Override
   protected void a(dfa.a<csl, dez> $$0) {
      super.a($$0);
      $$0.a(s_);
   }

   @Override
   public boolean a(cpo $$0, gu $$1, dez $$2) {
      return !$$2.c(s_);
   }

   @Override
   public boolean a(cpl $$0, aru $$1, gu $$2, dez $$3) {
      return true;
   }

   @Override
   public void a(akk $$0, aru $$1, gu $$2, dez $$3) {
      $$0.a($$2, $$3.a(s_, Boolean.valueOf(true)), 2);
   }
}
