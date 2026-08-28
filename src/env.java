import com.google.common.collect.UnmodifiableIterator;

public class env {
   public static final ent a = a("empty", new enr());
   public static final ens b = a("flowing_water", new eoa.a());
   public static final ens c = a("water", new eoa.b());
   public static final ens d = a("flowing_lava", new enx.a());
   public static final ens e = a("lava", new enx.b());

   private static <T extends ent> T a(String $$0, T $$1) {
      return jv.a(lp.c, $$0, $$1);
   }

   static {
      for (ent $$0 : lp.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            enu $$1 = (enu)var2.next();
            ent.c.b($$1);
         }
      }
   }
}
