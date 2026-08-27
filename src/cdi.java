public class cdi extends cdc {
   public cdi(bik<?> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public cdi(cpk $$0, double $$1, double $$2, double $$3) {
      super(bik.an, $$0, $$1, $$2, $$3);
   }

   @Override
   public bgo a(cbl $$0, bgn $$1) {
      if ($$0.fG()) {
         return bgo.d;
      } else if (this.bO()) {
         return bgo.d;
      } else if (!this.dK().B) {
         return $$0.n(this) ? bgo.b : bgo.d;
      } else {
         return bgo.a;
      }
   }

   @Override
   protected cir j() {
      return ciz.na;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bO()) {
            this.bA();
         }

         if (this.r() == 0) {
            this.d(-this.s());
            this.c(10);
            this.a(50.0F);
            this.bo();
         }
      }
   }

   @Override
   public cdc.a t() {
      return cdc.a.a;
   }
}
