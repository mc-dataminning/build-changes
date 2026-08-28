import com.google.common.collect.UnmodifiableIterator;

public class eqc {
   public static final eqa a = a("empty", new epy());
   public static final epz b = a("flowing_water", new eqh.a());
   public static final epz c = a("water", new eqh.b());
   public static final epz d = a("flowing_lava", new eqe.a());
   public static final epz e = a("lava", new eqe.b());

   private static <T extends eqa> T a(String $$0, T $$1) {
      return ka.a(lu.c, $$0, $$1);
   }

   static {
      for (eqa $$0 : lu.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eqb $$1 = (eqb)var2.next();
            eqa.c.b($$1);
         }
      }
   }
}
