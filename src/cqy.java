public class cqy extends crt {
   public static final String c = "SkullOwner";

   public cqy(daa $$0, daa $$1, cqf.a $$2) {
      super($$0, $$1, $$2, ih.a);
   }

   @Override
   public vu m(cqk $$0) {
      if ($$0.a(cqn.uk) && $$0.v()) {
         String $$1 = null;
         ta $$2 = $$0.w();
         if ($$2.b("SkullOwner", 8)) {
            $$1 = $$2.l("SkullOwner");
         } else if ($$2.b("SkullOwner", 10)) {
            ta $$3 = $$2.p("SkullOwner");
            if ($$3.b("Name", 8)) {
               $$1 = $$3.l("Name");
            }
         }

         if ($$1 != null) {
            return vu.a(this.a() + ".named", $$1);
         }
      }

      return super.m($$0);
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      dlr.c($$0);
   }
}
