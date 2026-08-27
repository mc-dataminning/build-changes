public class ccv extends ccm {
   public ccv(bja<? extends ccv> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public ccv(cqb $$0, bjm $$1, double $$2, double $$3, double $$4) {
      super(bja.aM, $$1, $$2, $$3, $$4, $$0);
   }

   public ccv(cqb $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bja.aM, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(ehe $$0) {
      super.a($$0);
      if (!this.dL().B) {
         biw $$1 = $$0.a();
         biw $$2 = this.v();
         int $$3 = $$1.ax();
         $$1.g(5);
         if (!$$1.a(this.dM().a((ccm)this, $$2), 5.0F)) {
            $$1.h($$3);
         } else if ($$2 instanceof bjm) {
            this.a((bjm)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(ehd $$0) {
      super.a($$0);
      if (!this.dL().B) {
         biw $$1 = this.v();
         if (!($$1 instanceof bjo) || this.dL().X().b(cpx.c)) {
            gw $$2 = $$0.a().a($$0.b());
            if (this.dL().t($$2)) {
               this.dL().b($$2, csp.a(this.dL(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(ehf $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.ak();
      }
   }

   @Override
   public boolean br() {
      return false;
   }

   @Override
   public boolean a(bhu $$0, float $$1) {
      return false;
   }
}
