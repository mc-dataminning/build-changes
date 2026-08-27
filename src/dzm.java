import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class dzm extends dzr<dzm.a> {
   protected dzm(dhk $$0) {
      super(cpv.b, $$0, new dzm.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = hx.e($$0);
      dhc $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(hx.b(gu.a($$0)), hx.b(gu.b($$0)), hx.b(gu.c($$0)));
   }

   protected static final class a extends dzo<dzm.a> {
      public a(Long2ObjectOpenHashMap<dhc> $$0) {
         super($$0);
      }

      public dzm.a a() {
         return new dzm.a(this.a.clone());
      }
   }
}
