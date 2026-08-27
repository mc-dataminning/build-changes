import javax.annotation.Nullable;

public class ccx extends ccu {
   public ccx(biw<? extends ccx> $$0, cpx $$1) {
      super($$0, $$1);
   }

   public ccx(cpx $$0, bji $$1) {
      super(biw.D, $$1, $$0);
   }

   @Override
   protected cjc s() {
      return cjk.rq;
   }

   @Override
   protected void a(ehm $$0) {
      super.a($$0);
      $$0.a().a(this.dM().b(this, this.v()), 0.0F);
   }

   @Override
   protected void a(ehn $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dL().a(ix.X, this.dq(), this.ds() + this.ag.j() * 2.0, this.dw(), this.ag.k(), 0.0, this.ag.k());
      }

      if (!this.dL().B && !this.dG()) {
         bis $$2 = this.v();
         if ($$2 instanceof akt $$3) {
            if ($$3.c.c() && $$3.dL() == this.dL() && !$$3.fC()) {
               if (this.ag.i() < 0.05F && this.dL().X().b(cpt.e)) {
                  bzb $$4 = biw.F.a(this.dL());
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
      bis $$0 = this.v();
      if ($$0 instanceof akt && !$$0.bv() && this.dL().X().b(cpt.U)) {
         this.ak();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bis b(aks $$0) {
      bis $$1 = this.v();
      if ($$1 != null && $$1.dL().ac() != $$0.ac()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
