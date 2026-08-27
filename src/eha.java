import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class eha extends ehf<eha.a> {
   protected eha(doo $$0) {
      super(cwn.b, $$0, new eha.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = jd.e($$0);
      dog $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(jd.b(ib.a($$0)), jd.b(ib.b($$0)), jd.b(ib.c($$0)));
   }

   protected static final class a extends ehc<eha.a> {
      public a(Long2ObjectOpenHashMap<dog> $$0) {
         super($$0);
      }

      public eha.a a() {
         return new eha.a(this.a.clone());
      }
   }
}
