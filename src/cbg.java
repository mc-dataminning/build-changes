import com.google.common.collect.ImmutableMap;

public class cbg extends caw {
   private static final ImmutableMap<bqg<?>, Float> a = ImmutableMap.builder()
      .put(bqg.B, 8.0F)
      .put(bqg.J, 12.0F)
      .put(bqg.ac, 8.0F)
      .put(bqg.ad, 12.0F)
      .put(bqg.aB, 15.0F)
      .put(bqg.aG, 12.0F)
      .put(bqg.bh, 8.0F)
      .put(bqg.bj, 10.0F)
      .put(bqg.bs, 10.0F)
      .put(bqg.bt, 8.0F)
      .put(bqg.bv, 8.0F)
      .build();

   @Override
   protected boolean a(bqt $$0, bqt $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bqt $$0, bqt $$1) {
      float $$2 = (Float)a.get($$1.ai());
      return $$1.g((bqa)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bzw<bqt> b() {
      return bzw.A;
   }

   private boolean b(bqt $$0) {
      return a.containsKey($$0.ai());
   }
}
