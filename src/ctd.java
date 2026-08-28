import java.util.Optional;

public class ctd extends ctb {
   private static final bwy a = bwy.c(0.0F, 0.0F);

   public ctd(bxe<? extends ctd> $$0, djz $$1) {
      super($$0, $$1);
   }

   public ctd(djz $$0, bxw $$1, daa $$2) {
      super(bxe.M, $$1, $$0, $$2);
   }

   public ctd(djz $$0, double $$1, double $$2, double $$3, daa $$4) {
      super(bxe.M, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dV()
               .a(
                  new lv(lz.U, this.f()),
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
   protected void a(ffp $$0) {
      super.a($$0);
      $$0.a().a(this.dW().b(this, this.q()), 0.0F);
   }

   @Override
   protected void a(ffq $$0) {
      super.a($$0);
      if (!this.dV().C) {
         if (this.ae.a(8) == 0) {
            int $$1 = 1;
            if (this.ae.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               cjs $$3 = bxe.A.a(this.dV(), bxd.k);
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
                  Optional.ofNullable(this.f().a(kl.aJ)).flatMap($$0x -> $$0x.a(this.dX())).ifPresent($$3::j);
                  if (!$$3.a(a)) {
                     break;
                  }

                  this.dV().b($$3);
               }
            }
         }

         this.dV().a(this, (byte)3);
         this.aq();
      }
   }

   @Override
   protected czw g() {
      return dae.rH;
   }
}
