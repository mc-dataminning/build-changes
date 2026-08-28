import com.mojang.serialization.MapCodec;

public class dsn extends dkl {
   public static final MapCodec<dsn> a = b(dsn::new);
   private static final double b = 5.0;
   private static final fcr c = dkl.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dsn> a() {
      return a;
   }

   protected dsn(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected dqu a_(dxu $$0) {
      return dqu.a;
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return c;
   }

   @Override
   protected float c(dxu $$0, dgm $$1, jh $$2) {
      return 1.0F;
   }
}
