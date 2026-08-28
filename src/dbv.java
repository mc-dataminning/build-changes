public class dbv extends dbu {
   public dbv(dbr $$0) {
      super($$0);
   }

   private static cxp c(dbs $$0) {
      return $$0.a(1, 0);
   }

   private static cxp d(dbs $$0) {
      return $$0.a(0, 1);
   }

   private static cxp e(dbs $$0) {
      return $$0.a(2, 1);
   }

   private static cxp f(dbs $$0) {
      return $$0.a(1, 2);
   }

   public boolean a(dbs $$0, dhi $$1) {
      return $$0.f() == 3 && $$0.g() == 3 && $$0.e() == 4 ? c($$0).a(ayd.bI) && d($$0).a(ayd.bI) && e($$0).a(ayd.bI) && f($$0).a(ayd.bI) : false;
   }

   public cxp a(dbs $$0, js.a $$1) {
      dwe $$2 = new dwe(c($$0).h(), d($$0).h(), e($$0).h(), f($$0).h());
      return dvo.a($$2);
   }

   @Override
   public dco<dbv> a() {
      return dco.v;
   }
}
