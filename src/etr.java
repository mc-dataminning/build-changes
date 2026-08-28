import com.google.common.collect.UnmodifiableIterator;

public class etr {
   public static final etp a = a("empty", new etn());
   public static final eto b = a("flowing_water", new etw.a());
   public static final eto c = a("water", new etw.b());
   public static final eto d = a("flowing_lava", new ett.a());
   public static final eto e = a("lava", new ett.b());

   private static <T extends etp> T a(String $$0, T $$1) {
      return kd.a(ma.c, $$0, $$1);
   }

   static {
      for (etp $$0 : ma.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            etq $$1 = (etq)var2.next();
            etp.c.b($$1);
         }
      }
   }
}
