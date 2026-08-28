import com.mojang.serialization.MapCodec;

public class dfz extends dfi {
   public static final MapCodec<dfz> a = b(dfz::new);
   protected static final exa b = dfi.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dfz> a() {
      return a;
   }

   public dfz(dsk.d $$0) {
      super($$0);
   }

   @Override
   protected exa a(dsl $$0, dbm $$1, ja $$2, ewm $$3) {
      return b;
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      return !$$0.a($$3, $$4) ? dfk.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsl $$0, dcj $$1, ja $$2) {
      return !$$1.u($$2.d());
   }
}
