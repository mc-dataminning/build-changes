import javax.annotation.Nullable;

public class cgj extends cgg {
   public cgj(blz<? extends cgj> $$0, ctp $$1) {
      super($$0, $$1);
   }

   public cgj(ctp $$0, bml $$1) {
      super(blz.E, $$1, $$0);
   }

   @Override
   protected cmt s() {
      return cnb.sc;
   }

   @Override
   protected void a(elq $$0) {
      super.a($$0);
      $$0.a().a(this.dN().b(this, this.w()), 0.0F);
   }

   @Override
   protected void a(elr $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dM().a(jx.Z, this.dr(), this.dt() + this.ag.j() * 2.0, this.dx(), this.ag.k(), 0.0, this.ag.k());
      }

      if (!this.dM().B && !this.dH()) {
         blv $$2 = this.w();
         if ($$2 instanceof ane $$3) {
            if ($$3.c.c() && $$3.dM() == this.dM() && !$$3.fD()) {
               if (this.ag.i() < 0.05F && this.dM().Z().b(ctl.e)) {
                  ccg $$4 = blz.G.a(this.dM());
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
               this.dM().a(null, this.dr(), this.dt(), this.dx(), ars.ty, art.h);
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
      blv $$0 = this.w();
      if ($$0 instanceof ane && !$$0.bx() && this.dM().Z().b(ctl.Y)) {
         this.am();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public blv b(and $$0) {
      blv $$1 = this.w();
      if ($$1 != null && $$1.dM().ae() != $$0.ae()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
