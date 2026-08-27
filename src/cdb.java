import javax.annotation.Nullable;

public class cdb extends ccy {
   public cdb(bja<? extends cdb> $$0, cqb $$1) {
      super($$0, $$1);
   }

   public cdb(cqb $$0, bjm $$1) {
      super(bja.D, $$1, $$0);
   }

   @Override
   protected cjg s() {
      return cjo.rq;
   }

   @Override
   protected void a(ehe $$0) {
      super.a($$0);
      $$0.a().a(this.dM().b(this, this.v()), 0.0F);
   }

   @Override
   protected void a(ehf $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dL().a(iv.X, this.dq(), this.ds() + this.ag.j() * 2.0, this.dw(), this.ag.k(), 0.0, this.ag.k());
      }

      if (!this.dL().B && !this.dG()) {
         biw $$2 = this.v();
         if ($$2 instanceof aku $$3) {
            if ($$3.c.c() && $$3.dL() == this.dL() && !$$3.fD()) {
               if (this.ag.i() < 0.05F && this.dL().X().b(cpx.e)) {
                  bzf $$4 = bja.F.a(this.dL());
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
      biw $$0 = this.v();
      if ($$0 instanceof aku && !$$0.bv() && this.dL().X().b(cpx.U)) {
         this.ak();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public biw b(akt $$0) {
      biw $$1 = this.v();
      if ($$1 != null && $$1.dL().ac() != $$0.ac()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
