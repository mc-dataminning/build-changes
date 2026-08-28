public class cnm extends cnk {
   private static final bsk b = bsk.c(0.0F, 0.0F);

   public cnm(bsn<? extends cnm> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cnm(dcg $$0, btc $$1) {
      super(bsn.C, $$1, $$0);
   }

   public cnm(dcg $$0, double $$1, double $$2, double $$3) {
      super(bsn.C, $$1, $$2, $$3, $$0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dR()
               .a(
                  new lf(lj.S, this.p()),
                  this.dw(),
                  this.dy(),
                  this.dC(),
                  ((double)this.ah.i() - 0.5) * 0.08,
                  ((double)this.ah.i() - 0.5) * 0.08,
                  ((double)this.ah.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(ewe $$0) {
      super.a($$0);
      $$0.a().a(this.dS().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(ewf $$0) {
      super.a($$0);
      if (!this.dR().B) {
         if (this.ah.a(8) == 0) {
            int $$1 = 1;
            if (this.ah.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               cex $$3 = bsn.t.a(this.dR());
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.dw(), this.dy(), this.dC(), this.dH(), 0.0F);
                  if (!$$3.a(b)) {
                     break;
                  }

                  this.dR().b($$3);
               }
            }
         }

         this.dR().a(this, (byte)3);
         this.aq();
      }
   }

   @Override
   protected cty t() {
      return cug.qR;
   }
}
