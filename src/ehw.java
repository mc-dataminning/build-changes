import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ehw extends eib<ehw.a> {
   protected ehw(dpj $$0) {
      super(cxi.b, $$0, new ehw.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = je.e($$0);
      dpb $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(je.b(ib.a($$0)), je.b(ib.b($$0)), je.b(ib.c($$0)));
   }

   protected static final class a extends ehy<ehw.a> {
      public a(Long2ObjectOpenHashMap<dpb> $$0) {
         super($$0);
      }

      public ehw.a a() {
         return new ehw.a(this.a.clone());
      }
   }
}
