public class cpj extends cqh {
   public static final String a = "StoredEnchantments";

   public cpj(cqh.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cqm $$0) {
      return true;
   }

   @Override
   public boolean d_(cqm $$0) {
      return false;
   }

   public static tg d(cqm $$0) {
      ta $$1 = $$0.w();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new tg();
   }

   public static void a(cqm $$0, cuy $$1) {
      tg $$2 = d($$0);
      boolean $$3 = true;
      ajh $$4 = cux.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         ta $$6 = $$2.a($$5);
         ajh $$7 = cux.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cux.a($$6) < $$1.b) {
               cux.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cux.a($$4, $$1.b));
      }

      $$0.x().a("StoredEnchantments", $$2);
   }

   public static cqm a(cuy $$0) {
      cqm $$1 = new cqm(cqp.uu);
      $$1.a($$0.a, $$0.b);
      return $$1;
   }
}
