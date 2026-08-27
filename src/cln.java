import javax.annotation.Nullable;

public class cln extends clk {
   public cln(bqr<? extends cln> $$0, czu $$1) {
      super($$0, $$1);
   }

   public cln(czu $$0, bre $$1) {
      super(bqr.G, $$1, $$0);
   }

   @Override
   protected cry r() {
      return csg.sf;
   }

   @Override
   protected void a(etc $$0) {
      super.a($$0);
      $$0.a().a(this.dO().b(this, this.u()), 0.0F);
   }

   @Override
   protected void a(etd $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dN().a(kw.Z, this.ds(), this.du() + this.ah.j() * 2.0, this.dy(), this.ah.k(), 0.0, this.ah.k());
      }

      if (!this.dN().B && !this.dI()) {
         bql $$2 = this.u();
         if ($$2 instanceof aqf $$3) {
            if ($$3.d.c() && $$3.dN() == this.dN() && !$$3.fJ()) {
               if (this.ah.i() < 0.05F && this.dN().aa().b(czq.e)) {
                  chi $$4 = bqr.I.a(this.dN());
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
               this.dN().a(null, this.ds(), this.du(), this.dy(), auz.ug, ava.h);
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
      bql $$0 = this.u();
      if ($$0 instanceof aqf && !$$0.bB() && this.dN().aa().b(czq.Y)) {
         this.am();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bql b(aqe $$0) {
      bql $$1 = this.u();
      if ($$1 != null && $$1.dN().ae() != $$0.ae()) {
         this.c(null);
      }

      return super.b($$0);
   }
}
