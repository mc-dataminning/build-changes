public class cep extends cfo {
   private final cjy g;

   public cep(cjy $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.m() && !this.g.gu() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.x(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.x(false);
   }

   @Override
   public void a() {
      super.a();
      this.g.x(this.m());
   }

   @Override
   protected boolean a(dkm $$0, iw $$1) {
      if (!$$0.v($$1.d())) {
         return false;
      } else {
         ebq $$2 = $$0.a_($$1);
         if ($$2.a(dnq.cG)) {
            return dyw.a($$0, $$1) < 1;
         } else {
            return $$2.a(dnq.cO) && $$2.c(dqz.b) ? true : $$2.a(axn.T, $$0x -> $$0x.d(dnh.b).map($$0xx -> $$0xx != ecd.a).orElse(true));
         }
      }
   }
}
