public class coc extends cnw {
   public coc(bsb<?> $$0, dca $$1) {
      super($$0, $$1);
   }

   public coc(dca $$0, double $$1, double $$2, double $$3) {
      super(bsb.as, $$0, $$1, $$2, $$3);
   }

   @Override
   public bqa a(cly $$0, bpz $$1) {
      if ($$0.ga()) {
         return bqa.d;
      } else if (this.bX()) {
         return bqa.d;
      } else if (!this.dU().C) {
         return $$0.n(this) ? bqa.b : bqa.d;
      } else {
         return bqa.a;
      }
   }

   @Override
   protected cuc ah_() {
      return cuk.pc;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bX()) {
            this.bM();
         }

         if (this.O() == 0) {
            this.n(-this.P());
            this.d(10);
            this.b(50.0F);
            this.bA();
         }
      }
   }

   @Override
   public cnw.a u() {
      return cnw.a.a;
   }
}
