public class ddl extends ddk {
   public ddl(ddh $$0) {
      super($$0);
   }

   private static czd c(ddi $$0) {
      return $$0.a(1, 0);
   }

   private static czd d(ddi $$0) {
      return $$0.a(0, 1);
   }

   private static czd e(ddi $$0) {
      return $$0.a(2, 1);
   }

   private static czd f(ddi $$0) {
      return $$0.a(1, 2);
   }

   public boolean a(ddi $$0, dja $$1) {
      return $$0.f() == 3 && $$0.g() == 3 && $$0.e() == 4 ? c($$0).a(axk.bG) && d($$0).a(axk.bG) && e($$0).a(axk.bG) && f($$0).a(axk.bG) : false;
   }

   public czd a(ddi $$0, jg.a $$1) {
      dyn $$2 = new dyn(c($$0).h(), d($$0).h(), e($$0).h(), f($$0).h());
      return dxx.a($$2);
   }

   @Override
   public dee<ddl> a() {
      return dee.v;
   }
}
