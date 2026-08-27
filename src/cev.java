import javax.annotation.Nullable;

public class cev extends ces {
   public cev(bku<? extends cev> $$0, csa $$1) {
      super($$0, $$1);
   }

   public cev(csa $$0, blg $$1) {
      super(bku.D, $$1, $$0);
   }

   @Override
   protected cle s() {
      return clm.sc;
   }

   @Override
   protected void a(ejr $$0) {
      super.a($$0);
      $$0.a().a(this.dO().b(this, this.w()), 0.0F);
   }

   @Override
   protected void a(ejs $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dN().a(js.X, this.ds(), this.du() + this.ag.j() * 2.0, this.dy(), this.ag.k(), 0.0, this.ag.k());
      }

      if (!this.dN().B && !this.dI()) {
         bkq $$2 = this.w();
         if ($$2 instanceof amf $$3) {
            if ($$3.c.c() && $$3.dN() == this.dN() && !$$3.fE()) {
               if (this.ag.i() < 0.05F && this.dN().Y().b(crw.e)) {
                  caz $$4 = bku.F.a(this.dN());
                  if ($$4 != null) {
                     $$4.b($$2.ds(), $$2.du(), $$2.dy(), $$2.dD(), $$2.dF());
                     this.dN().b($$4);
                  }
               }

               if ($$2.bO()) {
                  $$3.a(this.ds(), this.du(), this.dy());
               } else {
                  $$2.c(this.ds(), this.du(), this.dy());
               }

               $$2.n();
               $$2.a(this.dO().k(), 5.0F);
               this.dN().a(null, this.ds(), this.du(), this.dy(), aqr.td, aqs.h);
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
      bkq $$0 = this.w();
      if ($$0 instanceof amf && !$$0.bx() && this.dN().Y().b(crw.Y)) {
         this.am();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bkq b(ame $$0) {
      bkq $$1 = this.w();
      if ($$1 != null && $$1.dN().ad() != $$0.ad()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
