public class csp extends csl {
   public csp(bwr<? extends csp> $$0, djh $$1) {
      super($$0, $$1);
   }

   public csp(djh $$0, bxj $$1, czk $$2) {
      super(bwr.U, $$1, $$0, $$2);
   }

   public csp(djh $$0, double $$1, double $$2, double $$3, czk $$4) {
      super(bwr.U, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected czg g() {
      return czo.vf;
   }

   @Override
   protected double bb() {
      return 0.07;
   }

   @Override
   protected void a(fev $$0) {
      super.a($$0);
      if (this.dU() instanceof arq) {
         this.dU().c(2002, this.du(), -13083194);
         int $$1 = 3 + this.dU().A.a(5) + this.dU().A.a(5);
         bww.a((arq)this.dU(), $$0.g(), $$1);
         this.aq();
      }
   }
}
