import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fqd<S extends dcz> implements cvh.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = fny.a($$0.k(), $$0.p());
         int $$4 = fny.a($$1.k(), $$1.p());
         int $$5 = fnz.a($$3);
         int $$6 = fnz.a($$4);
         int $$7 = fnz.b($$3);
         int $$8 = fnz.b($$4);
         return fnz.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
