public class com extends cpl {
   public static final String a = "StoredEnchantments";

   public com(cpl.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cpq $$0) {
      return true;
   }

   @Override
   public boolean d_(cpq $$0) {
      return false;
   }

   public static te d(cpq $$0) {
      sy $$1 = $$0.w();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new te();
   }

   public static void a(cpq $$0, cub $$1) {
      te $$2 = d($$0);
      boolean $$3 = true;
      ajc $$4 = cua.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         sy $$6 = $$2.a($$5);
         ajc $$7 = cua.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cua.a($$6) < $$1.b) {
               cua.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cua.a($$4, $$1.b));
      }

      $$0.x().a("StoredEnchantments", $$2);
   }

   public static cpq a(cub $$0) {
      cpq $$1 = new cpq(cpt.us);
      $$1.a($$0.a, $$0.b);
      return $$1;
   }
}
