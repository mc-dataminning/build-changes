public class bzz extends cay {
   private final cfg g;

   public bzz(cfg $$0, double $$1) {
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
   protected boolean a(dbz $$0, iz $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         dsa $$2 = $$0.a_($$1);
         if ($$2.a(dez.cv)) {
            return dpm.a($$0, $$1) < 1;
         } else {
            return $$2.a(dez.cD) && $$2.c(die.b) ? true : $$2.a(awo.R, $$0x -> $$0x.d(deq.b).map($$0xx -> $$0xx != dsn.a).orElse(true));
         }
      }
   }
}
