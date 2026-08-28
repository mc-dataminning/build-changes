import java.util.Optional;

public class ctb extends csz {
   private static final bww a = bww.c(0.0F, 0.0F);

   public ctb(bxc<? extends ctb> $$0, djx $$1) {
      super($$0, $$1);
   }

   public ctb(djx $$0, bxu $$1, czy $$2) {
      super(bxc.M, $$1, $$0, $$2);
   }

   public ctb(djx $$0, double $$1, double $$2, double $$3, czy $$4) {
      super(bxc.M, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 3) {
         double $$1 = 0.08;

         for (int $$2 = 0; $$2 < 8; $$2++) {
            this.dV()
               .a(
                  new lu(ly.U, this.f()),
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
   protected void a(ffn $$0) {
      super.a($$0);
      $$0.a().a(this.dW().b(this, this.q()), 0.0F);
   }

   @Override
   protected void a(ffo $$0) {
      super.a($$0);
      if (!this.dV().C) {
         if (this.ae.a(8) == 0) {
            int $$1 = 1;
            if (this.ae.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               cjq $$3 = bxc.A.a(this.dV(), bxb.k);
               if ($$3 != null) {
                  $$3.c_(-24000);
                  $$3.b(this.dA(), this.dC(), this.dG(), this.dL(), 0.0F);
                  Optional.ofNullable(this.f().a(kk.aJ)).flatMap($$0x -> $$0x.a(this.dX())).ifPresent($$3::j);
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
   protected czu g() {
      return dac.rH;
   }
}
