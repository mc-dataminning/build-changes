public class cgc extends cft {
   public cgc(bly<? extends cgc> $$0, cto $$1) {
      super($$0, $$1);
   }

   public cgc(cto $$0, bmk $$1, double $$2, double $$3, double $$4) {
      super(bly.aN, $$1, $$2, $$3, $$4, $$0);
   }

   public cgc(cto $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bly.aN, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(elp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         blu $$1 = $$0.a();
         blu $$2 = this.w();
         int $$3 = $$1.az();
         $$1.g(5);
         if (!$$1.a(this.dN().a((cft)this, $$2), 5.0F)) {
            $$1.h($$3);
         } else if ($$2 instanceof bmk) {
            this.a((bmk)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(elo $$0) {
      super.a($$0);
      if (!this.dM().B) {
         blu $$1 = this.w();
         if (!($$1 instanceof bmm) || this.dM().Z().b(ctk.c)) {
            hx $$2 = $$0.a().a($$0.b());
            if (this.dM().u($$2)) {
               this.dM().b($$2, cwc.a(this.dM(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(elq $$0) {
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
   public boolean a(bks $$0, float $$1) {
      return false;
   }
}
