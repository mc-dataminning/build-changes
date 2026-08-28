import com.mojang.serialization.MapCodec;

public class dfo extends dex {
   public static final MapCodec<dfo> a = b(dfo::new);
   protected static final ewi b = dex.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dfo> a() {
      return a;
   }

   public dfo(drz.d $$0) {
      super($$0);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return b;
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return !$$0.a($$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return !$$1.u($$2.d());
   }
}
