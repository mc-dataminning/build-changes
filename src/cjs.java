public class cjs extends cja {
   private static final cqm g = new cqm(cqp.vn);
   private int h = 200;

   public cjs(bpd<? extends cjs> $$0, cxb $$1) {
      super($$0, $$1, g);
   }

   public cjs(cxb $$0, bpp $$1, cqm $$2) {
      super(bpd.aV, $$1, $$0, $$2);
   }

   public cjs(cxb $$0, double $$1, double $$2, double $$3, cqm $$4) {
      super(bpd.aV, $$1, $$2, $$3, $$0, $$4);
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B && !this.b) {
         this.dM().a(kc.Q, this.dr(), this.dt(), this.dx(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bpp $$0) {
      super.a($$0);
      bok $$1 = new bok(bom.x, this.h, 0);
      $$0.b($$1, this.H());
   }

   @Override
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.e("Duration")) {
         this.h = $$0.h("Duration");
      }
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      $$0.a("Duration", this.h);
   }
}
