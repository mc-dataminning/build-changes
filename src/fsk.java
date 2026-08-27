import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fsk<S extends der> implements cwz.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = fqf.a($$0.k(), $$0.p());
         int $$4 = fqf.a($$1.k(), $$1.p());
         int $$5 = fqg.a($$3);
         int $$6 = fqg.a($$4);
         int $$7 = fqg.b($$3);
         int $$8 = fqg.b($$4);
         return fqg.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
