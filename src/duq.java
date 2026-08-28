import com.mojang.serialization.MapCodec;

public class duq extends dol {
   public static final MapCodec<duq> c = b(duq::new);
   private static final fdo g = dku.b(8.0, 9.0, 16.0);

   @Override
   public MapCodec<duq> a() {
      return c;
   }

   public duq(dyl.d $$0) {
      super($$0, jo.a, g, false, 0.1);
   }

   @Override
   protected int a(azs $$0) {
      return dqf.a($$0);
   }

   @Override
   protected dku b() {
      return dkw.pc;
   }

   @Override
   protected boolean h(dym $$0) {
      return dqf.a($$0);
   }
}
