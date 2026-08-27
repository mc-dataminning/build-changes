import com.mojang.serialization.MapCodec;

public class dib extends dcc {
   public static final MapCodec<dib> c = b(dib::new);
   public static final eol e = cyo.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dib> a() {
      return c;
   }

   public dib(dle.d $$0) {
      super($$0, ie.a, e, false);
   }

   @Override
   protected dcd c() {
      return (dcd)cyq.oz;
   }
}
