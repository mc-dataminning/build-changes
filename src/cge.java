public class cge extends cfn {
   private static final cmx f = new cmx(cna.vi);
   private int g = 200;

   public cge(bly<? extends cge> $$0, cto $$1) {
      super($$0, $$1, f);
   }

   public cge(cto $$0, bmk $$1, cmx $$2) {
      super(bly.aS, $$1, $$0, $$2);
   }

   public cge(cto $$0, double $$1, double $$2, double $$3, cmx $$4) {
      super(bly.aS, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B && !this.b) {
         this.dM().a(jx.P, this.dr(), this.dt(), this.dx(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bmk $$0) {
      super.a($$0);
      blh $$1 = new blh(blj.x, this.g, 0);
      $$0.b($$1, this.J());
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.g = $$0.h("Duration");
      }
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      $$0.a("Duration", this.g);
   }
}
