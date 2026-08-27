public class cjt extends cko {
   public static final String c = "SkullOwner";

   public cjt(csv $$0, csv $$1, cja.a $$2) {
      super($$0, $$1, $$2, hc.a);
   }

   @Override
   public tl m(cjf $$0) {
      if ($$0.a(cji.tt) && $$0.u()) {
         String $$1 = null;
         qx $$2 = $$0.v();
         if ($$2.b("SkullOwner", 8)) {
            $$1 = $$2.l("SkullOwner");
         } else if ($$2.b("SkullOwner", 10)) {
            qx $$3 = $$2.p("SkullOwner");
            if ($$3.b("Name", 8)) {
               $$1 = $$3.l("Name");
            }
         }

         if ($$1 != null) {
            return tl.a(this.a() + ".named", $$1);
         }
      }

      return super.m($$0);
   }

   @Override
   public void b(qx $$0) {
      super.b($$0);
      def.e($$0);
   }
}
