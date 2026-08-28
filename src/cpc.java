public class cpc extends coy {
   public cpc(bty<? extends cpc> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cpc(dej $$0, bun $$1, cvs $$2) {
      super(bty.L, $$1, $$0, $$2);
   }

   public cpc(dej $$0, double $$1, double $$2, double $$3, cvs $$4) {
      super(bty.L, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cvn o() {
      return cvw.tX;
   }

   @Override
   protected double bc() {
      return 0.07;
   }

   @Override
   protected void a(eyu $$0) {
      super.a($$0);
      if (this.dS() instanceof arj) {
         this.dS().c(2002, this.ds(), cxr.c(cxs.a));
         int $$1 = 3 + this.dS().z.a(5) + this.dS().z.a(5);
         bud.a((arj)this.dS(), this.dq(), $$1);
         this.as();
      }
   }
}
