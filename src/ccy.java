public class ccy extends ccu {
   public ccy(biw<? extends ccy> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public ccy(cpx $$0, bji $$1) {
      super(biw.I, $$1, $$0);
   }

   public ccy(cpx $$0, double $$1, double $$2, double $$3) {
      super(biw.I, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cjc s() {
      return cjk.te;
   }

   @Override
   protected float w() {
      return 0.07F;
   }

   @Override
   protected void a(ehn $$0) {
      super.a($$0);
      if (this.dL() instanceof aks) {
         this.dL().c(2002, this.dl(), clg.a(clh.c));
         int $$1 = 3 + this.dL().z.a(5) + this.dL().z.a(5);
         biy.a((aks)this.dL(), this.dj(), $$1);
         this.ak();
      }
   }
}
