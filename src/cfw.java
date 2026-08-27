public class cfw extends cfn {
   public cfw(blt<? extends cfw> $$0, cti $$1) {
      super($$0, $$1);
   }

   public cfw(cti $$0, bmf $$1, double $$2, double $$3, double $$4) {
      super(blt.aN, $$1, $$2, $$3, $$4, $$0);
   }

   public cfw(cti $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(blt.aN, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(elj $$0) {
      super.a($$0);
      if (!this.dM().B) {
         blp $$1 = $$0.a();
         blp $$2 = this.w();
         int $$3 = $$1.az();
         $$1.g(5);
         if (!$$1.a(this.dN().a((cfn)this, $$2), 5.0F)) {
            $$1.h($$3);
         } else if ($$2 instanceof bmf) {
            this.a((bmf)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(eli $$0) {
      super.a($$0);
      if (!this.dM().B) {
         blp $$1 = this.w();
         if (!($$1 instanceof bmh) || this.dM().Z().b(cte.c)) {
            hx $$2 = $$0.a().a($$0.b());
            if (this.dM().u($$2)) {
               this.dM().b($$2, cvw.a(this.dM(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(elk $$0) {
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
   public boolean a(bkn $$0, float $$1) {
      return false;
   }
}
