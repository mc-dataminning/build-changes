import com.google.common.collect.UnmodifiableIterator;

public class eae {
   public static final eac a = a("empty", new eaa());
   public static final eab b = a("flowing_water", new eaj.a());
   public static final eab c = a("water", new eaj.b());
   public static final eab d = a("flowing_lava", new eag.a());
   public static final eab e = a("lava", new eag.b());

   private static <T extends eac> T a(String $$0, T $$1) {
      return hr.a(jb.d, $$0, $$1);
   }

   static {
      for (eac $$0 : jb.d) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            ead $$1 = (ead)var2.next();
            eac.c.b($$1);
         }
      }
   }
}
