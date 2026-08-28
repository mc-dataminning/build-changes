import com.mojang.serialization.MapCodec;

public class dfs extends dfb {
   public static final MapCodec<dfs> a = b(dfs::new);
   protected static final ewm b = dfb.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dfs> a() {
      return a;
   }

   public dfs(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return b;
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      return !$$0.a($$3, $$4) ? dfd.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dse $$0, dcd $$1, iz $$2) {
      return !$$1.u($$2.d());
   }
}
