import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class etf extends etk<etf.a> {
   protected etf(eac $$0) {
      super(dhq.b, $$0, new etf.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kj.e($$0);
      dzu $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kj.b(jh.a($$0)), kj.b(jh.b($$0)), kj.b(jh.c($$0)));
   }

   protected static final class a extends eth<etf.a> {
      public a(Long2ObjectOpenHashMap<dzu> $$0) {
         super($$0);
      }

      public etf.a a() {
         return new etf.a(this.a.clone());
      }
   }
}
