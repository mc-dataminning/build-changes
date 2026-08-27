public class cem extends cek {
   public cem(bkm<? extends cem> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cem(crs $$0, bky $$1) {
      super(bkm.z, $$1, $$0);
   }

   public cem(crs $$0, double $$1, double $$2, double $$3) {
      super(bkm.z, $$1, $$2, $$3, $$0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dL()
               .a(
                  new jo(js.O, this.q()),
                  this.dq(),
                  this.ds(),
                  this.dw(),
                  ((double)this.ag.i() - 0.5) * 0.08,
                  ((double)this.ag.i() - 0.5) * 0.08,
                  ((double)this.ag.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(ejf $$0) {
      super.a($$0);
      $$0.a().a(this.dM().b(this, this.v()), 0.0F);
   }

   @Override
   protected void a(ejg $$0) {
      super.a($$0);
      if (!this.dL().B) {
         if (this.ag.a(8) == 0) {
            int $$1 = 1;
            if (this.ag.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               bwo $$3 = bkm.q.a(this.dL());
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.dq(), this.ds(), this.dw(), this.dB(), 0.0F);
                  this.dL().b($$3);
               }
            }
         }

         this.dL().a(this, (byte)3);
         this.ak();
      }
   }

   @Override
   protected ckw s() {
      return cle.qd;
   }
}
