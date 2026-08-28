import com.google.common.collect.UnmodifiableIterator;

public class etq {
   public static final eto a = a("empty", new etm());
   public static final etn b = a("flowing_water", new etv.a());
   public static final etn c = a("water", new etv.b());
   public static final etn d = a("flowing_lava", new ets.a());
   public static final etn e = a("lava", new ets.b());

   private static <T extends eto> T a(String $$0, T $$1) {
      return kd.a(ma.c, $$0, $$1);
   }

   static {
      for (eto $$0 : ma.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            etp $$1 = (etp)var2.next();
            eto.c.b($$1);
         }
      }
   }
}
