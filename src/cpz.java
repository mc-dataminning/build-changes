public class cpz extends cpx {
   private static final buo a = buo.c(0.0F, 0.0F);

   public cpz(bus<? extends cpz> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cpz(dgi $$0, bvh $$1, cwp $$2) {
      super(bus.L, $$1, $$0, $$2);
   }

   public cpz(dgi $$0, double $$1, double $$2, double $$3, cwp $$4) {
      super(bus.L, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dV()
               .a(
                  new lp(lt.T, this.l()),
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
   protected void a(fax $$0) {
      super.a($$0);
      $$0.a().a(this.dW().b(this, this.p()), 0.0F);
   }

   @Override
   protected void a(fay $$0) {
      super.a($$0);
      if (!this.dV().C) {
         if (this.ae.a(8) == 0) {
            int $$1 = 1;
            if (this.ae.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               chd $$3 = bus.z.a(this.dV(), bur.k);
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
   protected cwl m() {
      return cwt.ry;
   }
}
