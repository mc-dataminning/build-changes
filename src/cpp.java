public class cpp extends cpn {
   private static final buh b = buh.c(0.0F, 0.0F);

   public cpp(bul<? extends cpp> $$0, dfb $$1) {
      super($$0, $$1);
   }

   public cpp(dfb $$0, bva $$1, cwb $$2) {
      super(bul.C, $$1, $$0, $$2);
   }

   public cpp(dfb $$0, double $$1, double $$2, double $$3, cwb $$4) {
      super(bul.C, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dX()
               .a(
                  new ln(lr.S, this.m()),
                  this.dC(),
                  this.dE(),
                  this.dI(),
                  ((double)this.af.i() - 0.5) * 0.08,
                  ((double)this.af.i() - 0.5) * 0.08,
                  ((double)this.af.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(ezk $$0) {
      super.a($$0);
      $$0.a().a(this.dY().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(ezl $$0) {
      super.a($$0);
      if (!this.dX().C) {
         if (this.af.a(8) == 0) {
            int $$1 = 1;
            if (this.af.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               cgw $$3 = bul.t.a(this.dX(), buk.k);
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.dC(), this.dE(), this.dI(), this.dN(), 0.0F);
                  if (!$$3.a(b)) {
                     break;
                  }

                  this.dX().b($$3);
               }
            }
         }

         this.dX().a(this, (byte)3);
         this.av();
      }
   }

   @Override
   protected cvx o() {
      return cwf.qS;
   }
}
