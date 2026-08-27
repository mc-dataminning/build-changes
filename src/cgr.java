import javax.annotation.Nullable;

public class cgr extends cgo {
   public cgr(bmc<? extends cgr> $$0, ctx $$1) {
      super($$0, $$1);
   }

   public cgr(ctx $$0, bmo $$1) {
      super(bmc.F, $$1, $$0);
   }

   @Override
   protected cnb s() {
      return cnj.se;
   }

   @Override
   protected void a(elz $$0) {
      super.a($$0);
      $$0.a().a(this.dM().b(this, this.w()), 0.0F);
   }

   @Override
   protected void a(ema $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dL().a(jx.Z, this.dq(), this.ds() + this.ag.j() * 2.0, this.dw(), this.ag.k(), 0.0, this.ag.k());
      }

      if (!this.dL().B && !this.dG()) {
         blw $$2 = this.w();
         if ($$2 instanceof anf $$3) {
            if ($$3.c.c() && $$3.dL() == this.dL() && !$$3.fD()) {
               if (this.ag.i() < 0.05F && this.dL().Z().b(ctt.e)) {
                  ccn $$4 = bmc.H.a(this.dL());
                  if ($$4 != null) {
                     $$4.b($$2.dq(), $$2.ds(), $$2.dw(), $$2.dB(), $$2.dD());
                     this.dL().b($$4);
                  }
               }

               if ($$2.bO()) {
                  $$3.a(this.dq(), this.ds(), this.dw());
               } else {
                  $$2.c(this.dq(), this.ds(), this.dw());
               }

               $$2.n();
               $$2.a(this.dM().k(), 5.0F);
               this.dL().a(null, this.dq(), this.ds(), this.dw(), art.tN, aru.h);
            }
         } else if ($$2 != null) {
            $$2.c(this.dq(), this.ds(), this.dw());
            $$2.n();
         }

         this.am();
      }
   }

   @Override
   public void l() {
      blw $$0 = this.w();
      if ($$0 instanceof anf && !$$0.bx() && this.dL().Z().b(ctt.Y)) {
         this.am();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public blw b(ane $$0) {
      blw $$1 = this.w();
      if ($$1 != null && $$1.dL().ae() != $$0.ae()) {
         this.c(null);
      }

      return super.b($$0);
   }
}
