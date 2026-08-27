import com.google.common.collect.UnmodifiableIterator;

public class ebf {
   public static final ebd a = a("empty", new ebb());
   public static final ebc b = a("flowing_water", new ebk.a());
   public static final ebc c = a("water", new ebk.b());
   public static final ebc d = a("flowing_lava", new ebh.a());
   public static final ebc e = a("lava", new ebh.b());

   private static <T extends ebd> T a(String $$0, T $$1) {
      return io.a(jy.d, $$0, $$1);
   }

   static {
      for (ebd $$0 : jy.d) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            ebe $$1 = (ebe)var2.next();
            ebd.c.b($$1);
         }
      }
   }
}
