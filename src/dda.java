public class dda extends dcz {
   public dda(dcw $$0) {
      super($$0);
   }

   private static cys c(dcx $$0) {
      return $$0.a(1, 0);
   }

   private static cys d(dcx $$0) {
      return $$0.a(0, 1);
   }

   private static cys e(dcx $$0) {
      return $$0.a(2, 1);
   }

   private static cys f(dcx $$0) {
      return $$0.a(1, 2);
   }

   public boolean a(dcx $$0, dip $$1) {
      return $$0.f() == 3 && $$0.g() == 3 && $$0.e() == 4 ? c($$0).a(axi.bF) && d($$0).a(axi.bF) && e($$0).a(axi.bF) && f($$0).a(axi.bF) : false;
   }

   public cys a(dcx $$0, jg.a $$1) {
      dxv $$2 = new dxv(c($$0).h(), d($$0).h(), e($$0).h(), f($$0).h());
      return dxf.a($$2);
   }

   @Override
   public ddt<dda> a() {
      return ddt.v;
   }
}
