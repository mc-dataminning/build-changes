public class dbu extends dbt {
   public dbu(dbq $$0) {
      super($$0);
   }

   private static cxo c(dbr $$0) {
      return $$0.a(1, 0);
   }

   private static cxo d(dbr $$0) {
      return $$0.a(0, 1);
   }

   private static cxo e(dbr $$0) {
      return $$0.a(2, 1);
   }

   private static cxo f(dbr $$0) {
      return $$0.a(1, 2);
   }

   public boolean a(dbr $$0, dhh $$1) {
      return $$0.f() == 3 && $$0.g() == 3 && $$0.e() == 4 ? c($$0).a(ayd.bI) && d($$0).a(ayd.bI) && e($$0).a(ayd.bI) && f($$0).a(ayd.bI) : false;
   }

   public cxo a(dbr $$0, js.a $$1) {
      dwd $$2 = new dwd(c($$0).h(), d($$0).h(), e($$0).h(), f($$0).h());
      return dvn.a($$2);
   }

   @Override
   public dcn<dbu> a() {
      return dcn.v;
   }
}
