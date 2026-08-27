public class ckv extends ckp {
   public ckv(bpd<?> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public ckv(cxb $$0, double $$1, double $$2, double $$3) {
      super(bpd.ar, $$0, $$1, $$2, $$3);
   }

   @Override
   public bnd a(ciu $$0, bnc $$1) {
      if ($$0.fO()) {
         return bnd.d;
      } else if (this.bP()) {
         return bnd.d;
      } else if (!this.dM().B) {
         return $$0.n(this) ? bnd.b : bnd.d;
      } else {
         return bnd.a;
      }
   }

   @Override
   protected cqh ah_() {
      return cqp.nL;
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.bP()) {
            this.bE();
         }

         if (this.O() == 0) {
            this.n(-this.P());
            this.d(10);
            this.b(50.0F);
            this.bt();
         }
      }
   }

   @Override
   public ckp.a v() {
      return ckp.a.a;
   }
}
