public class cih extends chx {
   public cih(bnw<? extends cih> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public cih(cvr $$0, boi $$1, double $$2, double $$3, double $$4) {
      super(bnw.aO, $$1, $$2, $$3, $$4, $$0);
   }

   public cih(cvr $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bnw.aO, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(enw $$0) {
      super.a($$0);
      if (!this.dM().B) {
         bnq $$1 = $$0.a();
         bnq $$2 = this.w();
         int $$3 = $$1.az();
         $$1.g(5);
         if (!$$1.a(this.dN().a((chx)this, $$2), 5.0F)) {
            $$1.i($$3);
         } else if ($$2 instanceof boi) {
            this.a((boi)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(env $$0) {
      super.a($$0);
      if (!this.dM().B) {
         bnq $$1 = this.w();
         if (!($$1 instanceof bok) || this.dM().Z().b(cvn.c)) {
            hz $$2 = $$0.a().a($$0.b());
            if (this.dM().u($$2)) {
               this.dM().b($$2, cyf.a(this.dM(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(enx $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.am();
      }
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bmp $$0, float $$1) {
      return false;
   }
}
