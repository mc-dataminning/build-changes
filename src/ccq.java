import javax.annotation.Nullable;

public class ccq extends ccn {
   public ccq(bip<? extends ccq> $$0, cpq $$1) {
      super($$0, $$1);
   }

   public ccq(cpq $$0, bjb $$1) {
      super(bip.D, $$1, $$0);
   }

   @Override
   protected civ m() {
      return cjd.rq;
   }

   @Override
   protected void a(ehf $$0) {
      super.a($$0);
      $$0.a().a(this.dL().b(this, this.v()), 0.0F);
   }

   @Override
   protected void a(ehg $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dK().a(ix.X, this.dp(), this.dr() + this.ag.j() * 2.0, this.dv(), this.ag.k(), 0.0, this.ag.k());
      }

      if (!this.dK().B && !this.dF()) {
         bil $$2 = this.v();
         if ($$2 instanceof ako $$3) {
            if ($$3.c.c() && $$3.dK() == this.dK() && !$$3.fB()) {
               if (this.ag.i() < 0.05F && this.dK().X().b(cpm.e)) {
                  byu $$4 = bip.F.a(this.dK());
                  if ($$4 != null) {
                     $$4.b($$2.dp(), $$2.dr(), $$2.dv(), $$2.dA(), $$2.dC());
                     this.dK().b($$4);
                  }
               }

               if ($$2.bN()) {
                  $$3.a(this.dp(), this.dr(), this.dv());
               } else {
                  $$2.b(this.dp(), this.dr(), this.dv());
               }

               $$2.n();
               $$2.a(this.dL().k(), 5.0F);
            }
         } else if ($$2 != null) {
            $$2.b(this.dp(), this.dr(), this.dv());
            $$2.n();
         }

         this.ak();
      }
   }

   @Override
   public void l() {
      bil $$0 = this.v();
      if ($$0 instanceof cbp && !$$0.bv()) {
         this.ak();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bil b(akn $$0) {
      bil $$1 = this.v();
      if ($$1 != null && $$1.dK().ac() != $$0.ac()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
