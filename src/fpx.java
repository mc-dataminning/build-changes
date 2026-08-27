import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class fpx<S extends dcl> implements cuo.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = fns.a($$0.k(), $$0.p());
         int $$4 = fns.a($$1.k(), $$1.p());
         int $$5 = fnt.a($$3);
         int $$6 = fnt.a($$4);
         int $$7 = fnt.b($$3);
         int $$8 = fnt.b($$4);
         return fnt.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
