import com.google.common.collect.UnmodifiableIterator;

public class eoz {
   public static final eox a = a("empty", new eov());
   public static final eow b = a("flowing_water", new epe.a());
   public static final eow c = a("water", new epe.b());
   public static final eow d = a("flowing_lava", new epb.a());
   public static final eow e = a("lava", new epb.b());

   private static <T extends eox> T a(String $$0, T $$1) {
      return jz.a(lt.c, $$0, $$1);
   }

   static {
      for (eox $$0 : lt.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eoy $$1 = (eoy)var2.next();
            eox.c.b($$1);
         }
      }
   }
}
