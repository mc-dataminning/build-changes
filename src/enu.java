import com.google.common.collect.UnmodifiableIterator;

public class enu {
   public static final ens a = a("empty", new enq());
   public static final enr b = a("flowing_water", new enz.a());
   public static final enr c = a("water", new enz.b());
   public static final enr d = a("flowing_lava", new enw.a());
   public static final enr e = a("lava", new enw.b());

   private static <T extends ens> T a(String $$0, T $$1) {
      return jv.a(lp.c, $$0, $$1);
   }

   static {
      for (ens $$0 : lp.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            ent $$1 = (ent)var2.next();
            ens.c.b($$1);
         }
      }
   }
}
