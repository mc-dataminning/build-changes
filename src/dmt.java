import com.mojang.serialization.MapCodec;

public class dmt extends dgs {
   public static final MapCodec<dmt> c = b(dmt::new);
   public static final eui e = dde.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<dmt> a() {
      return c;
   }

   public dmt(dqg.d $$0) {
      super($$0, is.a, e, false);
   }

   @Override
   protected dgt c() {
      return (dgt)ddg.oz;
   }
}
