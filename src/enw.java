import com.google.common.collect.UnmodifiableIterator;

public class enw {
   public static final enu a = a("empty", new ens());
   public static final ent b = a("flowing_water", new eob.a());
   public static final ent c = a("water", new eob.b());
   public static final ent d = a("flowing_lava", new eny.a());
   public static final ent e = a("lava", new eny.b());

   private static <T extends enu> T a(String $$0, T $$1) {
      return jv.a(lp.c, $$0, $$1);
   }

   static {
      for (enu $$0 : lp.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            env $$1 = (env)var2.next();
            enu.c.b($$1);
         }
      }
   }
}
