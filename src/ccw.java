public class ccw extends ccu {
   public ccw(biw<? extends ccw> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public ccw(cpx $$0, bji $$1) {
      super(biw.z, $$1, $$0);
   }

   public ccw(cpx $$0, double $$1, double $$2, double $$3) {
      super(biw.z, $$1, $$2, $$3, $$0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dL()
               .a(
                  new it(ix.O, this.q()),
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
   protected void a(ehm $$0) {
      super.a($$0);
      $$0.a().a(this.dM().b(this, this.v()), 0.0F);
   }

   @Override
   protected void a(ehn $$0) {
      super.a($$0);
      if (!this.dL().B) {
         if (this.ag.a(8) == 0) {
            int $$1 = 1;
            if (this.ag.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               buy $$3 = biw.q.a(this.dL());
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
   protected cjc s() {
      return cjk.qd;
   }
}
