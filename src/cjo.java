public class cjo extends ckj {
   public static final String c = "SkullOwner";

   public cjo(csq $$0, csq $$1, civ.a $$2) {
      super($$0, $$1, $$2, hc.a);
   }

   @Override
   public ti m(cja $$0) {
      if ($$0.a(cjd.tt) && $$0.u()) {
         String $$1 = null;
         qu $$2 = $$0.v();
         if ($$2.b("SkullOwner", 8)) {
            $$1 = $$2.l("SkullOwner");
         } else if ($$2.b("SkullOwner", 10)) {
            qu $$3 = $$2.p("SkullOwner");
            if ($$3.b("Name", 8)) {
               $$1 = $$3.l("Name");
            }
         }

         if ($$1 != null) {
            return ti.a(this.a() + ".named", $$1);
         }
      }

      return super.m($$0);
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      dea.e($$0);
   }
}
