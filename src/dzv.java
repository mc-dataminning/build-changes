import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class dzv extends eaa<dzv.a> {
   protected dzv(dht $$0) {
      super(cqe.b, $$0, new dzv.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = hw.e($$0);
      dhl $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(hw.b(gw.a($$0)), hw.b(gw.b($$0)), hw.b(gw.c($$0)));
   }

   protected static final class a extends dzx<dzv.a> {
      public a(Long2ObjectOpenHashMap<dhl> $$0) {
         super($$0);
      }

      public dzv.a a() {
         return new dzv.a(this.a.clone());
      }
   }
}
