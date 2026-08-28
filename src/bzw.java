public class bzw extends cav {
   private final cfd g;

   public bzw(cfd $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.s() && !this.g.gq() && super.a();
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
   protected boolean a(dbw $$0, iz $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         drx $$2 = $$0.a_($$1);
         if ($$2.a(dew.cv)) {
            return dpj.a($$0, $$1) < 1;
         } else {
            return $$2.a(dew.cD) && $$2.c(dib.b) ? true : $$2.a(awl.R, $$0x -> $$0x.d(den.b).map($$0xx -> $$0xx != dsk.a).orElse(true));
         }
      }
   }
}
