import com.mojang.serialization.MapCodec;

public class dhh extends dcc {
   public static final MapCodec<dhh> c = b(dhh::new);
   public static final eol e = cyo.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dhh> a() {
      return c;
   }

   public dhh(dle.d $$0) {
      super($$0, ie.b, e, false);
   }

   @Override
   protected dcd c() {
      return (dcd)cyq.oB;
   }
}
