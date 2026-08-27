import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ecb extends ecg<ecb.a> {
   protected ecb(djs $$0) {
      super(csj.b, $$0, new ecb.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = iu.e($$0);
      djk $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(iu.b(ht.a($$0)), iu.b(ht.b($$0)), iu.b(ht.c($$0)));
   }

   protected static final class a extends ecd<ecb.a> {
      public a(Long2ObjectOpenHashMap<djk> $$0) {
         super($$0);
      }

      public ecb.a a() {
         return new ecb.a(this.a.clone());
      }
   }
}
