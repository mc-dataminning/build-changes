import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fpj<S extends dck> implements cun.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = fne.a($$0.k(), $$0.p());
         int $$4 = fne.a($$1.k(), $$1.p());
         int $$5 = fnf.a($$3);
         int $$6 = fnf.a($$4);
         int $$7 = fnf.b($$3);
         int $$8 = fnf.b($$4);
         return fnf.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
