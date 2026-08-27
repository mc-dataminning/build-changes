public class cpr extends cqm {
   public static final String c = "SkullOwner";

   public cpr(cys $$0, cys $$1, coy.a $$2) {
      super($$0, $$1, $$2, ie.a);
   }

   @Override
   public vq m(cpd $$0) {
      if ($$0.a(cpg.uj) && $$0.v()) {
         String $$1 = null;
         sw $$2 = $$0.w();
         if ($$2.b("SkullOwner", 8)) {
            $$1 = $$2.l("SkullOwner");
         } else if ($$2.b("SkullOwner", 10)) {
            sw $$3 = $$2.p("SkullOwner");
            if ($$3.b("Name", 8)) {
               $$1 = $$3.l("Name");
            }
         }

         if ($$1 != null) {
            return vq.a(this.a() + ".named", $$1);
         }
      }

      return super.m($$0);
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      dki.e($$0);
   }
}
