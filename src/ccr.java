public class ccr extends ccn {
   public ccr(bip<? extends ccr> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public ccr(cpq $$0, bjb $$1) {
      super(bip.I, $$1, $$0);
   }

   public ccr(cpq $$0, double $$1, double $$2, double $$3) {
      super(bip.I, $$1, $$2, $$3, $$0);
   }

   @Override
   protected civ m() {
      return cjd.te;
   }

   @Override
   protected float p() {
      return 0.07F;
   }

   @Override
   protected void a(ehg $$0) {
      super.a($$0);
      if (this.dK() instanceof akn) {
         this.dK().c(2002, this.dk(), ckz.a(cla.c));
         int $$1 = 3 + this.dK().z.a(5) + this.dK().z.a(5);
         bir.a((akn)this.dK(), this.di(), $$1);
         this.ak();
      }
   }
}
