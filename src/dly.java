import com.mojang.serialization.MapCodec;

public class dly extends dgs {
   public static final MapCodec<dly> c = b(dly::new);
   public static final eui e = dde.a(4.0, 0.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<dly> a() {
      return c;
   }

   public dly(dqg.d $$0) {
      super($$0, is.b, e, false);
   }

   @Override
   protected dgt c() {
      return (dgt)ddg.oB;
   }
}
