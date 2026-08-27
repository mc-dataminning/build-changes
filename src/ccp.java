public class ccp extends ccl {
   public ccp(bim<? extends ccp> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public ccp(cpm $$0, biy $$1) {
      super(bim.I, $$1, $$0);
   }

   public ccp(cpm $$0, double $$1, double $$2, double $$3) {
      super(bim.I, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cit m() {
      return cjb.te;
   }

   @Override
   protected float p() {
      return 0.07F;
   }

   @Override
   protected void a(ehc $$0) {
      super.a($$0);
      if (this.dK() instanceof akk) {
         this.dK().c(2002, this.dk(), ckx.a(cky.c));
         int $$1 = 3 + this.dK().z.a(5) + this.dK().z.a(5);
         bio.a((akk)this.dK(), this.di(), $$1);
         this.ak();
      }
   }
}
