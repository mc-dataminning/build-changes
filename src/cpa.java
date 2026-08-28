public class cpa extends coy {
   private static final btu b = btu.c(0.0F, 0.0F);

   public cpa(bty<? extends cpa> $$0, dej $$1) {
      super($$0, $$1);
   }

   public cpa(dej $$0, bun $$1, cvs $$2) {
      super(bty.C, $$1, $$0, $$2);
   }

   public cpa(dej $$0, double $$1, double $$2, double $$3, cvs $$4) {
      super(bty.C, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dS()
               .a(
                  new lk(lo.S, this.m()),
                  this.dx(),
                  this.dz(),
                  this.dD(),
                  ((double)this.af.i() - 0.5) * 0.08,
                  ((double)this.af.i() - 0.5) * 0.08,
                  ((double)this.af.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(eyt $$0) {
      super.a($$0);
      $$0.a().a(this.dT().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(eyu $$0) {
      super.a($$0);
      if (!this.dS().B) {
         if (this.af.a(8) == 0) {
            int $$1 = 1;
            if (this.af.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               cgi $$3 = bty.t.a(this.dS(), btx.k);
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.dx(), this.dz(), this.dD(), this.dI(), 0.0F);
                  if (!$$3.a(b)) {
                     break;
                  }

                  this.dS().b($$3);
               }
            }
         }

         this.dS().a(this, (byte)3);
         this.as();
      }
   }

   @Override
   protected cvn o() {
      return cvw.qS;
   }
}
