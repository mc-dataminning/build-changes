import com.mojang.serialization.MapCodec;

public class dit extends dct {
   public static final MapCodec<dit> c = b(dit::new);
   public static final epo e = czf.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dit> a() {
      return c;
   }

   public dit(dmd.d $$0) {
      super($$0, ih.a, e, false);
   }

   @Override
   protected dcu c() {
      return (dcu)czh.oz;
   }
}
