import com.mojang.serialization.MapCodec;

public class dhd extends czf {
   public static final MapCodec<dhd> a = b(dhd::new);
   private static final double b = 5.0;
   private static final epo c = czf.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dhd> a() {
      return a;
   }

   protected dhd(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected dfk b_(dme $$0) {
      return dfk.a;
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return c;
   }

   @Override
   protected float d(dme $$0, cvk $$1, ib $$2) {
      return 1.0F;
   }
}
