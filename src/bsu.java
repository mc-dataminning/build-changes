public class bsu extends btt {
   private final bya g;

   public bsu(bya $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean a() {
      return this.g.u() && !this.g.ge() && super.a();
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
   protected boolean a(ctr $$0, hx $$1) {
      if (!$$0.u($$1.c())) {
         return false;
      } else {
         djg $$2 = $$0.a_($$1);
         if ($$2.a(cwr.cv)) {
            return dhb.a($$0, $$1) < 1;
         } else {
            return $$2.a(cwr.cD) && $$2.c(czw.b) ? true : $$2.a(asg.R, $$0x -> $$0x.d(cwi.b).map($$0xx -> $$0xx != djt.a).orElse(true));
         }
      }
   }
}
