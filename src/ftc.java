import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class ftc<S extends dfi> implements cxm.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = fqx.a($$0.i(), $$0.aC_());
         int $$4 = fqx.a($$1.i(), $$1.aC_());
         int $$5 = fqy.a($$3);
         int $$6 = fqy.a($$4);
         int $$7 = fqy.b($$3);
         int $$8 = fqy.b($$4);
         return fqy.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
