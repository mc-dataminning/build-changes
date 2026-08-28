import com.mojang.serialization.MapCodec;

public class dfr extends dfa {
   public static final MapCodec<dfr> a = b(dfr::new);
   protected static final ewl b = dfa.a(0.0, 0.0, 0.0, 16.0, 1.0, 16.0);

   @Override
   public MapCodec<? extends dfr> a() {
      return a;
   }

   public dfr(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return b;
   }

   @Override
   protected dsd a(dsd $$0, je $$1, dsd $$2, dca $$3, iz $$4, iz $$5) {
      return !$$0.a($$3, $$4) ? dfc.a.o() : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected boolean a(dsd $$0, dcc $$1, iz $$2) {
      return !$$1.u($$2.d());
   }
}
