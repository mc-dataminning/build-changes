import com.mojang.serialization.MapCodec;

public class dtv extends dol {
   public static final MapCodec<dtv> c = b(dtv::new);
   private static final fdo g = dku.b(8.0, 0.0, 15.0);

   @Override
   public MapCodec<dtv> a() {
      return c;
   }

   public dtv(dyl.d $$0) {
      super($$0, jo.b, g, false, 0.1);
   }

   @Override
   protected int a(azs $$0) {
      return dqf.a($$0);
   }

   @Override
   protected dku b() {
      return dkw.pe;
   }

   @Override
   protected boolean h(dym $$0) {
      return dqf.a($$0);
   }
}
