import com.google.common.collect.UnmodifiableIterator;

public class eok {
   public static final eoi a = a("empty", new eog());
   public static final eoh b = a("flowing_water", new eop.a());
   public static final eoh c = a("water", new eop.b());
   public static final eoh d = a("flowing_lava", new eom.a());
   public static final eoh e = a("lava", new eom.b());

   private static <T extends eoi> T a(String $$0, T $$1) {
      return jw.a(lq.c, $$0, $$1);
   }

   static {
      for (eoi $$0 : lq.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eoj $$1 = (eoj)var2.next();
            eoi.c.b($$1);
         }
      }
   }
}
