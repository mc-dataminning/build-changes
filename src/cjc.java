import javax.annotation.Nullable;

public class cjc extends ciz {
   public cjc(bol<? extends cjc> $$0, cwe $$1) {
      super($$0, $$1);
   }

   public cjc(cwe $$0, box $$1) {
      super(bol.F, $$1, $$0);
   }

   @Override
   protected cpl s() {
      return cpt.se;
   }

   @Override
   protected void a(eos $$0) {
      super.a($$0);
      $$0.a().a(this.dK().b(this, this.w()), 0.0F);
   }

   @Override
   protected void a(eot $$0) {
      super.a($$0);

      for (int $$1 = 0; $$1 < 32; $$1++) {
         this.dJ().a(kb.Z, this.do(), this.dq() + this.af.j() * 2.0, this.du(), this.af.k(), 0.0, this.af.k());
      }

      if (!this.dJ().B && !this.dE()) {
         bof $$2 = this.w();
         if ($$2 instanceof apb $$3) {
            if ($$3.d.c() && $$3.dJ() == this.dJ() && !$$3.fF()) {
               if (this.af.i() < 0.05F && this.dJ().Z().b(cwa.e)) {
                  cex $$4 = bol.H.a(this.dJ());
                  if ($$4 != null) {
                     $$4.b($$2.do(), $$2.dq(), $$2.du(), $$2.dz(), $$2.dB());
                     this.dJ().b($$4);
                  }
               }

               if ($$2.bL()) {
                  $$3.a(this.do(), this.dq(), this.du());
               } else {
                  $$2.c(this.do(), this.dq(), this.du());
               }

               $$2.n();
               $$2.a(this.dK().k(), 5.0F);
               this.dJ().a(null, this.do(), this.dq(), this.du(), atp.tO, atq.h);
            }
         } else if ($$2 != null) {
            $$2.c(this.do(), this.dq(), this.du());
            $$2.n();
         }

         this.am();
      }
   }

   @Override
   public void l() {
      bof $$0 = this.w();
      if ($$0 instanceof apb && !$$0.bx() && this.dJ().Z().b(cwa.Y)) {
         this.am();
      } else {
         super.l();
      }
   }

   @Nullable
   @Override
   public bof b(apa $$0) {
      bof $$1 = this.w();
      if ($$1 != null && $$1.dJ().ad() != $$0.ad()) {
         this.b(null);
      }

      return super.b($$0);
   }
}
