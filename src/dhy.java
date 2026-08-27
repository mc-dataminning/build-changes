import com.mojang.serialization.MapCodec;

public class dhy extends dct {
   public static final MapCodec<dhy> c = b(dhy::new);
   public static final epo e = czf.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dhy> a() {
      return c;
   }

   public dhy(dmd.d $$0) {
      super($$0, ih.b, e, false);
   }

   @Override
   protected dcu c() {
      return (dcu)czh.oB;
   }
}
