import com.mojang.authlib.GameProfile;

public class cgn extends chi {
   public static final String c = "SkullOwner";

   public cgn(cpn $$0, cpn $$1, cfu.a $$2) {
      super($$0, $$1, $$2, ha.a);
   }

   @Override
   public sw m(cfz $$0) {
      if ($$0.a(cgc.tt) && $$0.u()) {
         String $$1 = null;
         qr $$2 = $$0.v();
         if ($$2.b("SkullOwner", 8)) {
            $$1 = $$2.l("SkullOwner");
         } else if ($$2.b("SkullOwner", 10)) {
            qr $$3 = $$2.p("SkullOwner");
            if ($$3.b("Name", 8)) {
               $$1 = $$3.l("Name");
            }
         }

         if ($$1 != null) {
            return sw.a(this.a() + ".named", $$1);
         }
      }

      return super.m($$0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      if ($$0.b("SkullOwner", 8) && !ac.b($$0.l("SkullOwner"))) {
         GameProfile $$1 = new GameProfile(null, $$0.l("SkullOwner"));
         dax.a($$1, $$1x -> $$0.a("SkullOwner", rd.a(new qr(), $$1x)));
      }
   }
}
