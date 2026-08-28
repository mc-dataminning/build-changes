public class cpw extends cpy {
   public cpw(but<? extends cpw> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public cpw(dgj $$0, bvi $$1, cwq $$2) {
      super(but.bj, $$1, $$0, $$2);
   }

   public cpw(dgj $$0, double $$1, double $$2, double $$3, cwq $$4) {
      super(but.bj, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   protected cwm m() {
      return cwu.rj;
   }

   private lr s() {
      cwq $$0 = this.l();
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
   protected void a(fay $$0) {
      super.a($$0);
      bum $$1 = $$0.a();
      int $$2 = $$1 instanceof cli ? 3 : 0;
      $$1.a(this.dW().b(this, this.p()), (float)$$2);
   }

   @Override
   protected void a(faz $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.dV().a(this, (byte)3);
         this.at();
      }
   }
}
