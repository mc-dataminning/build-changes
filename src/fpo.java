import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fpo<S extends dcm> implements cup.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = fnj.a($$0.k(), $$0.p());
         int $$4 = fnj.a($$1.k(), $$1.p());
         int $$5 = fnk.a($$3);
         int $$6 = fnk.a($$4);
         int $$7 = fnk.b($$3);
         int $$8 = fnk.b($$4);
         return fnk.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
