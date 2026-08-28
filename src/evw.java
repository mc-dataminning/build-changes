import com.google.common.collect.UnmodifiableIterator;

public class evw {
   public static final evu a = a("empty", new evs());
   public static final evt b = a("flowing_water", new ewb.a());
   public static final evt c = a("water", new ewb.b());
   public static final evt d = a("flowing_lava", new evy.a());
   public static final evt e = a("lava", new evy.b());

   private static <T extends evu> T a(String $$0, T $$1) {
      return jr.a(mf.c, $$0, $$1);
   }

   static {
      for (evu $$0 : mf.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            evv $$1 = (evv)var2.next();
            evu.c.b($$1);
         }
      }
   }
}
