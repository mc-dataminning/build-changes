public class ceo extends cek {
   public ceo(bkm<? extends ceo> $$0, crs $$1) {
      super($$0, $$1);
   }

   public ceo(crs $$0, bky $$1) {
      super(bkm.I, $$1, $$0);
   }

   public ceo(crs $$0, double $$1, double $$2, double $$3) {
      super(bkm.I, $$1, $$2, $$3, $$0);
   }

   @Override
   protected ckw s() {
      return cle.tf;
   }

   @Override
   protected float w() {
      return 0.07F;
   }

   @Override
   protected void a(ejg $$0) {
      super.a($$0);
      if (this.dL() instanceof ama) {
         this.dL().c(2002, this.dl(), cna.a(cnb.c));
         int $$1 = 3 + this.dL().z.a(5) + this.dL().z.a(5);
         bko.a((ama)this.dL(), this.dj(), $$1);
         this.ak();
      }
   }
}
