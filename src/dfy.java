import com.mojang.serialization.MapCodec;

public class dfy extends dfh {
   public static final MapCodec<dfy> a = b(dfy::new);
   protected static final ewy b = dfh.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dfy> a() {
      return a;
   }

   public dfy(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return !$$0.a($$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return !$$1.u($$2.d());
   }
}
