public class cez extends cex {
   public cez(bkz<? extends cez> $$0, csf $$1) {
      super($$0, $$1);
   }

   public cez(csf $$0, bll $$1) {
      super(bkz.z, $$1, $$0);
   }

   public cez(csf $$0, double $$1, double $$2, double $$3) {
      super(bkz.z, $$1, $$2, $$3, $$0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dN()
               .a(
                  new js(jw.O, this.q()),
                  this.ds(),
                  this.du(),
                  this.dy(),
                  ((double)this.ag.i() - 0.5) * 0.08,
                  ((double)this.ag.i() - 0.5) * 0.08,
                  ((double)this.ag.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(ejw $$0) {
      super.a($$0);
      $$0.a().a(this.dO().b(this, this.w()), 0.0F);
   }

   @Override
   protected void a(ejx $$0) {
      super.a($$0);
      if (!this.dN().B) {
         if (this.ag.a(8) == 0) {
            int $$1 = 1;
            if (this.ag.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               bxb $$3 = bkz.q.a(this.dN());
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
   protected clj s() {
      return clr.qO;
   }
}
