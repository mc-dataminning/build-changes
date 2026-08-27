public class clj extends ckr {
   private int g = 200;

   public clj(bqr<? extends clj> $$0, czu $$1) {
      super($$0, $$1);
   }

   public clj(czu $$0, bre $$1, csd $$2) {
      super(bqr.aU, $$1, $$0, $$2);
   }

   public clj(czu $$0, double $$1, double $$2, double $$3, csd $$4) {
      super(bqr.aU, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dN().B && !this.b) {
         this.dN().a(kw.P, this.ds(), this.du(), this.dy(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bre $$0) {
      super.a($$0);
      bpx $$1 = new bpx(bpz.x, this.g, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(ty $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.g = $$0.h("Duration");
      }
   }

   @Override
   public void b(ty $$0) {
      super.b($$0);
      $$0.a("Duration", this.g);
   }

   @Override
   protected csd x() {
      return new csd(csg.vp);
   }
}
