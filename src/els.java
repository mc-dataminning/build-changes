import com.google.common.collect.UnmodifiableIterator;

public class els {
   public static final elq a = a("empty", new elo());
   public static final elp b = a("flowing_water", new elx.a());
   public static final elp c = a("water", new elx.b());
   public static final elp d = a("flowing_lava", new elu.a());
   public static final elp e = a("lava", new elu.b());

   private static <T extends elq> T a(String $$0, T $$1) {
      return ji.a(lc.c, $$0, $$1);
   }

   static {
      for (elq $$0 : lc.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            elr $$1 = (elr)var2.next();
            elq.c.b($$1);
         }
      }
   }
}
