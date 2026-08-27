public class cci extends cbz {
   public cci(bim<? extends cci> $$0, cpm $$1) {
      super($$0, $$1);
   }

   public cci(cpm $$0, biy $$1, double $$2, double $$3, double $$4) {
      super(bim.aM, $$1, $$2, $$3, $$4, $$0);
   }

   public cci(cpm $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bim.aM, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(ehb $$0) {
      super.a($$0);
      if (!this.dK().B) {
         bii $$1 = $$0.a();
         bii $$2 = this.v();
         int $$3 = $$1.ax();
         $$1.g(5);
         if (!$$1.a(this.dL().a((cbz)this, $$2), 5.0F)) {
            $$1.h($$3);
         } else if ($$2 instanceof biy) {
            this.a((biy)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(eha $$0) {
      super.a($$0);
      if (!this.dK().B) {
         bii $$1 = this.v();
         if (!($$1 instanceof bja) || this.dK().X().b(cpi.c)) {
            gu $$2 = $$0.a().a($$0.b());
            if (this.dK().t($$2)) {
               this.dK().b($$2, csa.a(this.dK(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(ehc $$0) {
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
   public boolean a(bhg $$0, float $$1) {
      return false;
   }
}
