import com.google.common.collect.UnmodifiableIterator;

public class ehs {
   public static final ehq a = a("empty", new eho());
   public static final ehp b = a("flowing_water", new ehx.a());
   public static final ehp c = a("water", new ehx.b());
   public static final ehp d = a("flowing_lava", new ehu.a());
   public static final ehp e = a("lava", new ehu.b());

   private static <T extends ehq> T a(String $$0, T $$1) {
      return ix.a(kh.c, $$0, $$1);
   }

   static {
      for (ehq $$0 : kh.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            ehr $$1 = (ehr)var2.next();
            ehq.c.b($$1);
         }
      }
   }
}
