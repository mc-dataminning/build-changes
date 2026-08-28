import com.google.common.collect.UnmodifiableIterator;

public class erl {
   public static final erj a = a("empty", new erh());
   public static final eri b = a("flowing_water", new erq.a());
   public static final eri c = a("water", new erq.b());
   public static final eri d = a("flowing_lava", new ern.a());
   public static final eri e = a("lava", new ern.b());

   private static <T extends erj> T a(String $$0, T $$1) {
      return kd.a(ly.c, $$0, $$1);
   }

   static {
      for (erj $$0 : ly.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            erk $$1 = (erk)var2.next();
            erj.c.b($$1);
         }
      }
   }
}
