import it.unimi.dsi.fastutil.ints.Int2IntFunction;

public class flx<S extends czn> implements crq.b<S, Int2IntFunction> {
   public Int2IntFunction a(S $$0, S $$1) {
      return $$2 -> {
         int $$3 = fjv.a($$0.k(), $$0.p());
         int $$4 = fjv.a($$1.k(), $$1.p());
         int $$5 = fjw.a($$3);
         int $$6 = fjw.a($$4);
         int $$7 = fjw.b($$3);
         int $$8 = fjw.b($$4);
         return fjw.a(Math.max($$5, $$6), Math.max($$7, $$8));
      };
   }

   public Int2IntFunction a(S $$0) {
      return $$0x -> $$0x;
   }

   public Int2IntFunction a() {
      return $$0 -> $$0;
   }
}
