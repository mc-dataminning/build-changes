public class cmc extends cmx {
   public static final String c = "SkullOwner";

   public cmc(cvf $$0, cvf $$1, clj.a $$2) {
      super($$0, $$1, $$2, ib.a);
   }

   @Override
   public uv m(clo $$0) {
      if ($$0.a(clr.uf) && $$0.u()) {
         String $$1 = null;
         sd $$2 = $$0.v();
         if ($$2.b("SkullOwner", 8)) {
            $$1 = $$2.l("SkullOwner");
         } else if ($$2.b("SkullOwner", 10)) {
            sd $$3 = $$2.p("SkullOwner");
            if ($$3.b("Name", 8)) {
               $$1 = $$3.l("Name");
            }
         }

         if ($$1 != null) {
            return uv.a(this.a() + ".named", $$1);
         }
      }

      return super.m($$0);
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      dgt.e($$0);
   }
}
