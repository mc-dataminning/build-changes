public class cnm extends cnn {
   public cnm(bsy<? extends cnm> $$0, dbw $$1) {
      super($$0, $$1);
   }

   public cnm(dbw $$0, chk $$1) {
      this(bsy.ao, $$0);
      this.c($$1);
      this.a_(
         $$1.du() - (double)($$1.dj() + 1.0F) * 0.5 * (double)ayx.a($$1.aY * (float) (Math.PI / 180.0)),
         $$1.dy() - 0.1F,
         $$1.dA() + (double)($$1.dj() + 1.0F) * 0.5 * (double)ayx.b($$1.aY * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double aY() {
      return 0.06;
   }

   @Override
   public void l() {
      super.l();
      evp $$0 = this.ds();
      evn $$1 = cnp.a(this, this::b);
      this.b($$1);
      double $$2 = this.du() + $$0.c;
      double $$3 = this.dw() + $$0.d;
      double $$4 = this.dA() + $$0.e;
      this.J();
      float $$5 = 0.99F;
      if (this.dP().a(this.cK()).noneMatch(drz.a::i)) {
         this.ao();
      } else if (this.bh()) {
         this.ao();
      } else {
         this.h($$0.a(0.99F));
         this.ba();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(evm $$0) {
      super.a($$0);
      if (this.s() instanceof btn $$1) {
         $$0.a().a(this.dQ().b(this, $$1), 1.0F);
      }
   }

   @Override
   protected void a(evl $$0) {
      super.a($$0);
      if (!this.dP().B) {
         this.ao();
      }
   }

   @Override
   protected void a(akn.a $$0) {
   }

   @Override
   public void a(aci $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dP().a(li.ah, this.du(), this.dw(), this.dA(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.o($$1, $$2, $$3);
   }
}
