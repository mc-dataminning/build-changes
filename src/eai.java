import com.google.common.collect.UnmodifiableIterator;

public class eai {
   public static final eag a = a("empty", new eae());
   public static final eaf b = a("flowing_water", new ean.a());
   public static final eaf c = a("water", new ean.b());
   public static final eaf d = a("flowing_lava", new eak.a());
   public static final eaf e = a("lava", new eak.b());

   private static <T extends eag> T a(String $$0, T $$1) {
      return ht.a(jd.d, $$0, $$1);
   }

   static {
      for (eag $$0 : jd.d) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eah $$1 = (eah)var2.next();
            eag.c.b($$1);
         }
      }
   }
}
