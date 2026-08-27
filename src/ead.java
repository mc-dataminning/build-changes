import com.google.common.collect.UnmodifiableIterator;

public class ead {
   public static final eab a = a("empty", new dzz());
   public static final eaa b = a("flowing_water", new eai.a());
   public static final eaa c = a("water", new eai.b());
   public static final eaa d = a("flowing_lava", new eaf.a());
   public static final eaa e = a("lava", new eaf.b());

   private static <T extends eab> T a(String $$0, T $$1) {
      return hr.a(jb.d, $$0, $$1);
   }

   static {
      for (eab $$0 : jb.d) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eac $$1 = (eac)var2.next();
            eab.c.b($$1);
         }
      }
   }
}
