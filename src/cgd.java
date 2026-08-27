public class cgd extends cfu {
   public cgd(blz<? extends cgd> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public cgd(ctp $$0, bml $$1, double $$2, double $$3, double $$4) {
      super(blz.aN, $$1, $$2, $$3, $$4, $$0);
   }

   public cgd(ctp $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(blz.aN, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(elq $$0) {
      super.a($$0);
      if (!this.dM().B) {
         blv $$1 = $$0.a();
         blv $$2 = this.w();
         int $$3 = $$1.az();
         $$1.g(5);
         if (!$$1.a(this.dN().a((cfu)this, $$2), 5.0F)) {
            $$1.h($$3);
         } else if ($$2 instanceof bml) {
            this.a((bml)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(elp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         blv $$1 = this.w();
         if (!($$1 instanceof bmn) || this.dM().Z().b(ctl.c)) {
            hx $$2 = $$0.a().a($$0.b());
            if (this.dM().u($$2)) {
               this.dM().b($$2, cwd.a(this.dM(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(elr $$0) {
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
   public boolean a(bkt $$0, float $$1) {
      return false;
   }
}
