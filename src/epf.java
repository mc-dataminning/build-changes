import com.google.common.collect.UnmodifiableIterator;

public class epf {
   public static final epd a = a("empty", new epb());
   public static final epc b = a("flowing_water", new epk.a());
   public static final epc c = a("water", new epk.b());
   public static final epc d = a("flowing_lava", new eph.a());
   public static final epc e = a("lava", new eph.b());

   private static <T extends epd> T a(String $$0, T $$1) {
      return jz.a(lt.c, $$0, $$1);
   }

   static {
      for (epd $$0 : lt.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            epe $$1 = (epe)var2.next();
            epd.c.b($$1);
         }
      }
   }
}
