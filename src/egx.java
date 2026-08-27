import com.google.common.collect.UnmodifiableIterator;

public class egx {
   public static final egv a = a("empty", new egt());
   public static final egu b = a("flowing_water", new ehc.a());
   public static final egu c = a("water", new ehc.b());
   public static final egu d = a("flowing_lava", new egz.a());
   public static final egu e = a("lava", new egz.b());

   private static <T extends egv> T a(String $$0, T $$1) {
      return iv.a(kf.c, $$0, $$1);
   }

   static {
      for (egv $$0 : kf.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            egw $$1 = (egw)var2.next();
            egv.c.b($$1);
         }
      }
   }
}
