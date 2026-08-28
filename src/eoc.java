import com.google.common.collect.UnmodifiableIterator;

public class eoc {
   public static final eoa a = a("empty", new eny());
   public static final enz b = a("flowing_water", new eoh.a());
   public static final enz c = a("water", new eoh.b());
   public static final enz d = a("flowing_lava", new eoe.a());
   public static final enz e = a("lava", new eoe.b());

   private static <T extends eoa> T a(String $$0, T $$1) {
      return jw.a(lq.c, $$0, $$1);
   }

   static {
      for (eoa $$0 : lq.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eob $$1 = (eob)var2.next();
            eoa.c.b($$1);
         }
      }
   }
}
