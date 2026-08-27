import javax.annotation.Nullable;

public class cjw extends cjt {
   public cjw(bpd<? extends cjw> $$0, cxb $$1) {
      super($$0, $$1);
   }

   public cjw(cxb $$0, bpp $$1) {
      super(bpd.H, $$1, $$0);
   }

   @Override
   protected cqh r() {
      return cqp.se;
   }

   @Override
   protected void a(epq $$0) {
      super.a($$0);
      $$0.a().a(this.dN().b(this, this.af_()), 0.0F);
   }

   @Override
   protected void a(epr $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dM().a(kc.aa, this.dr(), this.dt() + this.ag.j() * 2.0, this.dx(), this.ag.k(), 0.0, this.ag.k());
      }

      if (!this.dM().B && !this.dH()) {
         box $$2 = this.af_();
         if ($$2 instanceof apg $$3) {
            if ($$3.d.c() && $$3.dM() == this.dM() && !$$3.fI()) {
               if (this.ag.i() < 0.05F && this.dM().Z().b(cwx.e)) {
                  cfr $$4 = bpd.J.a(this.dM());
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
               this.dM().a(null, this.dr(), this.dt(), this.dx(), aty.tW, atz.h);
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
      box $$0 = this.af_();
      if ($$0 instanceof apg && !$$0.bA() && this.dM().Z().b(cwx.Y)) {
         this.am();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public box b(apf $$0) {
      box $$1 = this.af_();
      if ($$1 != null && $$1.dM().ad() != $$0.ad()) {
         this.c(null);
      }

      return super.b($$0);
   }
}
