public class clh extends ckx {
   public clh(bqr<? extends clh> $$0, czu $$1) {
      super($$0, $$1);
   }

   public clh(czu $$0, bre $$1, double $$2, double $$3, double $$4) {
      super(bqr.aP, $$1, $$2, $$3, $$4, $$0);
   }

   public clh(czu $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bqr.aP, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(etc $$0) {
      super.a($$0);
      if (!this.dN().B) {
         bql $$1 = $$0.a();
         bql $$2 = this.u();
         int $$3 = $$1.az();
         $$1.g(5);
         if (!$$1.a(this.dO().a((ckx)this, $$2), 5.0F)) {
            $$1.i($$3);
         } else if ($$2 instanceof bre) {
            this.a((bre)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(etb $$0) {
      super.a($$0);
      if (!this.dN().B) {
         bql $$1 = this.u();
         if (!($$1 instanceof brg) || this.dN().aa().b(czq.c)) {
            im $$2 = $$0.a().a($$0.b());
            if (this.dN().u($$2)) {
               this.dN().b($$2, dci.a(this.dN(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(etd $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.am();
      }
   }

   @Override
   public boolean bx() {
      return false;
   }

   @Override
   public boolean a(bpj $$0, float $$1) {
      return false;
   }
}
