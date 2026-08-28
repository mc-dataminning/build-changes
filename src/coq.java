public class coq extends cor {
   public coq(bty<? extends coq> $$0, dej $$1) {
      super($$0, $$1);
   }

   public coq(dej $$0, cik $$1) {
      this(bty.ao, $$0);
      this.c($$1);
      this.a_(
         $$1.dx() - (double)($$1.dn() + 1.0F) * 0.5 * (double)azf.a($$1.aT * (float) (Math.PI / 180.0)),
         $$1.dB() - 0.1F,
         $$1.dD() + (double)($$1.dn() + 1.0F) * 0.5 * (double)azf.b($$1.aT * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double bc() {
      return 0.06;
   }

   @Override
   public void l() {
      super.l();
      eyw $$0 = this.dv();
      eyu $$1 = cot.a(this, this::b);
      this.b($$1);
      double $$2 = this.dx() + $$0.d;
      double $$3 = this.dz() + $$0.e;
      double $$4 = this.dD() + $$0.f;
      this.G();
      float $$5 = 0.99F;
      if (this.dS().a(this.cO()).noneMatch(dur.a::l)) {
         this.as();
      } else if (this.bl()) {
         this.as();
      } else {
         this.h($$0.c(0.99F));
         this.be();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(eyt $$0) {
      super.a($$0);
      if (this.s() instanceof bun $$1) {
         btr $$2 = $$0.a();
         bsj $$3 = this.dT().b(this, $$1);
         if ($$2.a($$3, 1.0F) && this.dS() instanceof arj $$4) {
            dbp.a($$4, $$2, $$3);
         }
      }
   }

   @Override
   protected void a(eys $$0) {
      super.a($$0);
      if (!this.dS().B) {
         this.as();
      }
   }

   @Override
   protected void a(akl.a $$0) {
   }

   @Override
   public void a(acb $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dS().a(lo.ah, this.dx(), this.dz(), this.dD(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.n($$1, $$2, $$3);
   }
}
