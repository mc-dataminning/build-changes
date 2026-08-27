public class cdm extends cdg {
   public cdm(bip<?> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public cdm(cpq $$0, double $$1, double $$2, double $$3) {
      super(bip.an, $$0, $$1, $$2, $$3);
   }

   @Override
   public bgt a(cbp $$0, bgs $$1) {
      if ($$0.fG()) {
         return bgt.d;
      } else if (this.bO()) {
         return bgt.d;
      } else if (!this.dK().B) {
         return $$0.n(this) ? bgt.b : bgt.d;
      } else {
         return bgt.a;
      }
   }

   @Override
   protected civ j() {
      return cjd.na;
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
   public cdg.a t() {
      return cdg.a.a;
   }
}
