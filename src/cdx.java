public class cdx extends cdr {
   public cdx(bja<?> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public cdx(cqb $$0, double $$1, double $$2, double $$3) {
      super(bja.an, $$0, $$1, $$2, $$3);
   }

   @Override
   public bhe a(cca $$0, bhd $$1) {
      if ($$0.fI()) {
         return bhe.d;
      } else if (this.bO()) {
         return bhe.d;
      } else if (!this.dL().B) {
         return $$0.n(this) ? bhe.b : bhe.d;
      } else {
         return bhe.a;
      }
   }

   @Override
   protected cjg q() {
      return cjo.na;
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
   public cdr.a z() {
      return cdr.a.a;
   }
}
