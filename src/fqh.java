import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fqh<S extends dcv> implements cuy.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = foc.a($$0.k(), $$0.p());
         int $$4 = foc.a($$1.k(), $$1.p());
         int $$5 = fod.a($$3);
         int $$6 = fod.a($$4);
         int $$7 = fod.b($$3);
         int $$8 = fod.b($$4);
         return fod.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
