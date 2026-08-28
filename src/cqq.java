public class cqq extends cqo {
   private static final bve a = bve.c(0.0F, 0.0F);

   public cqq(bvi<? extends cqq> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqq(dgz $$0, bvx $$1, cxg $$2) {
      super(bvi.M, $$1, $$0, $$2);
   }

   public cqq(dgz $$0, double $$1, double $$2, double $$3, cxg $$4) {
      super(bvi.M, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dW()
               .a(
                  new lo(ls.T, this.l()),
                  this.dB(),
                  this.dD(),
                  this.dH(),
                  ((double)this.ae.i() - 0.5) * 0.08,
                  ((double)this.ae.i() - 0.5) * 0.08,
                  ((double)this.ae.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(fbo $$0) {
      super.a($$0);
      $$0.a().a(this.dX().b(this, this.p()), 0.0F);
   }

   @Override
   protected void a(fbp $$0) {
      super.a($$0);
      if (!this.dW().C) {
         if (this.ae.a(8) == 0) {
            int $$1 = 1;
            if (this.ae.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               cht $$3 = bvi.z.a(this.dW(), bvh.k);
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.dB(), this.dD(), this.dH(), this.dM(), 0.0F);
                  if (!$$3.a(a)) {
                     break;
                  }

                  this.dW().b($$3);
               }
            }
         }

         this.dW().a(this, (byte)3);
         this.at();
      }
   }

   @Override
   protected cxc m() {
      return cxk.ry;
   }
}
