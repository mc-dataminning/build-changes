public class dbm extends dbl {
   public dbm(dbi $$0) {
      super($$0);
   }

   private static cxg c(dbj $$0) {
      return $$0.a(1, 0);
   }

   private static cxg d(dbj $$0) {
      return $$0.a(0, 1);
   }

   private static cxg e(dbj $$0) {
      return $$0.a(2, 1);
   }

   private static cxg f(dbj $$0) {
      return $$0.a(1, 2);
   }

   public boolean a(dbj $$0, dgz $$1) {
      return $$0.f() == 3 && $$0.g() == 3 && $$0.e() == 4 ? c($$0).a(axt.bI) && d($$0).a(axt.bI) && e($$0).a(axt.bI) && f($$0).a(axt.bI) : false;
   }

   public cxg a(dbj $$0, js.a $$1) {
      dvx $$2 = new dvx(c($$0).h(), d($$0).h(), e($$0).h(), f($$0).h());
      return dvh.a($$2);
   }

   @Override
   public dcf<dbm> a() {
      return dcf.v;
   }
}
