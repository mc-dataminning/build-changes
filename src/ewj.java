import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ewj extends ewo<ewj.a> {
   protected ewj(edd $$0) {
      super(djv.b, $$0, new ewj.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = jy.e($$0);
      ecv $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(jy.b(iv.a($$0)), jy.b(iv.b($$0)), jy.b(iv.c($$0)));
   }

   protected static final class a extends ewl<ewj.a> {
      public a(Long2ObjectOpenHashMap<ecv> $$0) {
         super($$0);
      }

      public ewj.a a() {
         return new ewj.a(this.a.clone());
      }
   }
}
