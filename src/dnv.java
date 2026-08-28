import com.mojang.serialization.MapCodec;

public class dnv extends dip {
   public static final MapCodec<dnv> c = b(dnv::new);
   public static final ewm e = dfb.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dnv> a() {
      return c;
   }

   public dnv(dsd.d $$0) {
      super($$0, je.b, e, false);
   }

   @Override
   protected diq c() {
      return (diq)dfd.oB;
   }
}
