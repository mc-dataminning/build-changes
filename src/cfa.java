import javax.annotation.Nullable;

public class cfa extends cex {
   public cfa(bkz<? extends cfa> $$0, csf $$1) {
      super($$0, $$1);
   }

   public cfa(csf $$0, bll $$1) {
      super(bkz.D, $$1, $$0);
   }

   @Override
   protected clj s() {
      return clr.sc;
   }

   @Override
   protected void a(ejw $$0) {
      super.a($$0);
      $$0.a().a(this.dO().b(this, this.w()), 0.0F);
   }

   @Override
   protected void a(ejx $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dN().a(jw.X, this.ds(), this.du() + this.ag.j() * 2.0, this.dy(), this.ag.k(), 0.0, this.ag.k());
      }

      if (!this.dN().B && !this.dI()) {
         bkv $$2 = this.w();
         if ($$2 instanceof amj $$3) {
            if ($$3.c.c() && $$3.dN() == this.dN() && !$$3.fE()) {
               if (this.ag.i() < 0.05F && this.dN().Y().b(csb.e)) {
                  cbe $$4 = bkz.F.a(this.dN());
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
               this.dN().a(null, this.ds(), this.du(), this.dy(), aqv.td, aqw.h);
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
      bkv $$0 = this.w();
      if ($$0 instanceof amj && !$$0.bx() && this.dN().Y().b(csb.Y)) {
         this.am();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bkv b(ami $$0) {
      bkv $$1 = this.w();
      if ($$1 != null && $$1.dN().ad() != $$0.ad()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
