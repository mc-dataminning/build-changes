import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fqc<S extends dcq> implements cut.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = fnx.a($$0.k(), $$0.p());
         int $$4 = fnx.a($$1.k(), $$1.p());
         int $$5 = fny.a($$3);
         int $$6 = fny.a($$4);
         int $$7 = fny.b($$3);
         int $$8 = fny.b($$4);
         return fny.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
