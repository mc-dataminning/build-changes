import com.google.common.collect.UnmodifiableIterator;

public class ech {
   public static final ecf a = a("empty", new ecd());
   public static final ece b = a("flowing_water", new ecm.a());
   public static final ece c = a("water", new ecm.b());
   public static final ece d = a("flowing_lava", new ecj.a());
   public static final ece e = a("lava", new ecj.b());

   private static <T extends ecf> T a(String $$0, T $$1) {
      return io.a(jy.d, $$0, $$1);
   }

   static {
      for (ecf $$0 : jy.d) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            ecg $$1 = (ecg)var2.next();
            ecf.c.b($$1);
         }
      }
   }
}
