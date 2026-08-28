import com.google.common.collect.UnmodifiableIterator;

public class esy {
   public static final esw a = a("empty", new esu());
   public static final esv b = a("flowing_water", new etd.a());
   public static final esv c = a("water", new etd.b());
   public static final esv d = a("flowing_lava", new eta.a());
   public static final esv e = a("lava", new eta.b());

   private static <T extends esw> T a(String $$0, T $$1) {
      return ke.a(mb.c, $$0, $$1);
   }

   static {
      for (esw $$0 : mb.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            esx $$1 = (esx)var2.next();
            esw.c.b($$1);
         }
      }
   }
}
