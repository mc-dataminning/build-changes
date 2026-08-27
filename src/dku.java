import com.mojang.serialization.MapCodec;

public class dku extends dcv {
   public static final MapCodec<dku> a = b(dku::new);
   private static final double b = 5.0;
   private static final ety c = dcv.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dku> a() {
      return a;
   }

   protected dku(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected djb b_(dpy $$0) {
      return djb.a;
   }

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
      return c;
   }

   @Override
   protected float d(dpy $$0, cza $$1, im $$2) {
      return 1.0F;
   }
}
