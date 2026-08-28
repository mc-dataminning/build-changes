public class caq extends cbp {
   private final cfy g;

   public caq(cfy $$0, double $$1) {
      super($$0, $$1, 8);
      this.g = $$0;
   }

   @Override
   public boolean b() {
      return this.g.q() && !this.g.go() && super.b();
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
   protected boolean a(ddv $$0, je $$1) {
      if (!$$0.u($$1.d())) {
         return false;
      } else {
         dua $$2 = $$0.a_($$1);
         if ($$2.a(dgx.cv)) {
            return drl.a($$0, $$1) < 1;
         } else {
            return $$2.a(dgx.cD) && $$2.c(dkc.b) ? true : $$2.a(aws.S, $$0x -> $$0x.d(dgo.b).map($$0xx -> $$0xx != dun.a).orElse(true));
         }
      }
   }
}
