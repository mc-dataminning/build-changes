import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class eqx extends erc<eqx.a> {
   protected eqx(dxw $$0) {
      super(dfo.b, $$0, new eqx.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kj.e($$0);
      dxo $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kj.b(jh.a($$0)), kj.b(jh.b($$0)), kj.b(jh.c($$0)));
   }

   protected static final class a extends eqz<eqx.a> {
      public a(Long2ObjectOpenHashMap<dxo> $$0) {
         super($$0);
      }

      public eqx.a a() {
         return new eqx.a(this.a.clone());
      }
   }
}
