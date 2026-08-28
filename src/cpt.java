public class cpt extends cpv {
   public cpt(buq<? extends cpt> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public cpt(dgg $$0, bvf $$1, cwn $$2) {
      super(buq.bj, $$1, $$0, $$2);
   }

   public cpt(dgg $$0, double $$1, double $$2, double $$3, cwn $$4) {
      super(buq.bj, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cwj m() {
      return cwr.rj;
   }

   private lr s() {
      cwn $$0 = this.l();
      return (lr)($$0.f() ? lt.Y : new lp(lt.T, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lr $$1 = this.s();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dW().a($$1, this.dB(), this.dD(), this.dH(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(fav $$0) {
      super.a($$0);
      buj $$1 = $$0.a();
      int $$2 = $$1 instanceof clf ? 3 : 0;
      $$1.a(this.dX().b(this, this.p()), (float)$$2);
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.dW().a(this, (byte)3);
         this.at();
      }
   }
}
