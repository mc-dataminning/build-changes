import java.util.Optional;

public class ctm extends ctk {
   private static final bxh a = bxh.c(0.0F, 0.0F);

   public ctm(bxn<? extends ctm> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public ctm(dkj $$0, byf $$1, dak $$2) {
      super(bxn.M, $$1, $$0, $$2);
   }

   public ctm(dkj $$0, double $$1, double $$2, double $$3, dak $$4) {
      super(bxn.M, $$1, $$2, $$3, $$0, $$4);
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
   protected void a(ffz $$0) {
      super.a($$0);
      $$0.a().a(this.dW().b(this, this.q()), 0.0F);
   }

   @Override
   protected void a(fga $$0) {
      super.a($$0);
      if (!this.dV().C) {
         if (this.ae.a(8) == 0) {
            int $$1 = 1;
            if (this.ae.a(32) == 0) {
               $$1 = 4;
            }

            for (int $$2 = 0; $$2 < $$1; $$2++) {
               ckb $$3 = bxn.A.a(this.dV(), bxm.k);
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
   protected dag g() {
      return dao.rH;
   }
}
