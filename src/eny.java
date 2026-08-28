import com.google.common.collect.UnmodifiableIterator;

public class eny {
   public static final enw a = a("empty", new enu());
   public static final env b = a("flowing_water", new eod.a());
   public static final env c = a("water", new eod.b());
   public static final env d = a("flowing_lava", new eoa.a());
   public static final env e = a("lava", new eoa.b());

   private static <T extends enw> T a(String $$0, T $$1) {
      return jv.a(lp.c, $$0, $$1);
   }

   static {
      for (enw $$0 : lp.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            enx $$1 = (enx)var2.next();
            enw.c.b($$1);
         }
      }
   }
}
