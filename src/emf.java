import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class emf extends emk<emf.a> {
   protected emf(dtm $$0) {
      super(dbi.b, $$0, new emf.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = jq.e($$0);
      dte $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(jq.b(io.a($$0)), jq.b(io.b($$0)), jq.b(io.c($$0)));
   }

   protected static final class a extends emh<emf.a> {
      public a(Long2ObjectOpenHashMap<dte> $$0) {
         super($$0);
      }

      public emf.a a() {
         return new emf.a(this.a.clone());
      }
   }
}
