public class ceu extends cel {
   public ceu(bkz<? extends ceu> $$0, csf $$1) {
      super($$0, $$1);
   }

   public ceu(csf $$0, bll $$1, double $$2, double $$3, double $$4) {
      super(bkz.aM, $$1, $$2, $$3, $$4, $$0);
   }

   public ceu(csf $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bkz.aM, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(ejw $$0) {
      super.a($$0);
      if (!this.dN().B) {
         bkv $$1 = $$0.a();
         bkv $$2 = this.w();
         int $$3 = $$1.az();
         $$1.g(5);
         if (!$$1.a(this.dO().a((cel)this, $$2), 5.0F)) {
            $$1.h($$3);
         } else if ($$2 instanceof bll) {
            this.a((bll)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(ejv $$0) {
      super.a($$0);
      if (!this.dN().B) {
         bkv $$1 = this.w();
         if (!($$1 instanceof bln) || this.dN().Y().b(csb.c)) {
            hx $$2 = $$0.a().a($$0.b());
            if (this.dN().t($$2)) {
               this.dN().b($$2, cus.a(this.dN(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(ejx $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.am();
      }
   }

   @Override
   public boolean bt() {
      return false;
   }

   @Override
   public boolean a(bjt $$0, float $$1) {
      return false;
   }
}
