public class cpu extends cpw {
   public cpu(bur<? extends cpu> $$0, dgh $$1) {
      super($$0, $$1);
   }

   public cpu(dgh $$0, bvg $$1, cwo $$2) {
      super(bur.bj, $$1, $$0, $$2);
   }

   public cpu(dgh $$0, double $$1, double $$2, double $$3, cwo $$4) {
      super(bur.bj, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cwk m() {
      return cws.rj;
   }

   private lr s() {
      cwo $$0 = this.l();
      return (lr)($$0.f() ? lt.Y : new lp(lt.T, $$0));
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         lr $$1 = this.s();

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dV().a($$1, this.dA(), this.dC(), this.dG(), 0.0, 0.0, 0.0);
         }
      }
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      buk $$1 = $$0.a();
      int $$2 = $$1 instanceof clg ? 3 : 0;
      $$1.a(this.dW().b(this, this.p()), (float)$$2);
   }

   @Override
   protected void a(fax $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, (byte)3);
         this.at();
      }
   }
}
