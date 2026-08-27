import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ehy extends eid<ehy.a> {
   protected ehy(dpl $$0) {
      super(cxk.b, $$0, new ehy.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = je.e($$0);
      dpd $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(je.b(ib.a($$0)), je.b(ib.b($$0)), je.b(ib.c($$0)));
   }

   protected static final class a extends eia<ehy.a> {
      public a(Long2ObjectOpenHashMap<dpd> $$0) {
         super($$0);
      }

      public ehy.a a() {
         return new ehy.a(this.a.clone());
      }
   }
}
