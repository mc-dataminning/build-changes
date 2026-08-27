import javax.annotation.Nullable;

public class cin extends cik {
   public cin(bnw<? extends cin> $$0, cvr $$1) {
      super($$0, $$1);
   }

   public cin(cvr $$0, boi $$1) {
      super(bnw.F, $$1, $$0);
   }

   @Override
   protected coy s() {
      return cpg.se;
   }

   @Override
   protected void a(enw $$0) {
      super.a($$0);
      $$0.a().a(this.dN().b(this, this.w()), 0.0F);
   }

   @Override
   protected void a(enx $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dM().a(jz.Z, this.dr(), this.dt() + this.af.j() * 2.0, this.dx(), this.af.k(), 0.0, this.af.k());
      }

      if (!this.dM().B && !this.dH()) {
         bnq $$2 = this.w();
         if ($$2 instanceof aox $$3) {
            if ($$3.d.c() && $$3.dM() == this.dM() && !$$3.fD()) {
               if (this.af.i() < 0.05F && this.dM().Z().b(cvn.e)) {
                  cei $$4 = bnw.H.a(this.dM());
                  if ($$4 != null) {
                     $$4.b($$2.dr(), $$2.dt(), $$2.dx(), $$2.dC(), $$2.dE());
                     this.dM().b($$4);
                  }
               }

               if ($$2.bO()) {
                  $$3.a(this.dr(), this.dt(), this.dx());
               } else {
                  $$2.c(this.dr(), this.dt(), this.dx());
               }

               $$2.n();
               $$2.a(this.dN().k(), 5.0F);
               this.dM().a(null, this.dr(), this.dt(), this.dx(), atl.tO, atm.h);
            }
         } else if ($$2 != null) {
            $$2.c(this.dr(), this.dt(), this.dx());
            $$2.n();
         }

         this.am();
      }
   }

   @Override
   public void l() {
      bnq $$0 = this.w();
      if ($$0 instanceof aox && !$$0.bx() && this.dM().Z().b(cvn.Y)) {
         this.am();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bnq b(aow $$0) {
      bnq $$1 = this.w();
      if ($$1 != null && $$1.dM().ad() != $$0.ad()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
