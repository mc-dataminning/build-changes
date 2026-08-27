import com.google.common.collect.UnmodifiableIterator;

public class eac {
   public static final eaa a = a("empty", new dzy());
   public static final dzz b = a("flowing_water", new eah.a());
   public static final dzz c = a("water", new eah.b());
   public static final dzz d = a("flowing_lava", new eae.a());
   public static final dzz e = a("lava", new eae.b());

   private static <T extends eaa> T a(String $$0, T $$1) {
      return hs.a(jc.d, $$0, $$1);
   }

   static {
      for (eaa $$0 : jc.d) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eab $$1 = (eab)var2.next();
            eaa.c.b($$1);
         }
      }
   }
}
