public class dds extends ddr {
   public dds(ddo $$0) {
      super($$0);
   }

   private static czk c(ddp $$0) {
      return $$0.a(1, 0);
   }

   private static czk d(ddp $$0) {
      return $$0.a(0, 1);
   }

   private static czk e(ddp $$0) {
      return $$0.a(2, 1);
   }

   private static czk f(ddp $$0) {
      return $$0.a(1, 2);
   }

   public boolean a(ddp $$0, djh $$1) {
      return $$0.f() == 3 && $$0.g() == 3 && $$0.e() == 4 ? c($$0).a(axk.bG) && d($$0).a(axk.bG) && e($$0).a(axk.bG) && f($$0).a(axk.bG) : false;
   }

   public czk a(ddp $$0, jh.a $$1) {
      dyu $$2 = new dyu(c($$0).h(), d($$0).h(), e($$0).h(), f($$0).h());
      return dye.a($$2);
   }

   @Override
   public del<dds> a() {
      return del.v;
   }
}
