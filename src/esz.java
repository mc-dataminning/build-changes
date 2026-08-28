import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class esz extends ete<esz.a> {
   protected esz(dzw $$0) {
      super(dhi.b, $$0, new esz.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kj.e($$0);
      dzo $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kj.b(jh.a($$0)), kj.b(jh.b($$0)), kj.b(jh.c($$0)));
   }

   protected static final class a extends etb<esz.a> {
      public a(Long2ObjectOpenHashMap<dzo> $$0) {
         super($$0);
      }

      public esz.a a() {
         return new esz.a(this.a.clone());
      }
   }
}
