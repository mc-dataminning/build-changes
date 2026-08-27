import com.google.common.collect.UnmodifiableIterator;

public class emv {
   public static final emt a = a("empty", new emr());
   public static final ems b = a("flowing_water", new ena.a());
   public static final ems c = a("water", new ena.b());
   public static final ems d = a("flowing_lava", new emx.a());
   public static final ems e = a("lava", new emx.b());

   private static <T extends emt> T a(String $$0, T $$1) {
      return jk.a(le.c, $$0, $$1);
   }

   static {
      for (emt $$0 : le.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            emu $$1 = (emu)var2.next();
            emt.c.b($$1);
         }
      }
   }
}
