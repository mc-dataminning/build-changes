public class cra extends cqw {
   public cra(bvq<? extends cra> $$0, dhh $$1) {
      super($$0, $$1);
   }

   public cra(dhh $$0, bwf $$1, cxo $$2) {
      super(bvq.V, $$1, $$0, $$2);
   }

   public cra(dhh $$0, double $$1, double $$2, double $$3, cxo $$4) {
      super(bvq.V, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cxk m() {
      return cxs.uL;
   }

   @Override
   protected double bd() {
      return 0.07;
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (this.dV() instanceof ash) {
         this.dV().c(2002, this.dv(), czn.c(czo.a));
         int $$1 = 3 + this.dV().A.a(5) + this.dV().A.a(5);
         bvv.a((ash)this.dV(), this.dt(), $$1);
         this.at();
      }
   }
}
