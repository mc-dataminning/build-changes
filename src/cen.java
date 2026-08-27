import javax.annotation.Nullable;

public class cen extends cek {
   public cen(bkm<? extends cen> $$0, crs $$1) {
      super($$0, $$1);
   }

   public cen(crs $$0, bky $$1) {
      super(bkm.D, $$1, $$0);
   }

   @Override
   protected ckw s() {
      return cle.rr;
   }

   @Override
   protected void a(ejf $$0) {
      super.a($$0);
      $$0.a().a(this.dM().b(this, this.v()), 0.0F);
   }

   @Override
   protected void a(ejg $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dL().a(js.X, this.dq(), this.ds() + this.ag.j() * 2.0, this.dw(), this.ag.k(), 0.0, this.ag.k());
      }

      if (!this.dL().B && !this.dG()) {
         bki $$2 = this.v();
         if ($$2 instanceof amb $$3) {
            if ($$3.c.c() && $$3.dL() == this.dL() && !$$3.fD()) {
               if (this.ag.i() < 0.05F && this.dL().X().b(cro.e)) {
                  car $$4 = bkm.F.a(this.dL());
                  if ($$4 != null) {
                     $$4.b($$2.dq(), $$2.ds(), $$2.dw(), $$2.dB(), $$2.dD());
                     this.dL().b($$4);
                  }
               }

               if ($$2.bN()) {
                  $$3.a(this.dq(), this.ds(), this.dw());
               } else {
                  $$2.b(this.dq(), this.ds(), this.dw());
               }

               $$2.n();
               $$2.a(this.dM().k(), 5.0F);
            }
         } else if ($$2 != null) {
            $$2.b(this.dq(), this.ds(), this.dw());
            $$2.n();
         }

         this.ak();
      }
   }

   @Override
   public void l() {
      bki $$0 = this.v();
      if ($$0 instanceof amb && !$$0.bv() && this.dL().X().b(cro.Y)) {
         this.ak();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bki b(ama $$0) {
      bki $$1 = this.v();
      if ($$1 != null && $$1.dL().ac() != $$0.ac()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
