public class cnz extends cnx {
   public cnz(btb<? extends cnz> $$0, dbz $$1) {
      super($$0, $$1);
   }

   public cnz(dbz $$0, btq $$1) {
      super(btb.C, $$1, $$0);
   }

   public cnz(dbz $$0, double $$1, double $$2, double $$3) {
      super(btb.C, $$1, $$2, $$3, $$0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dP()
               .a(
                  new le(li.S, this.p()),
                  this.du(),
                  this.dw(),
                  this.dA(),
                  ((double)this.ah.i() - 0.5) * 0.08,
                  ((double)this.ah.i() - 0.5) * 0.08,
                  ((double)this.ah.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(evp $$0) {
      super.a($$0);
      $$0.a().a(this.dQ().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(evq $$0) {
      super.a($$0);
      if (!this.dP().B) {
         if (this.ah.a(8) == 0) {
            int $$1 = 1;
            if (this.ah.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               cfl $$3 = btb.t.a(this.dP());
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.du(), this.dw(), this.dA(), this.dF(), 0.0F);
                  this.dP().b($$3);
               }
            }
         }

         this.dP().a(this, (byte)3);
         this.ao();
      }
   }

   @Override
   protected cul u() {
      return cut.qR;
   }
}
