import com.google.common.collect.UnmodifiableIterator;

public class eqq {
   public static final eqo a = a("empty", new eqm());
   public static final eqn b = a("flowing_water", new eqv.a());
   public static final eqn c = a("water", new eqv.b());
   public static final eqn d = a("flowing_lava", new eqs.a());
   public static final eqn e = a("lava", new eqs.b());

   private static <T extends eqo> T a(String $$0, T $$1) {
      return ka.a(lu.c, $$0, $$1);
   }

   static {
      for (eqo $$0 : lu.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            eqp $$1 = (eqp)var2.next();
            eqo.c.b($$1);
         }
      }
   }
}
