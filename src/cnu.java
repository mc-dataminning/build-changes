public class cnu extends coq {
   public static final String c = "SkullOwner";

   public cnu(cwy $$0, cwy $$1, cnb.a $$2) {
      super($$0, $$1, $$2, ic.a);
   }

   @Override
   public vg m(cng $$0) {
      if ($$0.a(cnj.uj) && $$0.u()) {
         String $$1 = null;
         so $$2 = $$0.v();
         if ($$2.b("SkullOwner", 8)) {
            $$1 = $$2.l("SkullOwner");
         } else if ($$2.b("SkullOwner", 10)) {
            so $$3 = $$2.p("SkullOwner");
            if ($$3.b("Name", 8)) {
               $$1 = $$3.l("Name");
            }
         }

         if ($$1 != null) {
            return vg.a(this.a() + ".named", $$1);
         }
      }

      return super.m($$0);
   }

   @Override
   public void b(so $$0) {
      super.b($$0);
      dio.e($$0);
   }
}
