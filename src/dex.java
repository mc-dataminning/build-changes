import com.mojang.serialization.MapCodec;

public abstract class dex extends dfh {
   protected static final int a = 2;
   protected static final ewy b = dfh.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected dex(dsj.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dex> a();

   @Override
   protected ewy a(dsk $$0, dbl $$1, ja $$2, ewk $$3) {
      return b;
   }

   @Override
   protected dsk a(dsk $$0, jf $$1, dsk $$2, dcg $$3, ja $$4, ja $$5) {
      return $$1 == jf.a && !this.a($$0, $$3, $$4) ? dfj.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsk $$0, dci $$1, ja $$2) {
      return a($$1, $$2.d(), jf.b);
   }
}
