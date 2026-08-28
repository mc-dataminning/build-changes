import com.google.common.collect.UnmodifiableIterator;

public class esz {
   public static final esx a = a("empty", new esv());
   public static final esw b = a("flowing_water", new ete.a());
   public static final esw c = a("water", new ete.b());
   public static final esw d = a("flowing_lava", new etb.a());
   public static final esw e = a("lava", new etb.b());

   private static <T extends esx> T a(String $$0, T $$1) {
      return ke.a(mb.c, $$0, $$1);
   }

   static {
      for (esx $$0 : mb.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            esy $$1 = (esy)var2.next();
            esx.c.b($$1);
         }
      }
   }
}
