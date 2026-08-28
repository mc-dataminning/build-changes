import com.google.common.collect.UnmodifiableIterator;

public class etx {
   public static final etv a = a("empty", new ett());
   public static final etu b = a("flowing_water", new euc.a());
   public static final etu c = a("water", new euc.b());
   public static final etu d = a("flowing_lava", new etz.a());
   public static final etu e = a("lava", new etz.b());

   private static <T extends etv> T a(String $$0, T $$1) {
      return kd.a(ma.c, $$0, $$1);
   }

   static {
      for (etv $$0 : ma.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            etw $$1 = (etw)var2.next();
            etv.c.b($$1);
         }
      }
   }
}
