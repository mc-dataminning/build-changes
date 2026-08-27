import com.google.common.collect.UnmodifiableIterator;

public class eel {
   public static final eej a = a("empty", new eeh());
   public static final eei b = a("flowing_water", new eeq.a());
   public static final eei c = a("water", new eeq.b());
   public static final eei d = a("flowing_lava", new een.a());
   public static final eei e = a("lava", new een.b());

   private static <T extends eej> T a(String $$0, T $$1) {
      return it.a(kd.c, $$0, $$1);
   }

   static {
      for (eej $$0 : kd.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eek $$1 = (eek)var2.next();
            eej.c.b($$1);
         }
      }
   }
}
