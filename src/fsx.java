import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fsx<S extends dfd> implements cxh.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = fqs.a($$0.k(), $$0.p());
         int $$4 = fqs.a($$1.k(), $$1.p());
         int $$5 = fqt.a($$3);
         int $$6 = fqt.a($$4);
         int $$7 = fqt.b($$3);
         int $$8 = fqt.b($$4);
         return fqt.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
