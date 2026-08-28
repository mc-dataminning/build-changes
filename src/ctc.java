public class ctc extends ctd {
   public ctc(bxn<? extends ctc> $$0, dkj $$1) {
      super($$0, $$1);
   }

   public ctc(dkj $$0, cmh $$1) {
      this(bxn.az, $$0);
      this.c($$1);
      this.a_(
         $$1.dA() - (double)($$1.dq() + 1.0F) * 0.5 * (double)azz.a($$1.aV * (float) (Math.PI / 180.0)),
         $$1.dE() - 0.1F,
         $$1.dG() + (double)($$1.dq() + 1.0F) * 0.5 * (double)azz.b($$1.aV * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double bc() {
      return 0.06;
   }

   @Override
   public void h() {
      super.h();
      fgc $$0 = this.dy();
      fga $$1 = ctf.a(this, this::b);
      this.b($$1);
      double $$2 = this.dA() + $$0.d;
      double $$3 = this.dC() + $$0.e;
      double $$4 = this.dG() + $$0.f;
      this.A();
      float $$5 = 0.99F;
      if (this.dV().a(this.cR()).noneMatch(ebp.a::l)) {
         this.aq();
      } else if (this.bi()) {
         this.aq();
      } else {
         this.i($$0.c(0.99F));
         this.be();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(ffz $$0) {
      super.a($$0);
      if (this.q() instanceof byf $$1) {
         bxe $$2 = $$0.a();
         bvt $$3 = this.dW().b(this, $$1);
         if (this.dV() instanceof asb $$4 && $$2.a($$4, $$3, 1.0F)) {
            dgz.a($$4, $$2, $$3);
         }
      }
   }

   @Override
   protected void a(ffy $$0) {
      super.a($$0);
      if (!this.dV().C) {
         this.aq();
      }
   }

   @Override
   protected void a(aky.a $$0) {
   }

   @Override
   public void a(acg $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dV().a(lz.ak, this.dA(), this.dC(), this.dG(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.n($$1, $$2, $$3);
   }
}
