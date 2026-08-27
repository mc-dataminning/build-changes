import javax.annotation.Nullable;

public class cmj extends cmg {
   public cmj(brn<? extends cmj> $$0, dad $$1) {
      super($$0, $$1);
   }

   public cmj(dad $$0, bsa $$1) {
      super(brn.G, $$1, $$0);
   }

   @Override
   protected csu r() {
      return ctc.sf;
   }

   @Override
   protected void a(etm $$0) {
      super.a($$0);
      $$0.a().a(this.dO().b(this, this.u()), 0.0F);
   }

   @Override
   protected void a(etn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dN().a(kx.Z, this.ds(), this.du() + this.ah.j() * 2.0, this.dy(), this.ah.k(), 0.0, this.ah.k());
      }

      if (!this.dN().B && !this.dI()) {
         brh $$2 = this.u();
         if ($$2 instanceof aqi $$3) {
            if ($$3.d.c() && $$3.dN() == this.dN() && !$$3.fJ()) {
               if (this.ah.i() < 0.05F && this.dN().aa().b(czz.e)) {
                  cie $$4 = brn.I.a(this.dN());
                  if ($$4 != null) {
                     $$4.b($$2.ds(), $$2.du(), $$2.dy(), $$2.dD(), $$2.dF());
                     this.dN().b($$4);
                  }
               }

               if ($$2.bP()) {
                  $$3.a(this.ds(), this.du(), this.dy());
               } else {
                  $$2.c(this.ds(), this.du(), this.dy());
               }

               $$2.n();
               $$2.a(this.dO().k(), 5.0F);
               this.dN().a(null, this.ds(), this.du(), this.dy(), avc.uh, avd.h);
            }
         } else if ($$2 != null) {
            $$2.c(this.ds(), this.du(), this.dy());
            $$2.n();
         }

         this.am();
      }
   }

   @Override
   public void l() {
      brh $$0 = this.u();
      if ($$0 instanceof aqi && !$$0.bB() && this.dN().aa().b(czz.Y)) {
         this.am();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public brh b(aqh $$0) {
      brh $$1 = this.u();
      if ($$1 != null && $$1.dN().ae() != $$0.ae()) {
         this.c(null);
      }

      return super.b($$0);
   }
}
