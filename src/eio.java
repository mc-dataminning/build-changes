import com.google.common.collect.UnmodifiableIterator;

public class eio {
   public static final eim a = a("empty", new eik());
   public static final eil b = a("flowing_water", new eit.a());
   public static final eil c = a("water", new eit.b());
   public static final eil d = a("flowing_lava", new eiq.a());
   public static final eil e = a("lava", new eiq.b());

   private static <T extends eim> T a(String $$0, T $$1) {
      return iy.a(ki.c, $$0, $$1);
   }

   static {
      for (eim $$0 : ki.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            ein $$1 = (ein)var2.next();
            eim.c.b($$1);
         }
      }
   }
}
