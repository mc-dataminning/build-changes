import com.google.common.collect.UnmodifiableIterator;

public class eah {
   public static final eaf a = a("empty", new ead());
   public static final eae b = a("flowing_water", new eam.a());
   public static final eae c = a("water", new eam.b());
   public static final eae d = a("flowing_lava", new eaj.a());
   public static final eae e = a("lava", new eaj.b());

   private static <T extends eaf> T a(String $$0, T $$1) {
      return hq.a(jb.d, $$0, $$1);
   }

   static {
      for (eaf $$0 : jb.d) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eag $$1 = (eag)var2.next();
            eaf.c.b($$1);
         }
      }
   }
}
