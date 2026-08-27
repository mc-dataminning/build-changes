public class fqv extends fpm {
   private final dbb s;

   public fqv(dbb $$0) {
      this.s = $$0;
   }

   @Override
   public dbb B() {
      return this.s;
   }

   @Override
   int C() {
      return 150;
   }

   @Override
   protected void aN_() {
      super.aN_();
      this.a.a(this.B().m());
   }

   @Override
   protected void a(dbb $$0) {
      if ($$0 instanceof coe.a $$1) {
         this.m.L().b(new ahz($$1.h().al(), this.a.a(), $$0.p()));
      }
   }
}
