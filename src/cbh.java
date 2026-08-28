public class cbh extends ccg {
   private final cgp g;

   public cbh(cgp $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.q() && !this.g.gv() && super.b();
   }

   @Override
   public void d() {
      super.d();
      this.g.y(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.y(false);
   }

   @Override
   public void a() {
      super.a();
      this.g.y(this.m());
   }

   @Override
   protected boolean a(dey $$0, jg $$1) {
      if (!$$0.u($$1.d())) {
         return false;
      } else {
         dvd $$2 = $$0.a_($$1);
         if ($$2.a(dia.cv)) {
            return dsn.a($$0, $$1) < 1;
         } else {
            return $$2.a(dia.cD) && $$2.c(dle.b) ? true : $$2.a(awz.S, $$0x -> $$0x.d(dhr.b).map($$0xx -> $$0xx != dvq.a).orElse(true));
         }
      }
   }
}
