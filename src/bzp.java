import javax.annotation.Nullable;

public class bzp extends bzm {
   public bzp(bfn<? extends bzp> $$0, cmm $$1) {
      super($$0, $$1);
   }

   public bzp(cmm $$0, bfz $$1) {
      super(bfn.D, $$1, $$0);
   }

   @Override
   protected cfu k() {
      return cgc.rq;
   }

   @Override
   protected void a(eef $$0) {
      super.a($$0);
      $$0.a().a(this.dJ().b(this, this.v()), 0.0F);
   }

   @Override
   protected void a(eeg $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dI().a(iv.X, this.dn(), this.dp() + this.af.j() * 2.0, this.dt(), this.af.k(), 0.0, this.af.k());
      }

      if (!this.dI().B && !this.dD()) {
         bfj $$2 = this.v();
         if ($$2 instanceof aig $$3) {
            if ($$3.c.a() && $$3.dI() == this.dI() && !$$3.fy()) {
               if (this.af.i() < 0.05F && this.dI().X().b(cmi.e)) {
                  bvt $$4 = bfn.F.a(this.dI());
                  if ($$4 != null) {
                     $$4.b($$2.dn(), $$2.dp(), $$2.dt(), $$2.dy(), $$2.dA());
                     this.dI().b($$4);
                  }
               }

               if ($$2.bM()) {
                  $$3.a(this.dn(), this.dp(), this.dt());
               } else {
                  $$2.b(this.dn(), this.dp(), this.dt());
               }

               $$2.n();
               $$2.a(this.dJ().k(), 5.0F);
            }
         } else if ($$2 != null) {
            $$2.b(this.dn(), this.dp(), this.dt());
            $$2.n();
         }

         this.ai();
      }
   }

   @Override
   public void l() {
      bfj $$0 = this.v();
      if ($$0 instanceof byo && !$$0.bs()) {
         this.ai();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bfj b(aif $$0) {
      bfj $$1 = this.v();
      if ($$1 != null && $$1.dI().ac() != $$0.ac()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
