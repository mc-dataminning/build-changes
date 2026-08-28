import com.mojang.serialization.MapCodec;

public class dek extends dfr implements dfl {
   public static final MapCodec<dek> a = b(dek::new);
   private static final exa b = ewx.a(dfi.a(0.0, 8.0, 0.0, 16.0, 16.0, 16.0), dfi.a(6.0, 0.0, 6.0, 10.0, 8.0, 10.0));

   @Override
   public MapCodec<dek> a() {
      return a;
   }

   protected dek(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b;
   }

   @Override
   protected boolean b(dsl $$0, dbm $$1, ja $$2) {
      return $$0.a(dfk.dR) || super.b($$0, $$1, $$2);
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return $$0.b_($$1.c()).c();
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return (double)$$0.z.i() < 0.45;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      dsa.e.a($$0, $$0.l().g(), $$2, $$3, $$1);
   }
}
