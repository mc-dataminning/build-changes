public class clc extends cld {
   public clc(bqr<? extends clc> $$0, czu $$1) {
      super($$0, $$1);
   }

   public clc(czu $$0, cfa $$1) {
      this(bqr.an, $$0);
      this.c($$1);
      this.a_(
         $$1.ds() - (double)($$1.dh() + 1.0F) * 0.5 * (double)axw.a($$1.aZ * (float) (Math.PI / 180.0)),
         $$1.dw() - 0.1F,
         $$1.dy() + (double)($$1.dh() + 1.0F) * 0.5 * (double)axw.b($$1.aZ * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double aW() {
      return 0.06;
   }

   @Override
   public void l() {
      super.l();
      etf $$0 = this.dq();
      etd $$1 = clf.a(this, this::b);
      this.a($$1);
      double $$2 = this.ds() + $$0.c;
      double $$3 = this.du() + $$0.d;
      double $$4 = this.dy() + $$0.e;
      this.J();
      float $$5 = 0.99F;
      if (this.dN().a(this.cI()).noneMatch(dpx.a::i)) {
         this.am();
      } else if (this.bf()) {
         this.am();
      } else {
         this.g($$0.a(0.99F));
         this.aY();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(etc $$0) {
      super.a($$0);
      if (this.u() instanceof bre $$1) {
         $$0.a().a(this.dO().b(this, $$1), 1.0F);
      }
   }

   @Override
   protected void a(etb $$0) {
      super.a($$0);
      if (!this.dN().B) {
         this.am();
      }
   }

   @Override
   protected void a(ajo.a $$0) {
   }

   @Override
   public void a(abl $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dN().a(kw.ae, this.ds(), this.du(), this.dy(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.o($$1, $$2, $$3);
   }
}
