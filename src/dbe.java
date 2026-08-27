import com.mojang.serialization.MapCodec;

public class dbe extends czo {
   public static final MapCodec<dbe> a = b(dbe::new);
   protected static final float b = 6.0F;
   protected static final epo c = czf.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dbe> a() {
      return a;
   }

   protected dbe(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected epo a(dme $$0, cvk $$1, ib $$2, epa $$3) {
      return c;
   }

   @Override
   protected boolean b(dme $$0, cvk $$1, ib $$2) {
      return $$0.a(aue.ce);
   }
}
