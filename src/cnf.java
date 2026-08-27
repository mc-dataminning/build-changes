public class cnf extends coa {
   public static final String c = "SkullOwner";

   public cnf(cwj $$0, cwj $$1, cmm.a $$2) {
      super($$0, $$1, $$2, ic.a);
   }

   @Override
   public vd m(cmr $$0) {
      if ($$0.a(cmu.ug) && $$0.u()) {
         String $$1 = null;
         sl $$2 = $$0.v();
         if ($$2.b("SkullOwner", 8)) {
            $$1 = $$2.l("SkullOwner");
         } else if ($$2.b("SkullOwner", 10)) {
            sl $$3 = $$2.p("SkullOwner");
            if ($$3.b("Name", 8)) {
               $$1 = $$3.l("Name");
            }
         }

         if ($$1 != null) {
            return vd.a(this.a() + ".named", $$1);
         }
      }

      return super.m($$0);
   }

   @Override
   public void b(sl $$0) {
      super.b($$0);
      dhz.e($$0);
   }
}
