import com.mojang.serialization.MapCodec;

public class dkn extends dfr {
   public static final MapCodec<dkn> a = b(dkn::new);
   protected static final exa b = dfi.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dkn> a() {
      return a;
   }

   public dkn(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b;
   }

   @Override
   protected boolean b(dsl $$0, dbm $$1, ja $$2) {
      return $$0.a(avw.aL) || $$0.a(dfk.dX) || super.b($$0, $$1, $$2);
   }
}
