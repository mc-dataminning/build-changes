import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class emd extends emi<emd.a> {
   protected emd(dtk $$0) {
      super(dbg.b, $$0, new emd.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = jq.e($$0);
      dtc $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(jq.b(io.a($$0)), jq.b(io.b($$0)), jq.b(io.c($$0)));
   }

   protected static final class a extends emf<emd.a> {
      public a(Long2ObjectOpenHashMap<dtc> $$0) {
         super($$0);
      }

      public emd.a a() {
         return new emd.a(this.a.clone());
      }
   }
}
