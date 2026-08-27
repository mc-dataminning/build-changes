import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class eei extends een<eei.a> {
   protected eei(dlz $$0) {
      super(cug.b, $$0, new eei.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = iz.e($$0);
      dlr $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(iz.b(hx.a($$0)), iz.b(hx.b($$0)), iz.b(hx.c($$0)));
   }

   protected static final class a extends eek<eei.a> {
      public a(Long2ObjectOpenHashMap<dlr> $$0) {
         super($$0);
      }

      public eei.a a() {
         return new eei.a(this.a.clone());
      }
   }
}
