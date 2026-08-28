import com.google.common.collect.UnmodifiableIterator;

public class epd {
   public static final epb a = a("empty", new eoz());
   public static final epa b = a("flowing_water", new epi.a());
   public static final epa c = a("water", new epi.b());
   public static final epa d = a("flowing_lava", new epf.a());
   public static final epa e = a("lava", new epf.b());

   private static <T extends epb> T a(String $$0, T $$1) {
      return jz.a(lt.c, $$0, $$1);
   }

   static {
      for (epb $$0 : lt.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            epc $$1 = (epc)var2.next();
            epb.c.b($$1);
         }
      }
   }
}
