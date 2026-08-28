public abstract class bvo extends bvi {
   protected static final float bX = 0.0F;

   protected bvo(bur<? extends bvo> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public float c(ji $$0) {
      return this.a($$0, this.dW());
   }

   public float a(ji $$0, dgl $$1) {
      return 0.0F;
   }

   @Override
   public boolean a(dgj $$0, buq $$1) {
      return this.a(this.dw(), $$0) >= 0.0F;
   }

   public boolean gl() {
      return !this.L().k();
   }

   public boolean gm() {
      if (this.bE.a(cek.Z)) {
         return this.bE.c(cek.Z).isPresent();
      } else {
         for (cds $$0 : this.bS.b()) {
            if ($$0.h() && $$0.k() instanceof ccx) {
               return true;
            }
         }

         return false;
      }
   }

   protected boolean gn() {
      return true;
   }

   @Override
   public void a(buk $$0) {
      super.a($$0);
      if (this.gn() && !this.gm()) {
         this.bS.b(cce.a.a);
         float $$1 = 2.0F;
         float $$2 = this.f($$0);
         fba $$3 = new fba($$0.dB() - this.dB(), $$0.dD() - this.dD(), $$0.dH() - this.dH()).d().c((double)Math.max($$2 - 2.0F, 0.0F));
         this.L().a(this.dB() + $$3.d, this.dD() + $$3.e, this.dH() + $$3.f, this.go());
      }
   }

   @Override
   public boolean a(buk $$0, float $$1) {
      this.a($$0.dw(), 5);
      return true;
   }

   protected double go() {
      return 1.0;
   }
}
