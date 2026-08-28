public class cre extends cqx {
   private float b;
   private float c;

   public cre(but<?> $$0, dgj $$1) {
      super($$0, $$1);
   }

   @Override
   public bsl a(coy $$0, bsk $$1) {
      if (!$$0.fY() && !this.ca() && (this.dV().C || $$0.n(this))) {
         this.c = this.b;
         if (!this.dV().C) {
            return (bsl)($$0.n(this) ? bsl.c : bsl.e);
         } else {
            return bsl.a;
         }
      } else {
         return bsl.e;
      }
   }

   @Override
   protected cwm u() {
      return cwu.oo;
   }

   @Override
   public cwq dI() {
      return new cwq(cwu.oo);
   }

   @Override
   public void a(int $$0, int $$1, int $$2, boolean $$3) {
      if ($$3) {
         if (this.ca()) {
            this.bP();
         }

         if (this.N() == 0) {
            this.l(-this.O());
            this.d(10);
            this.b(50.0F);
            this.bD();
         }
      }
   }

   @Override
   public boolean B() {
      return true;
   }

   @Override
   public void h() {
      double $$0 = (double)this.dL();
      fbb $$1 = this.dt();
      super.h();
      double $$2 = ((double)this.dL() - $$0) % 360.0;
      if (this.dV().C && $$1.f(this.dt()) > 0.01) {
         this.b += (float)$$2;
         this.b %= 360.0F;
      }
   }

   @Override
   protected void a(bum $$0, bum.a $$1) {
      super.a($$0, $$1);
      if (this.dV().C && $$0 instanceof coy $$2 && $$2.gQ() && b(this.dV())) {
         float $$3 = (float)ayz.e(0.5, (double)this.c, (double)this.b);
         $$2.v($$2.dL() - ($$3 - this.c));
         this.c = $$3;
      }
   }
}
