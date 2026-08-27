public class cmu extends cmc {
   private int g = 200;

   public cmu(bsa<? extends cmu> $$0, dax $$1) {
      super($$0, $$1);
   }

   public cmu(dax $$0, bso $$1, cto $$2) {
      super(bsa.aV, $$1, $$0, $$2);
   }

   public cmu(dax $$0, double $$1, double $$2, double $$3, cto $$4) {
      super(bsa.aV, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dP().B && !this.b) {
         this.dP().a(ky.R, this.du(), this.dw(), this.dA(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bso $$0) {
      super.a($$0);
      brc $$1 = new brc(bre.x, this.g, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.g = $$0.h("Duration");
      }
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Duration", this.g);
   }

   @Override
   protected cto x() {
      return new cto(ctr.vp);
   }
}
