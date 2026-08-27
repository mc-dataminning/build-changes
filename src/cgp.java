public class cgp extends cgj {
   public cgp(blj<?> $$0, csy $$1) {
      super($$0, $$1);
   }

   public cgp(csy $$0, double $$1, double $$2, double $$3) {
      super(blj.ao, $$0, $$1, $$2, $$3);
   }

   @Override
   public bjl a(cer $$0, bjk $$1) {
      if ($$0.fI()) {
         return bjl.d;
      } else if (this.bP()) {
         return bjl.d;
      } else if (!this.dM().B) {
         return $$0.n(this) ? bjl.b : bjl.d;
      } else {
         return bjl.a;
      }
   }

   @Override
   protected cmc ah_() {
      return cmk.nL;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bP()) {
            this.bB();
         }

         if (this.O() == 0) {
            this.m(-this.P());
            this.d(10);
            this.b(50.0F);
            this.bq();
         }
      }
   }

   @Override
   public cgj.a w() {
      return cgj.a.a;
   }
}
