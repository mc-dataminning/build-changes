import javax.annotation.Nullable;

public class cij extends cig {
   public cij(bnu<? extends cij> $$0, cvn $$1) {
      super($$0, $$1);
   }

   public cij(cvn $$0, bog $$1) {
      super(bnu.F, $$1, $$0);
   }

   @Override
   protected cou s() {
      return cpc.se;
   }

   @Override
   protected void a(enp $$0) {
      super.a($$0);
      $$0.a().a(this.dN().b(this, this.w()), 0.0F);
   }

   @Override
   protected void a(enq $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dM().a(jz.Z, this.dr(), this.dt() + this.af.j() * 2.0, this.dx(), this.af.k(), 0.0, this.af.k());
      }

      if (!this.dM().B && !this.dH()) {
         bno $$2 = this.w();
         if ($$2 instanceof aow $$3) {
            if ($$3.d.c() && $$3.dM() == this.dM() && !$$3.fD()) {
               if (this.af.i() < 0.05F && this.dM().Z().b(cvj.e)) {
                  cee $$4 = bnu.H.a(this.dM());
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
               this.dM().a(null, this.dr(), this.dt(), this.dx(), atk.tN, atl.h);
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
      bno $$0 = this.w();
      if ($$0 instanceof aow && !$$0.bx() && this.dM().Z().b(cvj.Y)) {
         this.am();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bno b(aov $$0) {
      bno $$1 = this.w();
      if ($$1 != null && $$1.dM().ae() != $$0.ae()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
