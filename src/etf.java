import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class etf extends etk<etf.a> {
   protected etf(dzz $$0) {
      super(dhi.b, $$0, new etf.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kk.e($$0);
      dzr $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kk.b(ji.a($$0)), kk.b(ji.b($$0)), kk.b(ji.c($$0)));
   }

   protected static final class a extends eth<etf.a> {
      public a(Long2ObjectOpenHashMap<dzr> $$0) {
         super($$0);
      }

      public etf.a a() {
         return new etf.a(this.a.clone());
      }
   }
}
