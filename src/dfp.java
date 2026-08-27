import com.mojang.serialization.MapCodec;

public class dfp extends czo {
   public static final MapCodec<dfp> a = b(dfp::new);
   protected static final float b = 6.0F;
   protected static final epo c = czf.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dfp> a() {
      return a;
   }

   protected dfp(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return c;
   }

   @Override
   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      return $$0.a(aue.aK) || $$0.a(czh.dX) || super.b($$0, $$1, $$2);
   }
}
