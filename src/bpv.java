public class bpv extends bqu {
   private final bva g;

   public bpv(bva $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.s() && !this.g.ge() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.y(false);
   }

   @Override
   public void d() {
      super.d();
      this.g.y(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.y(this.m());
   }

   @Override
   protected boolean a(cqe $$0, gw $$1) {
      if (!$$0.t($$1.c())) {
         return false;
      } else {
         dfd $$2 = $$0.a_($$1);
         if ($$2.a(cte.cv)) {
            return ddg.a($$0, $$1) < 1;
         } else {
            return $$2.a(cte.cD) && $$2.c(cwh.b) ? true : $$2.a(apv.R, $$0x -> $$0x.d(csv.b).map($$0xx -> $$0xx != dfq.a).orElse(true));
         }
      }
   }
}
