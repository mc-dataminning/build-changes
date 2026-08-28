import javax.annotation.Nullable;

public class cnm extends cnj {
   public cnm(bsm<? extends cnm> $$0, dcf $$1) {
      super($$0, $$1);
   }

   public cnm(dcf $$0, btb $$1) {
      super(bsm.G, $$1, $$0);
   }

   @Override
   protected ctx u() {
      return cuf.sf;
   }

   @Override
   protected void a(ewc $$0) {
      super.a($$0);
      $$0.a().a(this.dR().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(ewd $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dQ().a(lj.ac, this.dv(), this.dx() + this.ah.j() * 2.0, this.dB(), this.ah.k(), 0.0, this.ah.k());
      }

      if (!this.dQ().B && !this.dL()) {
         bsg $$2 = this.s();
         if ($$2 instanceof aqn $$3) {
            if ($$3.c.c() && $$3.dQ() == this.dQ() && !$$3.fI() && !$$3.N_() && $$3.bE()) {
               if (this.ah.i() < 0.05F && this.dQ().ab().b(dcb.e)) {
                  cjh $$4 = bsm.I.a(this.dQ());
                  if ($$4 != null) {
                     $$4.b($$2.dv(), $$2.dx(), $$2.dB(), $$2.dG(), $$2.dI());
                     this.dQ().b($$4);
                  }
               }

               if ($$2.bS()) {
                  $$3.a(this.dv(), this.dx(), this.dB());
               } else {
                  $$2.c(this.dv(), this.dx(), this.dB());
               }

               $$2.n();
               $$2.a(this.dR().l(), 5.0F);
               this.dQ().a(null, this.dv(), this.dx(), this.dB(), avh.uv, avi.h);
            }
         } else if ($$2 != null) {
            $$2.c(this.dv(), this.dx(), this.dB());
            $$2.n();
         }

         this.ap();
      }
   }

   @Override
   public void l() {
      bsg $$0 = this.s();
      if ($$0 instanceof aqn && !$$0.bE() && this.dQ().ab().b(dcb.Y)) {
         this.ap();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bsg b(aqm $$0) {
      bsg $$1 = this.s();
      if ($$1 != null && $$1.dQ().af() != $$0.af()) {
         this.c(null);
      }

      return super.b($$0);
   }
}
