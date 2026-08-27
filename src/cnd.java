public class cnd extends cmz {
   public cnd(bsb<? extends cnd> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cnd(dca $$0, bso $$1) {
      super(bsb.N, $$1, $$0);
   }

   public cnd(dca $$0, double $$1, double $$2, double $$3) {
      super(bsb.N, $$1, $$2, $$3, $$0);
   }

   @Override
   protected cuc r() {
      return cuk.vy;
   }

   @Override
   protected double bc() {
      return 0.07;
   }

   @Override
   protected void a(ews $$0) {
      super.a($$0);
      if (this.dU() instanceof aqt) {
         this.dU().c(2002, this.du(), cwr.c(cws.a));
         int $$1 = 3 + this.dU().A.a(5) + this.dU().A.a(5);
         bse.a((aqt)this.dU(), this.ds(), $$1);
         this.ao();
      }
   }
}
