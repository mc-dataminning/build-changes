import com.mojang.serialization.MapCodec;

public class dtz extends dnu {
   public static final MapCodec<dtz> c = b(dtz::new);
   private static final fcr e = dke.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dtz> a() {
      return c;
   }

   public dtz(dxp.d $$0) {
      super($$0, jn.a, e, false);
   }

   @Override
   protected dnv c() {
      return (dnv)dkg.pb;
   }
}
