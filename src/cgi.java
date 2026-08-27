import javax.annotation.Nullable;

public class cgi extends cgf {
   public cgi(bly<? extends cgi> $$0, cto $$1) {
      super($$0, $$1);
   }

   public cgi(cto $$0, bmk $$1) {
      super(bly.E, $$1, $$0);
   }

   @Override
   protected cms s() {
      return cna.sc;
   }

   @Override
   protected void a(elp $$0) {
      super.a($$0);
      $$0.a().a(this.dN().b(this, this.w()), 0.0F);
   }

   @Override
   protected void a(elq $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dM().a(jx.Z, this.dr(), this.dt() + this.ag.j() * 2.0, this.dx(), this.ag.k(), 0.0, this.ag.k());
      }

      if (!this.dM().B && !this.dH()) {
         blu $$2 = this.w();
         if ($$2 instanceof ane $$3) {
            if ($$3.c.c() && $$3.dM() == this.dM() && !$$3.fD()) {
               if (this.ag.i() < 0.05F && this.dM().Z().b(ctk.e)) {
                  ccf $$4 = bly.G.a(this.dM());
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
               this.dM().a(null, this.dr(), this.dt(), this.dx(), arr.ty, ars.h);
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
      blu $$0 = this.w();
      if ($$0 instanceof ane && !$$0.bx() && this.dM().Z().b(ctk.Y)) {
         this.am();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public blu b(and $$0) {
      blu $$1 = this.w();
      if ($$1 != null && $$1.dM().ae() != $$0.ae()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
