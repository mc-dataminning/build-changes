import com.google.common.collect.UnmodifiableIterator;

public class egq {
   public static final ego a = a("empty", new egm());
   public static final egn b = a("flowing_water", new egv.a());
   public static final egn c = a("water", new egv.b());
   public static final egn d = a("flowing_lava", new egs.a());
   public static final egn e = a("lava", new egs.b());

   private static <T extends ego> T a(String $$0, T $$1) {
      return iv.a(kf.c, $$0, $$1);
   }

   static {
      for (ego $$0 : kf.c) {
         UnmodifiableIterator var2 = $$0.f().a().iterator();

         while (var2.hasNext()) {
            egp $$1 = (egp)var2.next();
            ego.c.b($$1);
         }
      }
   }
}
