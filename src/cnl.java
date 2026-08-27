public class cnl extends cog {
   public static final String c = "SkullOwner";

   public cnl(cwp $$0, cwp $$1, cms.a $$2) {
      super($$0, $$1, $$2, ic.a);
   }

   @Override
   public vf m(cmx $$0) {
      if ($$0.a(cna.ug) && $$0.u()) {
         String $$1 = null;
         sn $$2 = $$0.v();
         if ($$2.b("SkullOwner", 8)) {
            $$1 = $$2.l("SkullOwner");
         } else if ($$2.b("SkullOwner", 10)) {
            sn $$3 = $$2.p("SkullOwner");
            if ($$3.b("Name", 8)) {
               $$1 = $$3.l("Name");
            }
         }

         if ($$1 != null) {
            return vf.a(this.a() + ".named", $$1);
         }
      }

      return super.m($$0);
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      dif.e($$0);
   }
}
