import com.google.common.collect.UnmodifiableIterator;

public class ecy {
   public static final ecw a = a("empty", new ecu());
   public static final ecv b = a("flowing_water", new edd.a());
   public static final ecv c = a("water", new edd.b());
   public static final ecv d = a("flowing_lava", new eda.a());
   public static final ecv e = a("lava", new eda.b());

   private static <T extends ecw> T a(String $$0, T $$1) {
      return is.a(kc.d, $$0, $$1);
   }

   static {
      for (ecw $$0 : kc.d) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            ecx $$1 = (ecx)var2.next();
            ecw.c.b($$1);
         }
      }
   }
}
