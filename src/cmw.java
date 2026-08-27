public class cmw extends cme {
   private int f = 200;

   public cmw(bsc<? extends cmw> $$0, daz $$1) {
      super($$0, $$1);
   }

   public cmw(daz $$0, bsq $$1, ctq $$2) {
      super(bsc.aV, $$1, $$0, $$2);
   }

   public cmw(daz $$0, double $$1, double $$2, double $$3, ctq $$4) {
      super(bsc.aV, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B && !this.b) {
         this.dP().a(ky.R, this.du(), this.dw(), this.dA(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bsq $$0) {
      super.a($$0);
      bre $$1 = new bre(brg.x, this.f, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.f = $$0.h("Duration");
      }
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Duration", this.f);
   }

   @Override
   protected ctq x() {
      return new ctq(ctt.vp);
   }
}
