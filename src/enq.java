import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;

public class enq extends env<enq.a> {
   protected enq(dut $$0) {
      super(dco.b, $$0, new enq.a(new Long2ObjectOpenHashMap()));
   }

   @Override
   protected int a(long $$0) {
      long $$1 = kc.e($$0);
      dul $$2 = this.a($$1, false);
      return $$2 == null ? 0 : $$2.a(kc.b(ja.a($$0)), kc.b(ja.b($$0)), kc.b(ja.c($$0)));
   }

   protected static final class a extends ens<enq.a> {
      public a(Long2ObjectOpenHashMap<dul> $$0) {
         super($$0);
      }

      public enq.a a() {
         return new enq.a(this.a.clone());
      }
   }
}
