import com.google.common.collect.UnmodifiableIterator;

public class equ {
   public static final eqs a = a("empty", new eqq());
   public static final eqr b = a("flowing_water", new eqz.a());
   public static final eqr c = a("water", new eqz.b());
   public static final eqr d = a("flowing_lava", new eqw.a());
   public static final eqr e = a("lava", new eqw.b());

   private static <T extends eqs> T a(String $$0, T $$1) {
      return kb.a(lv.c, $$0, $$1);
   }

   static {
      for (eqs $$0 : lv.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eqt $$1 = (eqt)var2.next();
            eqs.c.b($$1);
         }
      }
   }
}
