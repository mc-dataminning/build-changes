public class cnm extends coh {
   public static final String c = "SkullOwner";

   public cnm(cwq $$0, cwq $$1, cmt.a $$2) {
      super($$0, $$1, $$2, ic.a);
   }

   @Override
   public vf m(cmy $$0) {
      if ($$0.a(cnb.ug) && $$0.u()) {
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
      dig.e($$0);
   }
}
