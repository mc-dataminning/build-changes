public class cjk extends ckf {
   public static final String c = "SkullOwner";

   public cjk(csk $$0, csk $$1, cir.a $$2) {
      super($$0, $$1, $$2, hb.a);
   }

   @Override
   public te m(ciw $$0) {
      if ($$0.a(ciz.tt) && $$0.u()) {
         String $$1 = null;
         qs $$2 = $$0.v();
         if ($$2.b("SkullOwner", 8)) {
            $$1 = $$2.l("SkullOwner");
         } else if ($$2.b("SkullOwner", 10)) {
            qs $$3 = $$2.p("SkullOwner");
            if ($$3.b("Name", 8)) {
               $$1 = $$3.l("Name");
            }
         }

         if ($$1 != null) {
            return te.a(this.a() + ".named", $$1);
         }
      }

      return super.m($$0);
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      ddu.e($$0);
   }
}
