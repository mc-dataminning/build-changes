import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fqj<S extends dcx> implements cva.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = foe.a($$0.k(), $$0.p());
         int $$4 = foe.a($$1.k(), $$1.p());
         int $$5 = fof.a($$3);
         int $$6 = fof.a($$4);
         int $$7 = fof.b($$3);
         int $$8 = fof.b($$4);
         return fof.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
