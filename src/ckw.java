public class ckw extends ckm {
   public ckw(bqg<? extends ckw> $$0, czg $$1) {
      super($$0, $$1);
   }

   public ckw(czg $$0, bqt $$1, double $$2, double $$3, double $$4) {
      super(bqg.aP, $$1, $$2, $$3, $$4, $$0);
   }

   public ckw(czg $$0, double $$1, double $$2, double $$3, double $$4, double $$5, double $$6) {
      super(bqg.aP, $$1, $$2, $$3, $$4, $$5, $$6, $$0);
   }

   @Override
   protected void a(esg $$0) {
      super.a($$0);
      if (!this.dM().B) {
         bqa $$1 = $$0.a();
         bqa $$2 = this.u();
         int $$3 = $$1.az();
         $$1.g(5);
         if (!$$1.a(this.dN().a((ckm)this, $$2), 5.0F)) {
            $$1.i($$3);
         } else if ($$2 instanceof bqt) {
            this.a((bqt)$$2, $$1);
         }
      }
   }

   @Override
   protected void a(esf $$0) {
      super.a($$0);
      if (!this.dM().B) {
         bqa $$1 = this.u();
         if (!($$1 instanceof bqv) || this.dM().aa().b(czc.c)) {
            id $$2 = $$0.a().a($$0.b());
            if (this.dM().u($$2)) {
               this.dM().b($$2, dbu.a(this.dM(), $$2));
            }
         }
      }
   }

   @Override
   protected void a(esh $$0) {
      super.a($$0);
      if (!this.dM().B) {
         this.am();
      }
   }

   @Override
   public boolean bw() {
      return false;
   }

   @Override
   public boolean a(boy $$0, float $$1) {
      return false;
   }
}
