public class cnv extends cnd {
   private int f = 200;

   public cnv(bta<? extends cnv> $$0, dby $$1) {
      super($$0, $$1);
   }

   public cnv(dby $$0, btp $$1, cup $$2) {
      super(bta.aV, $$1, $$0, $$2);
   }

   public cnv(dby $$0, double $$1, double $$2, double $$3, cup $$4) {
      super(bta.aV, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B && !this.b) {
         this.dP().a(li.R, this.du(), this.dw(), this.dA(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(btp $$0) {
      super.a($$0);
      bsc $$1 = new bsc(bse.x, this.f, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(us $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(us $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected cup x() {
      return new cup(cus.vp);
   }
}
