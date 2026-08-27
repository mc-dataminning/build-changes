import com.google.common.collect.UnmodifiableIterator;

public class efa {
   public static final eey a = a("empty", new eew());
   public static final eex b = a("flowing_water", new eff.a());
   public static final eex c = a("water", new eff.b());
   public static final eex d = a("flowing_lava", new efc.a());
   public static final eex e = a("lava", new efc.b());

   private static <T extends eey> T a(String $$0, T $$1) {
      return it.a(kd.c, $$0, $$1);
   }

   static {
      for (eey $$0 : kd.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eez $$1 = (eez)var2.next();
            eey.c.b($$1);
         }
      }
   }
}
