import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class etg extends etl<etg.a> {
   protected etg(ead $$0) {
      super(dhr.b, $$0, new etg.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kj.e($$0);
      dzv $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kj.b(jh.a($$0)), kj.b(jh.b($$0)), kj.b(jh.c($$0)));
   }

   protected static final class a extends eti<etg.a> {
      public a(Long2ObjectOpenHashMap<dzv> $$0) {
         super($$0);
      }

      public etg.a a() {
         return new etg.a(this.a.clone());
      }
   }
}
