public class cmv extends cnq {
   public static final String c = "SkullOwner";

   public cmv(cvz $$0, cvz $$1, cmc.a $$2) {
      super($$0, $$1, $$2, ia.a);
   }

   @Override
   public vb m(cmh $$0) {
      if ($$0.a(cmk.ug) && $$0.u()) {
         String $$1 = null;
         sj $$2 = $$0.v();
         if ($$2.b("SkullOwner", 8)) {
            $$1 = $$2.l("SkullOwner");
         } else if ($$2.b("SkullOwner", 10)) {
            sj $$3 = $$2.p("SkullOwner");
            if ($$3.b("Name", 8)) {
               $$1 = $$3.l("Name");
            }
         }

         if ($$1 != null) {
            return vb.a(this.a() + ".named", $$1);
         }
      }

      return super.m($$0);
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      dho.e($$0);
   }
}
