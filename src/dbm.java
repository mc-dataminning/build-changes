public class dbm extends dbl {
   public dbm(dbi $$0) {
      super($$0);
   }

   private static cxh c(dbj $$0) {
      return $$0.a(1, 0);
   }

   private static cxh d(dbj $$0) {
      return $$0.a(0, 1);
   }

   private static cxh e(dbj $$0) {
      return $$0.a(2, 1);
   }

   private static cxh f(dbj $$0) {
      return $$0.a(1, 2);
   }

   public boolean a(dbj $$0, dgz $$1) {
      return $$0.f() == 3 && $$0.g() == 3 && $$0.e() == 4 ? c($$0).a(awy.bF) && d($$0).a(awy.bF) && e($$0).a(awy.bF) && f($$0).a(awy.bF) : false;
   }

   public cxh a(dbj $$0, jt.a $$1) {
      dvz $$2 = new dvz(c($$0).h(), d($$0).h(), e($$0).h(), f($$0).h());
      return dvj.a($$2);
   }

   @Override
   public dcf<dbm> a() {
      return dcf.v;
   }
}
