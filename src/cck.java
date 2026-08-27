public class cck extends ccb {
   public cck(bip<? extends cck> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public cck(cpq $$0, bjb $$1, double $$2, double $$3, double $$4) {
      super(bip.aM, $$1, $$2, $$3, $$4, $$0);
   }

   public cck(cpq $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bip.aM, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(ehf $$0) {
      super.a($$0);
      if (!this.dK().B) {
         bil $$1 = $$0.a();
         bil $$2 = this.v();
         int $$3 = $$1.ax();
         $$1.g(5);
         if (!$$1.a(this.dL().a((ccb)this, $$2), 5.0F)) {
            $$1.h($$3);
         } else if ($$2 instanceof bjb) {
            this.a((bjb)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(ehe $$0) {
      super.a($$0);
      if (!this.dK().B) {
         bil $$1 = this.v();
         if (!($$1 instanceof bjd) || this.dK().X().b(cpm.c)) {
            gw $$2 = $$0.a().a($$0.b());
            if (this.dK().t($$2)) {
               this.dK().b($$2, cse.a(this.dK(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(ehg $$0) {
      super.a($$0);
      if (!this.dK().B) {
         this.ak();
      }
   }

   @Override
   public boolean br() {
      return false;
   }

   @Override
   public boolean a(bhj $$0, float $$1) {
      return false;
   }
}
