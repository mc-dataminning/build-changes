public class cno extends cnp {
   public cno(bsx<? extends cno> $$0, dcw $$1) {
      super($$0, $$1);
   }

   public cno(dcw $$0, chl $$1) {
      this(bsx.ao, $$0);
      this.c($$1);
      this.a_(
         $$1.dt() - (double)($$1.dj() + 1.0F) * 0.5 * (double)ayo.a($$1.aY * (float) (Math.PI / 180.0)),
         $$1.dx() - 0.1F,
         $$1.dz() + (double)($$1.dj() + 1.0F) * 0.5 * (double)ayo.b($$1.aY * (float) (Math.PI / 180.0))
      );
   }

   @Override
   protected double aZ() {
      return 0.06;
   }

   @Override
   public void l() {
      super.l();
      exc $$0 = this.dr();
      exa $$1 = cnr.a(this, this::b);
      this.b($$1);
      double $$2 = this.dt() + $$0.c;
      double $$3 = this.dv() + $$0.d;
      double $$4 = this.dz() + $$0.e;
      this.I();
      float $$5 = 0.99F;
      if (this.dO().a(this.cK()).noneMatch(dtb.a::i)) {
         this.aq();
      } else if (this.bi()) {
         this.aq();
      } else {
         this.i($$0.a(0.99F));
         this.bb();
         this.a_($$2, $$3, $$4);
      }
   }

   @Override
   protected void a(ewz $$0) {
      super.a($$0);
      if (this.s() instanceof btn $$1) {
         bsr $$2 = $$0.a();
         brk $$3 = this.dP().b(this, $$1);
         if ($$2.a($$3, 1.0F) && this.dO() instanceof aqu $$4) {
            dae.a($$4, $$2, $$3);
         }
      }
   }

   @Override
   protected void a(ewy $$0) {
      super.a($$0);
      if (!this.dO().B) {
         this.aq();
      }
   }

   @Override
   protected void a(aka.a $$0) {
   }

   @Override
   public void a(abv $$0) {
      super.a($$0);
      double $$1 = $$0.j();
      double $$2 = $$0.k();
      double $$3 = $$0.l();

      for (int $$4 = 0; $$4 < 7; $$4++) {
         double $$5 = 0.4 + 0.1 * (double)$$4;
         this.dO().a(lm.ah, this.dt(), this.dv(), this.dz(), $$1 * $$5, $$2, $$3 * $$5);
      }

      this.n($$1, $$2, $$3);
   }
}
