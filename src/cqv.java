public class cqv extends cqr {
   public cqv(bvi<? extends cqv> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqv(dgz $$0, bvy $$1, cxh $$2) {
      super(bvi.U, $$1, $$0, $$2);
   }

   public cqv(dgz $$0, double $$1, double $$2, double $$3, cxh $$4) {
      super(bvi.U, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cxd g() {
      return cxl.uW;
   }

   @Override
   protected double bd() {
      return 0.07;
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (this.dU() instanceof ard) {
         this.dU().c(2002, this.du(), -13083194);
         int $$1 = 3 + this.dU().A.a(5) + this.dU().A.a(5);
         bvn.a((ard)this.dU(), $$0.g(), $$1);
         this.at();
      }
   }
}
