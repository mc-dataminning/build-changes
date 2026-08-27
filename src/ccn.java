import javax.annotation.Nullable;

public class ccn extends cck {
   public ccn(bim<? extends ccn> $$0, cpl $$1) {
      super($$0, $$1);
   }

   public ccn(cpl $$0, biy $$1) {
      super(bim.D, $$1, $$0);
   }

   @Override
   protected cis m() {
      return cja.rq;
   }

   @Override
   protected void a(eha $$0) {
      super.a($$0);
      $$0.a().a(this.dL().b(this, this.v()), 0.0F);
   }

   @Override
   protected void a(ehb $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dK().a(iv.X, this.dp(), this.dr() + this.ag.j() * 2.0, this.dv(), this.ag.k(), 0.0, this.ag.k());
      }

      if (!this.dK().B && !this.dF()) {
         bii $$2 = this.v();
         if ($$2 instanceof akl $$3) {
            if ($$3.c.c() && $$3.dK() == this.dK() && !$$3.fB()) {
               if (this.ag.i() < 0.05F && this.dK().X().b(cph.e)) {
                  byr $$4 = bim.F.a(this.dK());
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
      bii $$0 = this.v();
      if ($$0 instanceof cbm && !$$0.bv()) {
         this.ak();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bii b(akk $$0) {
      bii $$1 = this.v();
      if ($$1 != null && $$1.dK().ac() != $$0.ac()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
