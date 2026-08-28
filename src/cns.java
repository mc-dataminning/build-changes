public class cns extends cni {
   public cns(bsz<? extends cns> $$0, dbx $$1) {
      super($$0, $$1);
   }

   public cns(dbx $$0, bto $$1, double $$2, double $$3, double $$4) {
      super(bsz.aQ, $$1, $$2, $$3, $$4, $$0);
   }

   public cns(dbx $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bsz.aQ, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(evn $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bst $$1 = $$0.a();
         bst $$2 = this.s();
         int $$3 = $$1.aB();
         $$1.g(5);
         if (!$$1.a(this.dQ().a((cni)this, $$2), 5.0F)) {
            $$1.i($$3);
         } else if ($$2 instanceof bto) {
            this.a((bto)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(evm $$0) {
      super.a($$0);
      if (!this.dP().B) {
         bst $$1 = this.s();
         if (!($$1 instanceof btq) || this.dP().ab().b(dbt.c)) {
            iz $$2 = $$0.a().a($$0.b());
            if (this.dP().u($$2)) {
               this.dP().b($$2, del.a(this.dP(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(evo $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.ao();
      }
   }

   @Override
   public boolean a(brm $$0, float $$1) {
      return false;
   }
}
