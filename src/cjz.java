public class cjz extends cku {
   public static final String c = "SkullOwner";

   public cjz(ctc $$0, ctc $$1, cjg.a $$2) {
      super($$0, $$1, $$2, ha.a);
   }

   @Override
   public tl m(cjl $$0) {
      if ($$0.a(cjo.tt) && $$0.u()) {
         String $$1 = null;
         qw $$2 = $$0.v();
         if ($$2.b("SkullOwner", 8)) {
            $$1 = $$2.l("SkullOwner");
         } else if ($$2.b("SkullOwner", 10)) {
            qw $$3 = $$2.p("SkullOwner");
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
   public void b(qw $$0) {
      super.b($$0);
      dej.e($$0);
   }
}
