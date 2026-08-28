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
   protected void a(ewz $$0) {
      super.a($$0);
      $$0.a().a(this.dP().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(exa $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dO().a(lm.ac, this.dt(), this.dv() + this.ah.j() * 2.0, this.dz(), this.ah.k(), 0.0, this.ah.k());
      }

      if (this.dO() instanceof aqu $$2 && !this.dJ()) {
         bsr $$4 = this.s();
         if ($$4 != null && a($$4, $$2)) {
            if ($$4.bS()) {
               $$4.ak();
            }

            if ($$4 instanceof aqv $$5) {
               if ($$5.c.c()) {
                  if (this.ah.i() < 0.05F && $$2.ab().b(dcs.e)) {
                     cju $$6 = bsx.I.a((dcw)$$2);
                     if ($$6 != null) {
                        $$6.b($$4.dt(), $$4.dv(), $$4.dz(), $$4.dE(), $$4.dG());
                        $$2.b($$6);
                     }
                  }

                  $$4.a(new eqc($$2, this.dm(), $$4.dr(), $$4.dE(), $$4.dG(), eqc.a));
                  $$4.n();
                  $$5.gC();
                  $$4.a(this.dP().l(), 5.0F);
                  this.a($$2, this.dm());
               }
            } else {
               $$4.a(new eqc($$2, this.dm(), $$4.dr(), $$4.dE(), $$4.dG(), eqc.a));
               $$4.n();
               this.a($$2, this.dm());
            }

            this.aq();
            return;
         }

         this.aq();
         return;
      }
   }

   private static boolean a(bsr $$0, dcw $$1) {
      if ($$0.dO().af() == $$1.af()) {
         return !($$0 instanceof btn $$2) ? $$0.bE() : $$2.bE() && !$$2.fH();
      } else {
         return $$0.o(true);
      }
   }

   @Override
   public void l() {
      bsr $$0 = this.s();
      if ($$0 instanceof aqv && !$$0.bE() && this.dO().ab().b(dcs.Y)) {
         this.aq();
      } else {
         super.l();
      }
   }

   private void a(dcw $$0, exc $$1) {
      $$0.a(null, $$1.c, $$1.d, $$1.e, avp.uv, avq.h);
   }

   @Override
   public boolean a(dcw $$0, dcw $$1) {
      return $$0.af() == dcw.j && this.s() instanceof aqv $$2 ? super.a($$0, $$1) && $$2.f : super.a($$0, $$1);
   }

   @Override
   protected void a(dtc $$0) {
      super.a($$0);
      if ($$0.a(dga.kF) && this.s() instanceof aqv $$1) {
         $$1.a($$0);
      }
   }
}
