public class cys extends cxh implements cyp {
   private final cyp.a F;

   public cys(cyp.a $$0, dcb $$1, dca.d $$2) {
      super($$1, $$2);
      this.F = $$0;
   }

   @Override
   public void b(dcb $$0, aif $$1, gu $$2, apf $$3) {
      this.a_($$0, $$1, $$2, $$3);
   }

   @Override
   public boolean e_(dcb $$0) {
      return cyp.c($$0.b()).isPresent();
   }

   public cyp.a g() {
      return this.F;
   }
}
