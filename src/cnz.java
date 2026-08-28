import javax.annotation.Nullable;

public class cnz extends cnw {
   public cnz(bta<? extends cnz> $$0, dby $$1) {
      super($$0, $$1);
   }

   public cnz(dby $$0, btp $$1) {
      super(bta.G, $$1, $$0);
   }

   @Override
   protected cuk u() {
      return cus.sf;
   }

   @Override
   protected void a(evo $$0) {
      super.a($$0);
      $$0.a().a(this.dQ().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(evp $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dP().a(li.ac, this.du(), this.dw() + this.ah.j() * 2.0, this.dA(), this.ah.k(), 0.0, this.ah.k());
      }

      if (!this.dP().B && !this.dK()) {
         bsu $$2 = this.s();
         if ($$2 instanceof arg $$3) {
            if ($$3.c.c() && $$3.dP() == this.dP() && !$$3.fL()) {
               if (this.ah.i() < 0.05F && this.dP().ab().b(dbu.e)) {
                  cju $$4 = bta.I.a(this.dP());
                  if ($$4 != null) {
                     $$4.b($$2.du(), $$2.dw(), $$2.dA(), $$2.dF(), $$2.dH());
                     this.dP().b($$4);
                  }
               }

               if ($$2.bR()) {
                  $$3.a(this.du(), this.dw(), this.dA());
               } else {
                  $$2.c(this.du(), this.dw(), this.dA());
               }

               $$2.n();
               $$2.a(this.dQ().k(), 5.0F);
               this.dP().a(null, this.du(), this.dw(), this.dA(), awa.us, awb.h);
            }
         } else if ($$2 != null) {
            $$2.c(this.du(), this.dw(), this.dA());
            $$2.n();
         }

         this.ao();
      }
   }

   @Override
   public void l() {
      bsu $$0 = this.s();
      if ($$0 instanceof arg && !$$0.bD() && this.dP().ab().b(dbu.Y)) {
         this.ao();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bsu b(arf $$0) {
      bsu $$1 = this.s();
      if ($$1 != null && $$1.dP().af() != $$0.af()) {
         this.c(null);
      }

      return super.b($$0);
   }
}
