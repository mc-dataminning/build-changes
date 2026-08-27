import com.google.common.collect.UnmodifiableIterator;

public class eer {
   public static final eep a = a("empty", new een());
   public static final eeo b = a("flowing_water", new eew.a());
   public static final eeo c = a("water", new eew.b());
   public static final eeo d = a("flowing_lava", new eet.a());
   public static final eeo e = a("lava", new eet.b());

   private static <T extends eep> T a(String $$0, T $$1) {
      return it.a(kd.c, $$0, $$1);
   }

   static {
      for (eep $$0 : kd.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eeq $$1 = (eeq)var2.next();
            eep.c.b($$1);
         }
      }
   }
}
