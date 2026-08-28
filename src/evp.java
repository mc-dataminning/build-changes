import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class evp extends evu<evp.a> {
   protected evp(ecj $$0) {
      super(dje.b, $$0, new evp.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = jx.e($$0);
      ecb $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(jx.b(iu.a($$0)), jx.b(iu.b($$0)), jx.b(iu.c($$0)));
   }

   protected static final class a extends evr<evp.a> {
      public a(Long2ObjectOpenHashMap<ecb> $$0) {
         super($$0);
      }

      public evp.a a() {
         return new evp.a(this.a.clone());
      }
   }
}
