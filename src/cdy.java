import javax.annotation.Nullable;

public class cdy extends cdv {
   public cdy(bjx<? extends cdy> $$0, cqz $$1) {
      super($$0, $$1);
   }

   public cdy(cqz $$0, bkj $$1) {
      super(bjx.D, $$1, $$0);
   }

   @Override
   protected cke s() {
      return ckm.rq;
   }

   @Override
   protected void a(eic $$0) {
      super.a($$0);
      $$0.a().a(this.dM().b(this, this.v()), 0.0F);
   }

   @Override
   protected void a(eid $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dL().a(js.X, this.dq(), this.ds() + this.ag.j() * 2.0, this.dw(), this.ag.k(), 0.0, this.ag.k());
      }

      if (!this.dL().B && !this.dG()) {
         bjt $$2 = this.v();
         if ($$2 instanceof alr $$3) {
            if ($$3.c.c() && $$3.dL() == this.dL() && !$$3.fD()) {
               if (this.ag.i() < 0.05F && this.dL().X().b(cqv.e)) {
                  cac $$4 = bjx.F.a(this.dL());
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
      bjt $$0 = this.v();
      if ($$0 instanceof alr && !$$0.bv() && this.dL().X().b(cqv.V)) {
         this.ak();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bjt b(alq $$0) {
      bjt $$1 = this.v();
      if ($$1 != null && $$1.dL().ac() != $$0.ac()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
