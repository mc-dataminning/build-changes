public class cqe extends cqz {
   public static final String c = "SkullOwner";

   public cqe(czf $$0, czf $$1, cpl.a $$2) {
      super($$0, $$1, $$2, ih.a);
   }

   @Override
   public vs m(cpq $$0) {
      if ($$0.a(cpt.uj) && $$0.v()) {
         String $$1 = null;
         sy $$2 = $$0.w();
         if ($$2.b("SkullOwner", 8)) {
            $$1 = $$2.l("SkullOwner");
         } else if ($$2.b("SkullOwner", 10)) {
            sy $$3 = $$2.p("SkullOwner");
            if ($$3.b("Name", 8)) {
               $$1 = $$3.l("Name");
            }
         }

         if ($$1 != null) {
            return vs.a(this.a() + ".named", $$1);
         }
      }

      return super.m($$0);
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      dkw.c($$0);
   }
}
