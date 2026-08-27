public class clp extends cmk {
   public static final String c = "SkullOwner";

   public clp(cut $$0, cut $$1, ckw.a $$2) {
      super($$0, $$1, $$2, hx.a);
   }

   @Override
   public ur m(clb $$0) {
      if ($$0.a(cle.tu) && $$0.u()) {
         String $$1 = null;
         rz $$2 = $$0.v();
         if ($$2.b("SkullOwner", 8)) {
            $$1 = $$2.l("SkullOwner");
         } else if ($$2.b("SkullOwner", 10)) {
            rz $$3 = $$2.p("SkullOwner");
            if ($$3.b("Name", 8)) {
               $$1 = $$3.l("Name");
            }
         }

         if ($$1 != null) {
            return ur.a(this.a() + ".named", $$1);
         }
      }

      return super.m($$0);
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      dgc.e($$0);
   }
}
