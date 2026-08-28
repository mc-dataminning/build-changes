import com.mojang.serialization.MapCodec;

public class dng extends dnk {
   public static final MapCodec<dng> a = b(dng::new);

   @Override
   public MapCodec<dng> a() {
      return a;
   }

   public dng(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(dsb $$0, dbd $$1, iz $$2) {
      return false;
   }

   @Override
   protected int g(dsb $$0, dbd $$1, iz $$2) {
      return $$1.Q();
   }
}
