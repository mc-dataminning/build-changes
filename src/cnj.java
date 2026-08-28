import javax.annotation.Nullable;

public class cnj extends cng {
   public cnj(bsj<? extends cnj> $$0, dcd $$1) {
      super($$0, $$1);
   }

   public cnj(dcd $$0, bsy $$1) {
      super(bsj.G, $$1, $$0);
   }

   @Override
   protected ctv u() {
      return cud.sf;
   }

   @Override
   protected void a(evw $$0) {
      super.a($$0);
      $$0.a().a(this.dQ().b(this, this.s()), 0.0F);
   }

   @Override
   protected void a(evx $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dP().a(lj.ac, this.du(), this.dw() + this.ah.j() * 2.0, this.dA(), this.ah.k(), 0.0, this.ah.k());
      }

      if (!this.dP().B && !this.dK()) {
         bsd $$2 = this.s();
         if ($$2 instanceof aql $$3) {
            if ($$3.c.c() && $$3.dP() == this.dP() && !$$3.fH()) {
               if (this.ah.i() < 0.05F && this.dP().ab().b(dbz.e)) {
                  cje $$4 = bsj.I.a(this.dP());
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
               $$2.a(this.dQ().l(), 5.0F);
               this.dP().a(null, this.du(), this.dw(), this.dA(), avf.uv, avg.h);
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
      bsd $$0 = this.s();
      if ($$0 instanceof aql && !$$0.bD() && this.dP().ab().b(dbz.Y)) {
         this.ao();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bsd b(aqk $$0) {
      bsd $$1 = this.s();
      if ($$1 != null && $$1.dP().af() != $$0.af()) {
         this.c(null);
      }

      return super.b($$0);
   }
}
