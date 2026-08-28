public class ddv extends ddu {
   public ddv(ddr $$0) {
      super($$0);
   }

   private static czn c(dds $$0) {
      return $$0.a(1, 0);
   }

   private static czn d(dds $$0) {
      return $$0.a(0, 1);
   }

   private static czn e(dds $$0) {
      return $$0.a(2, 1);
   }

   private static czn f(dds $$0) {
      return $$0.a(1, 2);
   }

   public boolean a(dds $$0, djm $$1) {
      return $$0.f() == 3 && $$0.g() == 3 && $$0.e() == 4 ? c($$0).a(axk.bG) && d($$0).a(axk.bG) && e($$0).a(axk.bG) && f($$0).a(axk.bG) : false;
   }

   public czn a(dds $$0, jh.a $$1) {
      dyz $$2 = new dyz(c($$0).h(), d($$0).h(), e($$0).h(), f($$0).h());
      return dyj.a($$2);
   }

   @Override
   public deo<ddv> a() {
      return deo.v;
   }
}
