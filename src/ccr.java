public class ccr extends cci {
   public ccr(biw<? extends ccr> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public ccr(cpx $$0, bji $$1, double $$2, double $$3, double $$4) {
      super(biw.aM, $$1, $$2, $$3, $$4, $$0);
   }

   public ccr(cpx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(biw.aM, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(ehm $$0) {
      super.a($$0);
      if (!this.dL().B) {
         bis $$1 = $$0.a();
         bis $$2 = this.v();
         int $$3 = $$1.ax();
         $$1.g(5);
         if (!$$1.a(this.dM().a((cci)this, $$2), 5.0F)) {
            $$1.h($$3);
         } else if ($$2 instanceof bji) {
            this.a((bji)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(ehl $$0) {
      super.a($$0);
      if (!this.dL().B) {
         bis $$1 = this.v();
         if (!($$1 instanceof bjk) || this.dL().X().b(cpt.c)) {
            gw $$2 = $$0.a().a($$0.b());
            if (this.dL().t($$2)) {
               this.dL().b($$2, csl.a(this.dL(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(ehn $$0) {
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
   public boolean a(bhq $$0, float $$1) {
      return false;
   }
}
