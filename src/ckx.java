public class ckx extends cls {
   public static final String c = "SkullOwner";

   public ckx(cua $$0, cua $$1, cke.a $$2) {
      super($$0, $$1, $$2, hx.a);
   }

   @Override
   public ui m(ckj $$0) {
      if ($$0.a(ckm.tt) && $$0.u()) {
         String $$1 = null;
         rt $$2 = $$0.v();
         if ($$2.b("SkullOwner", 8)) {
            $$1 = $$2.l("SkullOwner");
         } else if ($$2.b("SkullOwner", 10)) {
            rt $$3 = $$2.p("SkullOwner");
            if ($$3.b("Name", 8)) {
               $$1 = $$3.l("Name");
            }
         }

         if ($$1 != null) {
            return ui.a(this.a() + ".named", $$1);
         }
      }

      return super.m($$0);
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      dfh.e($$0);
   }
}
