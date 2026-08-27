public class cph extends cqf {
   public static final String a = "StoredEnchantments";

   public cph(cqf.a $$0) {
      super($$0);
   }

   @Override
   public boolean i(cqk $$0) {
      return true;
   }

   @Override
   public boolean d_(cqk $$0) {
      return false;
   }

   public static tg d(cqk $$0) {
      ta $$1 = $$0.w();
      return $$1 != null ? $$1.c("StoredEnchantments", 10) : new tg();
   }

   public static void a(cqk $$0, cuw $$1) {
      tg $$2 = d($$0);
      boolean $$3 = true;
      ajh $$4 = cuv.a($$1.a);

      for (int $$5 = 0; $$5 < $$2.size(); $$5++) {
         ta $$6 = $$2.a($$5);
         ajh $$7 = cuv.b($$6);
         if ($$7 != null && $$7.equals($$4)) {
            if (cuv.a($$6) < $$1.b) {
               cuv.a($$6, $$1.b);
            }

            $$3 = false;
            break;
         }
      }

      if ($$3) {
         $$2.add(cuv.a($$4, $$1.b));
      }

      $$0.x().a("StoredEnchantments", $$2);
   }

   public static cqk a(cuw $$0) {
      cqk $$1 = new cqk(cqn.ut);
      $$1.a($$0.a, $$0.b);
      return $$1;
   }
}
