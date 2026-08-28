import com.mojang.serialization.MapCodec;

public class dlt extends dfr {
   public static final MapCodec<dlt> a = b(dlt::new);
   protected static final float b = 6.0F;
   protected static final exa c = dfi.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dlt> a() {
      return a;
   }

   protected dlt(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return c;
   }

   @Override
   protected boolean b(dsl $$0, dbm $$1, ja $$2) {
      return $$0.a(avw.aL) || $$0.a(dfk.dX) || super.b($$0, $$1, $$2);
   }
}
