public class cnz extends cnw {
   public cnz(bsx<? extends cnz> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cnz(dcw $$0, btn $$1) {
      super(bsx.G, $$1, $$0);
   }

   @Override
   protected cul t() {
      return cut.sf;
   }

   @Override
   protected void a(ewx $$0) {
      super.a($$0);
      $$0.a().a(this.dQ().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(ewy $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dP().a(lm.ac, this.du(), this.dw() + this.ah.j() * 2.0, this.dA(), this.ah.k(), 0.0, this.ah.k());
      }

      if (this.dP() instanceof aqu $$2 && !this.dK()) {
         bsr $$4 = this.s();
         if ($$4 != null && a($$4, $$2)) {
            if ($$4.bS()) {
               this.ak();
            }

            if ($$4 instanceof aqv $$5) {
               if ($$5.c.c()) {
                  if (this.ah.i() < 0.05F && $$2.ab().b(dcs.e)) {
                     cju $$6 = bsx.I.a((dcw)$$2);
                     if ($$6 != null) {
                        $$6.b($$4.du(), $$4.dw(), $$4.dA(), $$4.dF(), $$4.dH());
                        $$2.b($$6);
                     }
                  }

                  $$4.a(new eqa($$2, this.dn(), $$4.ds(), $$4.dF(), $$4.dH(), eqa.a));
                  $$4.n();
                  $$4.a(this.dQ().l(), 5.0F);
                  this.a($$2, this.dn());
               }
            } else {
               $$4.a(new eqa($$2, this.dn(), $$4.ds(), $$4.dF(), $$4.dH(), eqa.a));
               $$4.n();
               this.a($$2, this.dn());
            }

            this.aq();
            return;
         }

         this.aq();
         return;
      }
   }

   private static boolean a(bsr $$0, dcw $$1) {
      if ($$0.dP().af() == $$1.af()) {
         return !($$0 instanceof btn $$2) ? $$0.bE() : $$2.bE() && !$$2.fI();
      } else {
         return $$0.cx();
      }
   }

   @Override
   public void l() {
      bsr $$0 = this.s();
      if ($$0 instanceof aqv && !$$0.bE() && this.dP().ab().b(dcs.Y)) {
         this.aq();
      } else {
         super.l();
      }
   }

   private void a(dcw $$0, exa $$1) {
      $$0.a(null, $$1.c, $$1.d, $$1.e, avp.uv, avq.h);
   }
}
