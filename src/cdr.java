public class cdr extends cdl {
   public cdr(biu<?> $$0, cpv $$1) {
      super($$0, $$1);
   }

   public cdr(cpv $$0, double $$1, double $$2, double $$3) {
      super(biu.an, $$0, $$1, $$2, $$3);
   }

   @Override
   public bgy a(cbu $$0, bgx $$1) {
      if ($$0.fH()) {
         return bgy.d;
      } else if (this.bP()) {
         return bgy.d;
      } else if (!this.dL().B) {
         return $$0.n(this) ? bgy.b : bgy.d;
      } else {
         return bgy.a;
      }
   }

   @Override
   protected cja q() {
      return cji.na;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bP()) {
            this.bB();
         }

         if (this.x() == 0) {
            this.d(-this.y());
            this.c(10);
            this.a(50.0F);
            this.bp();
         }
      }
   }

   @Override
   public cdl.a z() {
      return cdl.a.a;
   }
}
