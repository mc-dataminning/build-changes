import com.mojang.serialization.MapCodec;

public class dng extends dfh {
   public static final MapCodec<dng> a = b(dng::new);
   private static final double b = 5.0;
   private static final ewy c = dfh.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   protected dng(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected dln a_(dsk $$0) {
      return dln.a;
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return c;
   }

   @Override
   protected float d(dsk $$0, dbl $$1, ja $$2) {
      return 1.0F;
   }
}
