import javax.annotation.Nullable;

public class cgc extends cfz {
   public cgc(blt<? extends cgc> $$0, cti $$1) {
      super($$0, $$1);
   }

   public cgc(cti $$0, bmf $$1) {
      super(blt.E, $$1, $$0);
   }

   @Override
   protected cmm s() {
      return cmu.sc;
   }

   @Override
   protected void a(elj $$0) {
      super.a($$0);
      $$0.a().a(this.dN().b(this, this.w()), 0.0F);
   }

   @Override
   protected void a(elk $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dM().a(jx.Z, this.dr(), this.dt() + this.ag.j() * 2.0, this.dx(), this.ag.k(), 0.0, this.ag.k());
      }

      if (!this.dM().B && !this.dH()) {
         blp $$2 = this.w();
         if ($$2 instanceof ana $$3) {
            if ($$3.c.c() && $$3.dM() == this.dM() && !$$3.fD()) {
               if (this.ag.i() < 0.05F && this.dM().Z().b(cte.e)) {
                  cca $$4 = blt.G.a(this.dM());
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
               this.dM().a(null, this.dr(), this.dt(), this.dx(), arm.ty, arn.h);
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
      blp $$0 = this.w();
      if ($$0 instanceof ana && !$$0.bx() && this.dM().Z().b(cte.Y)) {
         this.am();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public blp b(amz $$0) {
      blp $$1 = this.w();
      if ($$1 != null && $$1.dM().ae() != $$0.ae()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
