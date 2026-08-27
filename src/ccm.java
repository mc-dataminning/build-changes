import javax.annotation.Nullable;

public class ccm extends ccj {
   public ccm(bik<? extends ccm> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public ccm(cpk $$0, biw $$1) {
      super(bik.D, $$1, $$0);
   }

   @Override
   protected cir m() {
      return ciz.rq;
   }

   @Override
   protected void a(ehc $$0) {
      super.a($$0);
      $$0.a().a(this.dL().b(this, this.v()), 0.0F);
   }

   @Override
   protected void a(ehd $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dK().a(iw.X, this.dp(), this.dr() + this.ag.j() * 2.0, this.dv(), this.ag.k(), 0.0, this.ag.k());
      }

      if (!this.dK().B && !this.dF()) {
         big $$2 = this.v();
         if ($$2 instanceof akj $$3) {
            if ($$3.c.c() && $$3.dK() == this.dK() && !$$3.fB()) {
               if (this.ag.i() < 0.05F && this.dK().X().b(cpg.e)) {
                  byq $$4 = bik.F.a(this.dK());
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
      big $$0 = this.v();
      if ($$0 instanceof cbl && !$$0.bv()) {
         this.ak();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public big b(aki $$0) {
      big $$1 = this.v();
      if ($$1 != null && $$1.dK().ac() != $$0.ac()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
