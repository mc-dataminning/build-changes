import com.google.common.collect.UnmodifiableIterator;

public class enx {
   public static final env a = a("empty", new ent());
   public static final enu b = a("flowing_water", new eoc.a());
   public static final enu c = a("water", new eoc.b());
   public static final enu d = a("flowing_lava", new enz.a());
   public static final enu e = a("lava", new enz.b());

   private static <T extends env> T a(String $$0, T $$1) {
      return jv.a(lp.c, $$0, $$1);
   }

   static {
      for (env $$0 : lp.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            enw $$1 = (enw)var2.next();
            env.c.b($$1);
         }
      }
   }
}
