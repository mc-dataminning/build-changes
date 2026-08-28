import javax.annotation.Nullable;

public class cnn extends cnk {
   public cnn(bsn<? extends cnn> $$0, dcg $$1) {
      super($$0, $$1);
   }

   public cnn(dcg $$0, btc $$1) {
      super(bsn.G, $$1, $$0);
   }

   @Override
   protected cty t() {
      return cug.sf;
   }

   @Override
   protected void a(ewe $$0) {
      super.a($$0);
      $$0.a().a(this.dS().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(ewf $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dR().a(lj.ac, this.dw(), this.dy() + this.ah.j() * 2.0, this.dC(), this.ah.k(), 0.0, this.ah.k());
      }

      if (!this.dR().B && !this.dM()) {
         bsh $$2 = this.s();
         if ($$2 instanceof aqn $$3) {
            if ($$3.c.c() && $$3.dR() == this.dR() && !$$3.fJ() && !$$3.N_() && $$3.bF()) {
               if (this.ah.i() < 0.05F && this.dR().ab().b(dcc.e)) {
                  cji $$4 = bsn.I.a(this.dR());
                  if ($$4 != null) {
                     $$4.b($$2.dw(), $$2.dy(), $$2.dC(), $$2.dH(), $$2.dJ());
                     this.dR().b($$4);
                  }
               }

               if ($$2.bT()) {
                  $$3.a(this.dw(), this.dy(), this.dC());
               } else {
                  $$2.c(this.dw(), this.dy(), this.dC());
               }

               $$2.n();
               $$2.a(this.dS().l(), 5.0F);
               this.dR().a(null, this.dw(), this.dy(), this.dC(), avh.uv, avi.h);
            }
         } else if ($$2 != null) {
            $$2.c(this.dw(), this.dy(), this.dC());
            $$2.n();
         }

         this.aq();
      }
   }

   @Override
   public void l() {
      bsh $$0 = this.s();
      if ($$0 instanceof aqn && !$$0.bF() && this.dR().ab().b(dcc.Y)) {
         this.aq();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bsh a(bsh.a $$0) {
      return super.a(() -> {
         eph $$1 = $$0.get();
         if ($$1 != null && this.s() != null && this.s().dR().af() != $$1.a().af()) {
            this.c(null);
         }

         return $$1;
      });
   }
}
