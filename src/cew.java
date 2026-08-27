public class cew extends cef {
   private static final clo f = new clo(clr.vh);
   private int g = 200;

   public cew(bkz<? extends cew> $$0, csf $$1) {
      super($$0, $$1, f);
   }

   public cew(csf $$0, bll $$1, clo $$2) {
      super(bkz.aR, $$1, $$0, $$2);
   }

   public cew(csf $$0, double $$1, double $$2, double $$3, clo $$4) {
      super(bkz.aR, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dN().B && !this.b) {
         this.dN().a(jw.N, this.ds(), this.du(), this.dy(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bll $$0) {
      super.a($$0);
      bki $$1 = new bki(bkk.x, this.g, 0);
      $$0.b($$1, this.I());
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.g = $$0.h("Duration");
      }
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("Duration", this.g);
   }
}
