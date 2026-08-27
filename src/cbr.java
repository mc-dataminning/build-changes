import com.google.common.collect.ImmutableMap;

public class cbr extends cbh {
   private static final ImmutableMap<bqr<?>, Float> a = ImmutableMap.builder()
      .put(bqr.B, 8.0F)
      .put(bqr.J, 12.0F)
      .put(bqr.ac, 8.0F)
      .put(bqr.ad, 12.0F)
      .put(bqr.aB, 15.0F)
      .put(bqr.aG, 12.0F)
      .put(bqr.bh, 8.0F)
      .put(bqr.bj, 10.0F)
      .put(bqr.bs, 10.0F)
      .put(bqr.bt, 8.0F)
      .put(bqr.bv, 8.0F)
      .build();

   @Override
   protected boolean a(bre $$0, bre $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bre $$0, bre $$1) {
      float $$2 = (Float)a.get($$1.ai());
      return $$1.g((bql)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cah<bre> b() {
      return cah.A;
   }

   private boolean b(bre $$0) {
      return a.containsKey($$0.ai());
   }
}
