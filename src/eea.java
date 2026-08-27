import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class eea extends eef<eea.a> {
   protected eea(dlr $$0) {
      super(cty.b, $$0, new eea.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = iz.e($$0);
      dlj $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(iz.b(hx.a($$0)), iz.b(hx.b($$0)), iz.b(hx.c($$0)));
   }

   protected static final class a extends eec<eea.a> {
      public a(Long2ObjectOpenHashMap<dlj> $$0) {
         super($$0);
      }

      public eea.a a() {
         return new eea.a(this.a.clone());
      }
   }
}
