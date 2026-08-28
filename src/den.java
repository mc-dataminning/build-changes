import com.mojang.serialization.MapCodec;

public abstract class den extends dex {
   protected static final int a = 2;
   protected static final ewi b = dex.a(6.0, 0.0, 6.0, 10.0, 10.0, 10.0);

   protected den(drz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends den> a();

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return b;
   }

   @Override
   protected dsa a(dsa $$0, je $$1, dsa $$2, dbx $$3, iz $$4, iz $$5) {
      return $$1 == je.a && !this.a($$0, $$3, $$4) ? dez.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsa $$0, dbz $$1, iz $$2) {
      return a($$1, $$2.d(), je.b);
   }
}
