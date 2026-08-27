public class cnz extends cnt {
   public cnz(bsc<?> $$0, daz $$1) {
      super($$0, $$1);
   }

   public cnz(daz $$0, double $$1, double $$2, double $$3) {
      super(bsc.ar, $$0, $$1, $$2, $$3);
   }

   @Override
   public bpw a(cly $$0, bpv $$1) {
      if ($$0.fR()) {
         return bpw.d;
      } else if (this.bS()) {
         return bpw.d;
      } else if (!this.dP().B) {
         return $$0.n(this) ? bpw.b : bpw.d;
      } else {
         return bpw.a;
      }
   }

   @Override
   protected ctl ah_() {
      return ctt.nM;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bS()) {
            this.bH();
         }

         if (this.O() == 0) {
            this.n(-this.P());
            this.d(10);
            this.b(50.0F);
            this.bv();
         }
      }
   }

   @Override
   public cnt.a v() {
      return cnt.a.a;
   }
}
