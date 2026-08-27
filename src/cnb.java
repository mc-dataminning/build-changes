public class cnb extends cmz {
   public cnb(bsb<? extends cnb> $$0, dca $$1) {
      super($$0, $$1);
   }

   public cnb(dca $$0, bso $$1) {
      super(bsb.E, $$1, $$0);
   }

   public cnb(dca $$0, double $$1, double $$2, double $$3) {
      super(bsb.E, $$1, $$2, $$3, $$0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dU()
               .a(
                  new kx(lb.Q, this.p()),
                  this.dz(),
                  this.dB(),
                  this.dF(),
                  ((double)this.al.i() - 0.5) * 0.08,
                  ((double)this.al.i() - 0.5) * 0.08,
                  ((double)this.al.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(ewr $$0) {
      super.a($$0);
      $$0.a().a(this.dX().b(this, this.t()), 0.0F);
   }

   @Override
   protected void a(ews $$0) {
      super.a($$0);
      if (!this.dU().C) {
         if (this.al.a(8) == 0) {
            int $$1 = 1;
            if (this.al.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               cej $$3 = bsb.v.a(this.dU());
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.dz(), this.dB(), this.dF(), this.dK(), 0.0F);
                  this.dU().b($$3);
               }
            }
         }

         this.dU().a(this, (byte)3);
         this.ao();
      }
   }

   @Override
   protected cuc r() {
      return cuk.so;
   }
}
