public class cpx extends cpv {
   private static final bum a = bum.c(0.0F, 0.0F);

   public cpx(buq<? extends cpx> $$0, dgg $$1) {
      super($$0, $$1);
   }

   public cpx(dgg $$0, bvf $$1, cwn $$2) {
      super(buq.L, $$1, $$0, $$2);
   }

   public cpx(dgg $$0, double $$1, double $$2, double $$3, cwn $$4) {
      super(buq.L, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dW()
               .a(
                  new lp(lt.T, this.l()),
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
   protected void a(fav $$0) {
      super.a($$0);
      $$0.a().a(this.dX().b(this, this.p()), 0.0F);
   }

   @Override
   protected void a(faw $$0) {
      super.a($$0);
      if (!this.dW().C) {
         if (this.ae.a(8) == 0) {
            int $$1 = 1;
            if (this.ae.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               chb $$3 = buq.z.a(this.dW(), bup.k);
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
   protected cwj m() {
      return cwr.ry;
   }
}
