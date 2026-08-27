public class cci extends cbr {
   private int f = 200;

   public cci(bik<? extends cci> $$0, cpk $$1) {
      super($$0, $$1);
   }

   public cci(cpk $$0, biw $$1) {
      super(bik.aR, $$1, $$0);
   }

   public cci(cpk $$0, double $$1, double $$2, double $$3) {
      super(bik.aR, $$1, $$2, $$3, $$0);
   }

   @Override
   public void l() {
      super.l();
      if (this.dK().B && !this.b) {
         this.dK().a(iw.N, this.dp(), this.dr(), this.dv(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected ciw p() {
      return new ciw(ciz.uv);
   }

   @Override
   protected void a(biw $$0) {
      super.a($$0);
      bht $$1 = new bht(bhv.x, this.f, 0);
      $$0.b($$1, this.A());
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }
}
