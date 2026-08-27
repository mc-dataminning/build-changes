import javax.annotation.Nullable;

public class cna extends cmx {
   public cna(bsc<? extends cna> $$0, daz $$1) {
      super($$0, $$1);
   }

   public cna(daz $$0, bsq $$1) {
      super(bsc.G, $$1, $$0);
   }

   @Override
   protected ctl u() {
      return ctt.sf;
   }

   @Override
   protected void a(euj $$0) {
      super.a($$0);
      $$0.a().a(this.dQ().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(euk $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dP().a(ky.ac, this.du(), this.dw() + this.ah.j() * 2.0, this.dA(), this.ah.k(), 0.0, this.ah.k());
      }

      if (!this.dP().B && !this.dK()) {
         brw $$2 = this.s();
         if ($$2 instanceof aqo $$3) {
            if ($$3.c.c() && $$3.dP() == this.dP() && !$$3.fL()) {
               if (this.ah.i() < 0.05F && this.dP().aa().b(dav.e)) {
                  civ $$4 = bsc.I.a(this.dP());
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
               this.dP().a(null, this.du(), this.dw(), this.dA(), avi.us, avj.h);
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
      brw $$0 = this.s();
      if ($$0 instanceof aqo && !$$0.bD() && this.dP().aa().b(dav.Y)) {
         this.ao();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public brw b(aqn $$0) {
      brw $$1 = this.s();
      if ($$1 != null && $$1.dP().ae() != $$0.ae()) {
         this.c(null);
      }

      return super.b($$0);
   }
}
