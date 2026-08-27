public class cjl extends ckg {
   public static final String c = "SkullOwner";

   public cjl(csl $$0, csl $$1, cis.a $$2) {
      super($$0, $$1, $$2, ha.a);
   }

   @Override
   public tf m(cix $$0) {
      if ($$0.a(cja.tt) && $$0.u()) {
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
            return tf.a(this.a() + ".named", $$1);
         }
      }

      return super.m($$0);
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      ddv.e($$0);
   }
}
