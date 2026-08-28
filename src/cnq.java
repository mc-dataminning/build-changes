public class cnq extends cmy {
   private int f = 200;

   public cnq(bsv<? extends cnq> $$0, dbt $$1) {
      super($$0, $$1);
   }

   public cnq(dbt $$0, btk $$1, cuk $$2) {
      super(bsv.aV, $$1, $$0, $$2);
   }

   public cnq(dbt $$0, double $$1, double $$2, double $$3, cuk $$4) {
      super(bsv.aV, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B && !this.b) {
         this.dP().a(lj.R, this.du(), this.dw(), this.dA(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(btk $$0) {
      super.a($$0);
      brx $$1 = new brx(brz.x, this.f, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected cuk x() {
      return new cuk(cun.vp);
   }
}
