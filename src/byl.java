public class byl extends bzk {
   private final cds g;

   public byl(cds $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.r() && !this.g.gp() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.x(false);
   }

   @Override
   public void d() {
      super.d();
      this.g.x(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.x(this.m());
   }

   @Override
   protected boolean a(dag $$0, in $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         dqh $$2 = $$0.a_($$1);
         if ($$2.a(ddg.cv)) {
            return dnt.a($$0, $$1) < 1;
         } else {
            return $$2.a(ddg.cD) && $$2.c(dgl.b) ? true : $$2.a(avr.R, $$0x -> $$0x.d(dcx.b).map($$0xx -> $$0xx != dqu.a).orElse(true));
         }
      }
   }
}
