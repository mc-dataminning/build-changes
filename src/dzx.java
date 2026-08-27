import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class dzx extends eac<dzx.a> {
   protected dzx(dhv $$0) {
      super(cqg.b, $$0, new dzx.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = hz.e($$0);
      dhn $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(hz.b(gw.a($$0)), hz.b(gw.b($$0)), hz.b(gw.c($$0)));
   }

   protected static final class a extends dzz<dzx.a> {
      public a(Long2ObjectOpenHashMap<dhn> $$0) {
         super($$0);
      }

      public dzx.a a() {
         return new dzx.a(this.a.clone());
      }
   }
}
