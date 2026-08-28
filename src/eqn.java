import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class eqn extends eqs<eqn.a> {
   protected eqn(dxm $$0) {
      super(dfe.b, $$0, new eqn.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = ki.e($$0);
      dxe $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(ki.b(jg.a($$0)), ki.b(jg.b($$0)), ki.b(jg.c($$0)));
   }

   protected static final class a extends eqp<eqn.a> {
      public a(Long2ObjectOpenHashMap<dxe> $$0) {
         super($$0);
      }

      public eqn.a a() {
         return new eqn.a(this.a.clone());
      }
   }
}
