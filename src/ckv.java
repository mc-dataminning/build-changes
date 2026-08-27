import javax.annotation.Nullable;

public class ckv extends cks {
   public ckv(bqb<? extends ckv> $$0, cyx $$1) {
      super($$0, $$1);
   }

   public ckv(cyx $$0, bqo $$1) {
      super(bqb.G, $$1, $$0);
   }

   @Override
   protected cre r() {
      return crm.se;
   }

   @Override
   protected void a(erx $$0) {
      super.a($$0);
      $$0.a().a(this.dN().b(this, this.u()), 0.0F);
   }

   @Override
   protected void a(ery $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dM().a(kl.aa, this.dr(), this.dt() + this.ag.j() * 2.0, this.dx(), this.ag.k(), 0.0, this.ag.k());
      }

      if (!this.dM().B && !this.dH()) {
         bpv $$2 = this.u();
         if ($$2 instanceof apt $$3) {
            if ($$3.d.c() && $$3.dM() == this.dM() && !$$3.fI()) {
               if (this.ag.i() < 0.05F && this.dM().aa().b(cyt.e)) {
                  cgq $$4 = bqb.I.a(this.dM());
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
               this.dM().a(null, this.dr(), this.dt(), this.dx(), aum.tZ, aun.h);
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
      bpv $$0 = this.u();
      if ($$0 instanceof apt && !$$0.bA() && this.dM().aa().b(cyt.Y)) {
         this.am();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bpv b(aps $$0) {
      bpv $$1 = this.u();
      if ($$1 != null && $$1.dM().ae() != $$0.ae()) {
         this.c(null);
      }

      return super.b($$0);
   }
}
