import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ewx extends exc<ewx.a> {
   protected ewx(edo $$0) {
      super(dkg.b, $$0, new ewx.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = jy.e($$0);
      edg $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(jy.b(iv.a($$0)), jy.b(iv.b($$0)), jy.b(iv.c($$0)));
   }

   protected static final class a extends ewz<ewx.a> {
      public a(Long2ObjectOpenHashMap<edg> $$0) {
         super($$0);
      }

      public ewx.a a() {
         return new ewx.a(this.a.clone());
      }
   }
}
