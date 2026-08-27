public class cid extends cht {
   public cid(bnu<? extends cid> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public cid(cvn $$0, bog $$1, double $$2, double $$3, double $$4) {
      super(bnu.aO, $$1, $$2, $$3, $$4, $$0);
   }

   public cid(cvn $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bnu.aO, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(enp $$0) {
      super.a($$0);
      if (!this.dM().B) {
         bno $$1 = $$0.a();
         bno $$2 = this.w();
         int $$3 = $$1.az();
         $$1.g(5);
         if (!$$1.a(this.dN().a((cht)this, $$2), 5.0F)) {
            $$1.i($$3);
         } else if ($$2 instanceof bog) {
            this.a((bog)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(eno $$0) {
      super.a($$0);
      if (!this.dM().B) {
         bno $$1 = this.w();
         if (!($$1 instanceof boi) || this.dM().Z().b(cvj.c)) {
            hz $$2 = $$0.a().a($$0.b());
            if (this.dM().u($$2)) {
               this.dM().b($$2, cyb.a(this.dM(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(enq $$0) {
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
   public boolean a(bmn $$0, float $$1) {
      return false;
   }
}
