public class cgl extends cgc {
   public cgl(bmc<? extends cgl> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cgl(ctx $$0, bmo $$1, double $$2, double $$3, double $$4) {
      super(bmc.aO, $$1, $$2, $$3, $$4, $$0);
   }

   public cgl(ctx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bmc.aO, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(elz $$0) {
      super.a($$0);
      if (!this.dL().B) {
         blw $$1 = $$0.a();
         blw $$2 = this.w();
         int $$3 = $$1.az();
         $$1.g(5);
         if (!$$1.a(this.dM().a((cgc)this, $$2), 5.0F)) {
            $$1.h($$3);
         } else if ($$2 instanceof bmo) {
            this.a((bmo)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(ely $$0) {
      super.a($$0);
      if (!this.dL().B) {
         blw $$1 = this.w();
         if (!($$1 instanceof bmq) || this.dL().Z().b(ctt.c)) {
            hx $$2 = $$0.a().a($$0.b());
            if (this.dL().u($$2)) {
               this.dL().b($$2, cwl.a(this.dL(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(ema $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.am();
      }
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bkv $$0, float $$1) {
      return false;
   }
}
