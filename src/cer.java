public class cer extends cea {
   private static final clj f = new clj(clm.vh);
   private int g = 200;

   public cer(bku<? extends cer> $$0, csa $$1) {
      super($$0, $$1, f);
   }

   public cer(csa $$0, blg $$1, clj $$2) {
      super(bku.aR, $$1, $$0, $$2);
   }

   public cer(csa $$0, double $$1, double $$2, double $$3, clj $$4) {
      super(bku.aR, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dN().B && !this.b) {
         this.dN().a(js.N, this.ds(), this.du(), this.dy(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(blg $$0) {
      super.a($$0);
      bkd $$1 = new bkd(bkf.x, this.g, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.g = $$0.h("Duration");
      }
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      $$0.a("Duration", this.g);
   }
}
