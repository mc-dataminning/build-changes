import com.google.common.collect.UnmodifiableIterator;

public class ees {
   public static final eeq a = a("empty", new eeo());
   public static final eep b = a("flowing_water", new eex.a());
   public static final eep c = a("water", new eex.b());
   public static final eep d = a("flowing_lava", new eeu.a());
   public static final eep e = a("lava", new eeu.b());

   private static <T extends eeq> T a(String $$0, T $$1) {
      return it.a(kd.c, $$0, $$1);
   }

   static {
      for (eeq $$0 : kd.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eer $$1 = (eer)var2.next();
            eeq.c.b($$1);
         }
      }
   }
}
