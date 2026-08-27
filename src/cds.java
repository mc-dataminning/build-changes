public class cds extends cdj {
   public cds(bjx<? extends cds> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cds(cqz $$0, bkj $$1, double $$2, double $$3, double $$4) {
      super(bjx.aM, $$1, $$2, $$3, $$4, $$0);
   }

   public cds(cqz $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bjx.aM, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(eic $$0) {
      super.a($$0);
      if (!this.dL().B) {
         bjt $$1 = $$0.a();
         bjt $$2 = this.v();
         int $$3 = $$1.ax();
         $$1.g(5);
         if (!$$1.a(this.dM().a((cdj)this, $$2), 5.0F)) {
            $$1.h($$3);
         } else if ($$2 instanceof bkj) {
            this.a((bkj)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(eib $$0) {
      super.a($$0);
      if (!this.dL().B) {
         bjt $$1 = this.v();
         if (!($$1 instanceof bkl) || this.dL().X().b(cqv.c)) {
            ht $$2 = $$0.a().a($$0.b());
            if (this.dL().t($$2)) {
               this.dL().b($$2, ctn.a(this.dL(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(eid $$0) {
      super.a($$0);
      if (!this.dL().B) {
         this.ak();
      }
   }

   @Override
   public boolean br() {
      return false;
   }

   @Override
   public boolean a(bir $$0, float $$1) {
      return false;
   }
}
