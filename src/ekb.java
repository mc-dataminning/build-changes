import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class ekb extends ekg<ekb.a> {
   protected ekb(dri $$0) {
      super(czg.b, $$0, new ekb.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = je.e($$0);
      dra $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(je.b(ib.a($$0)), je.b(ib.b($$0)), je.b(ib.c($$0)));
   }

   protected static final class a extends ekd<ekb.a> {
      public a(Long2ObjectOpenHashMap<dra> $$0) {
         super($$0);
      }

      public ekb.a a() {
         return new ekb.a(this.a.clone());
      }
   }
}
