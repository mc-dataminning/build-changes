import com.google.common.collect.UnmodifiableIterator;

public class emx {
   public static final emv a = a("empty", new emt());
   public static final emu b = a("flowing_water", new enc.a());
   public static final emu c = a("water", new enc.b());
   public static final emu d = a("flowing_lava", new emz.a());
   public static final emu e = a("lava", new emz.b());

   private static <T extends emv> T a(String $$0, T $$1) {
      return jk.a(le.c, $$0, $$1);
   }

   static {
      for (emv $$0 : le.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            emw $$1 = (emw)var2.next();
            emv.c.b($$1);
         }
      }
   }
}
