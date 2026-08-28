public class cpv extends cpx {
   public cpv(bur<? extends cpv> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cpv(dgi $$0, bvg $$1, cwp $$2) {
      super(bur.bk, $$1, $$0, $$2);
   }

   public cpv(dgi $$0, double $$1, double $$2, double $$3, cwp $$4) {
      super(bur.bk, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cwl m() {
      return cwt.rj;
   }

   private lr s() {
      cwp $$0 = this.l();
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
   protected void a(fax $$0) {
      super.a($$0);
      buk $$1 = $$0.a();
      int $$2 = $$1 instanceof clg ? 3 : 0;
      $$1.a(this.dX().b(this, this.p()), (float)$$2);
   }

   @Override
   protected void a(fay $$0) {
      super.a($$0);
      if (!this.dW().C) {
         this.dW().a(this, (byte)3);
         this.at();
      }
   }
}
