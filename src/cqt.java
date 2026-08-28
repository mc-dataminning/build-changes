public class cqt extends cqr {
   private static final bvd a = bvd.c(0.0F, 0.0F);

   public cqt(bvi<? extends cqt> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public cqt(dgz $$0, bvy $$1, cxh $$2) {
      super(bvi.L, $$1, $$0, $$2);
   }

   public cqt(dgz $$0, double $$1, double $$2, double $$3, cxh $$4) {
      super(bvi.L, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dU()
               .a(
                  new lp(lt.U, this.f()),
                  this.dz(),
                  this.dB(),
                  this.dF(),
                  ((double)this.ae.i() - 0.5) * 0.08,
                  ((double)this.ae.i() - 0.5) * 0.08,
                  ((double)this.ae.i() - 0.5) * 0.08
               );
         }
      }
   }

   @Override
   protected void a(fbu $$0) {
      super.a($$0);
      $$0.a().a(this.dV().b(this, this.q()), 0.0F);
   }

   @Override
   protected void a(fbv $$0) {
      super.a($$0);
      if (!this.dU().C) {
         if (this.ae.a(8) == 0) {
            int $$1 = 1;
            if (this.ae.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               chu $$3 = bvi.z.a(this.dU(), bvh.k);
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.dz(), this.dB(), this.dF(), this.dK(), 0.0F);
                  if (!$$3.a(a)) {
                     break;
                  }

                  this.dU().b($$3);
               }
            }
         }

         this.dU().a(this, (byte)3);
         this.at();
      }
   }

   @Override
   protected cxd g() {
      return cxl.rA;
   }
}
