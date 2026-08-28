import com.mojang.serialization.MapCodec;

public class dmu extends dfi {
   public static final MapCodec<dmu> a = b(dmu::new);
   protected static final exa b = dfi.a(0.0, 0.0, 0.0, 16.0, 14.0, 16.0);
   private static final int c = 20;

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   public dmu(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected exa b(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b;
   }

   @Override
   protected exa b_(dsl $$0, dbm $$1, ja $$2) {
      return ewx.b();
   }

   @Override
   protected exa c(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return ewx.b();
   }

   @Override
   protected void a(dsl $$0, aqm $$1, ja $$2, ayo $$3) {
      dfo.b($$1, $$2.c(), $$0);
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      if ($$1 == jf.b && $$2.a(dfk.G)) {
         $$3.a($$4, this, 20);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void b(dsl $$0, dcg $$1, ja $$2, dsl $$3, boolean $$4) {
      $$1.a($$2, this, 20);
   }

   @Override
   protected boolean a(dsl $$0, eoy $$1) {
      return false;
   }

   @Override
   protected float d(dsl $$0, dbm $$1, ja $$2) {
      return 0.2F;
   }
}
