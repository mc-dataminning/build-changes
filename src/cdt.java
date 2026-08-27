public class cdt extends cdn {
   public cdt(biw<?> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public cdt(cpx $$0, double $$1, double $$2, double $$3) {
      super(biw.an, $$0, $$1, $$2, $$3);
   }

   @Override
   public bha a(cbw $$0, bgz $$1) {
      if ($$0.fH()) {
         return bha.d;
      } else if (this.bO()) {
         return bha.d;
      } else if (!this.dL().B) {
         return $$0.n(this) ? bha.b : bha.d;
      } else {
         return bha.a;
      }
   }

   @Override
   protected cjc q() {
      return cjk.na;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bO()) {
            this.bA();
         }

         if (this.x() == 0) {
            this.d(-this.y());
            this.c(10);
            this.a(50.0F);
            this.bo();
         }
      }
   }

   @Override
   public cdn.a z() {
      return cdn.a.a;
   }
}
