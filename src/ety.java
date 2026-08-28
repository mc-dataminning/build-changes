import com.google.common.collect.UnmodifiableIterator;

public class ety {
   public static final etw a = a("empty", new etu());
   public static final etv b = a("flowing_water", new eud.a());
   public static final etv c = a("water", new eud.b());
   public static final etv d = a("flowing_lava", new eua.a());
   public static final etv e = a("lava", new eua.b());

   private static <T extends etw> T a(String $$0, T $$1) {
      return kd.a(ma.c, $$0, $$1);
   }

   static {
      for (etw $$0 : ma.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            etx $$1 = (etx)var2.next();
            etw.c.b($$1);
         }
      }
   }
}
