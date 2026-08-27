import com.google.common.collect.ImmutableMap;

public class cbb extends car {
   private static final ImmutableMap<bqb<?>, Float> a = ImmutableMap.builder()
      .put(bqb.B, 8.0F)
      .put(bqb.J, 12.0F)
      .put(bqb.ac, 8.0F)
      .put(bqb.ad, 12.0F)
      .put(bqb.aB, 15.0F)
      .put(bqb.aG, 12.0F)
      .put(bqb.bh, 8.0F)
      .put(bqb.bj, 10.0F)
      .put(bqb.bs, 10.0F)
      .put(bqb.bt, 8.0F)
      .put(bqb.bv, 8.0F)
      .build();

   @Override
   protected boolean a(bqo $$0, bqo $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bqo $$0, bqo $$1) {
      float $$2 = (Float)a.get($$1.ai());
      return $$1.g((bpv)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bzr<bqo> b() {
      return bzr.A;
   }

   private boolean b(bqo $$0) {
      return a.containsKey($$0.ai());
   }
}
