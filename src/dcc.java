public class dcc extends dcb {
   public dcc(dby $$0) {
      super($$0);
   }

   private static cxy c(dbz $$0) {
      return $$0.a(1, 0);
   }

   private static cxy d(dbz $$0) {
      return $$0.a(0, 1);
   }

   private static cxy e(dbz $$0) {
      return $$0.a(2, 1);
   }

   private static cxy f(dbz $$0) {
      return $$0.a(1, 2);
   }

   public boolean a(dbz $$0, dhp $$1) {
      return $$0.f() == 3 && $$0.g() == 3 && $$0.e() == 4 ? c($$0).a(axi.bF) && d($$0).a(axi.bF) && e($$0).a(axi.bF) && f($$0).a(axi.bF) : false;
   }

   public cxy a(dbz $$0, ju.a $$1) {
      dwt $$2 = new dwt(c($$0).h(), d($$0).h(), e($$0).h(), f($$0).h());
      return dwd.a($$2);
   }

   @Override
   public dcv<dcc> a() {
      return dcv.v;
   }
}
