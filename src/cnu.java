public class cnu extends cnk {
   public cnu(btb<? extends cnu> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public cnu(dbz $$0, btq $$1, double $$2, double $$3, double $$4) {
      super(btb.aQ, $$1, $$2, $$3, $$4, $$0);
   }

   public cnu(dbz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(btb.aQ, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(evp $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bsv $$1 = $$0.a();
         bsv $$2 = this.s();
         int $$3 = $$1.aB();
         $$1.g(5);
         if (!$$1.a(this.dQ().a((cnk)this, $$2), 5.0F)) {
            $$1.i($$3);
         } else if ($$2 instanceof btq) {
            this.a((btq)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(evo $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bsv $$1 = this.s();
         if (!($$1 instanceof bts) || this.dP().ab().b(dbv.c)) {
            iz $$2 = $$0.a().a($$0.b());
            if (this.dP().u($$2)) {
               this.dP().b($$2, den.a(this.dP(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(evq $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.ao();
      }
   }

   @Override
   public boolean a(bro $$0, float $$1) {
      return false;
   }
}
