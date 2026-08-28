import com.google.common.collect.UnmodifiableIterator;

public class etb {
   public static final esz a = a("empty", new esx());
   public static final esy b = a("flowing_water", new etg.a());
   public static final esy c = a("water", new etg.b());
   public static final esy d = a("flowing_lava", new etd.a());
   public static final esy e = a("lava", new etd.b());

   private static <T extends esz> T a(String $$0, T $$1) {
      return ke.a(mb.c, $$0, $$1);
   }

   static {
      for (esz $$0 : mb.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eta $$1 = (eta)var2.next();
            esz.c.b($$1);
         }
      }
   }
}
