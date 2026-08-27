public class cdj extends cdd {
   public cdj(bim<?> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public cdj(cpl $$0, double $$1, double $$2, double $$3) {
      super(bim.an, $$0, $$1, $$2, $$3);
   }

   @Override
   public bgq a(cbm $$0, bgp $$1) {
      if ($$0.fG()) {
         return bgq.d;
      } else if (this.bO()) {
         return bgq.d;
      } else if (!this.dK().B) {
         return $$0.n(this) ? bgq.b : bgq.d;
      } else {
         return bgq.a;
      }
   }

   @Override
   protected cis j() {
      return cja.na;
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
   public cdd.a t() {
      return cdd.a.a;
   }
}
