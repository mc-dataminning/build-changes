public class cqu extends cqs {
   private static final bvi a = bvi.c(0.0F, 0.0F);

   public cqu(bvm<? extends cqu> $$0, dha $$1) {
      super($$0, $$1);
   }

   public cqu(dha $$0, bwb $$1, cxk $$2) {
      super(bvm.M, $$1, $$0, $$2);
   }

   public cqu(dha $$0, double $$1, double $$2, double $$3, cxk $$4) {
      super(bvm.M, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dV()
               .a(
                  new lo(ls.S, this.l()),
                  this.dA(),
                  this.dC(),
                  this.dG(),
                  ((double)this.ae.i() - 0.5) * 0.08,
                  ((double)this.ae.i() - 0.5) * 0.08,
                  ((double)this.ae.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(fbp $$0) {
      super.a($$0);
      $$0.a().a(this.dW().b(this, this.p()), 0.0F);
   }

   @Override
   protected void a(fbq $$0) {
      super.a($$0);
      if (!this.dV().C) {
         if (this.ae.a(8) == 0) {
            int $$1 = 1;
            if (this.ae.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               chx $$3 = bvm.z.a(this.dV(), bvl.k);
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
                  if (!$$3.a(a)) {
                     break;
                  }

                  this.dV().b($$3);
               }
            }
         }

         this.dV().a(this, (byte)3);
         this.at();
      }
   }

   @Override
   protected cxg m() {
      return cxo.rp;
   }
}
