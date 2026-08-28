import com.mojang.serialization.MapCodec;

public class dnn extends dfr implements dfl {
   public static final MapCodec<dnn> a = b(dnn::new);
   protected static final float b = 6.0F;
   protected static final exa c = dfi.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dnn> a() {
      return a;
   }

   protected dnn(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return c;
   }

   @Override
   public boolean b(dcj $$0, ja $$1, dsl $$2) {
      return true;
   }

   @Override
   public boolean a(dcg $$0, ayo $$1, ja $$2, dsl $$3) {
      return true;
   }

   @Override
   public void a(aqm $$0, ayo $$1, ja $$2, dsl $$3) {
      dhq $$4 = (dhq)($$3.a(dfk.bu) ? dfk.iI : dfk.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         dhq.a($$0, $$4.o(), $$2, 2);
      }
   }
}
