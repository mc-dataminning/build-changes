public class cmi extends cmg {
   public cmi(brn<? extends cmi> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cmi(dad $$0, bsa $$1) {
      super(brn.C, $$1, $$0);
   }

   public cmi(dad $$0, double $$1, double $$2, double $$3) {
      super(brn.C, $$1, $$2, $$3, $$0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dN()
               .a(
                  new kt(kx.Q, this.p()),
                  this.ds(),
                  this.du(),
                  this.dy(),
                  ((double)this.ah.i() - 0.5) * 0.08,
                  ((double)this.ah.i() - 0.5) * 0.08,
                  ((double)this.ah.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(etm $$0) {
      super.a($$0);
      $$0.a().a(this.dO().b(this, this.u()), 0.0F);
   }

   @Override
   protected void a(etn $$0) {
      super.a($$0);
      if (!this.dN().B) {
         if (this.ah.a(8) == 0) {
            int $$1 = 1;
            if (this.ah.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               cdu $$3 = brn.t.a(this.dN());
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.ds(), this.du(), this.dy(), this.dD(), 0.0F);
                  this.dN().b($$3);
               }
            }
         }

         this.dN().a(this, (byte)3);
         this.am();
      }
   }

   @Override
   protected csu r() {
      return ctc.qR;
   }
}
