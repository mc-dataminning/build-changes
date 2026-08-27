import com.mojang.serialization.MapCodec;

public class cyo extends cyp {
   public static final MapCodec<cyo> a = b(cyo::new);
   protected static final float b = 6.0F;
   protected static final epo c = czf.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<cyo> a() {
      return a;
   }

   protected cyo(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return c;
   }
}
