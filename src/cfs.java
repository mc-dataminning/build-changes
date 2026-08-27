import javax.annotation.Nullable;

public class cfs extends cfp {
   public cfs(blj<? extends cfs> $$0, csy $$1) {
      super($$0, $$1);
   }

   public cfs(csy $$0, blv $$1) {
      super(blj.E, $$1, $$0);
   }

   @Override
   protected cmc s() {
      return cmk.sc;
   }

   @Override
   protected void a(eky $$0) {
      super.a($$0);
      $$0.a().a(this.dN().b(this, this.w()), 0.0F);
   }

   @Override
   protected void a(ekz $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dM().a(jv.Z, this.dr(), this.dt() + this.ag.j() * 2.0, this.dx(), this.ag.k(), 0.0, this.ag.k());
      }

      if (!this.dM().B && !this.dH()) {
         blf $$2 = this.w();
         if ($$2 instanceof amq $$3) {
            if ($$3.c.c() && $$3.dM() == this.dM() && !$$3.fD()) {
               if (this.ag.i() < 0.05F && this.dM().Y().b(csu.e)) {
                  cbq $$4 = blj.G.a(this.dM());
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
               this.dM().a(null, this.dr(), this.dt(), this.dx(), arc.ty, ard.h);
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
      blf $$0 = this.w();
      if ($$0 instanceof amq && !$$0.bx() && this.dM().Y().b(csu.Y)) {
         this.am();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public blf b(amp $$0) {
      blf $$1 = this.w();
      if ($$1 != null && $$1.dM().ad() != $$0.ad()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
