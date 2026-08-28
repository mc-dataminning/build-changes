import com.google.common.collect.ImmutableMap;

public class cdp extends cdf {
   private static final ImmutableMap<bsm<?>, Float> a = ImmutableMap.builder()
      .put(bsm.B, 8.0F)
      .put(bsm.J, 12.0F)
      .put(bsm.ac, 8.0F)
      .put(bsm.ad, 12.0F)
      .put(bsm.aC, 15.0F)
      .put(bsm.aH, 12.0F)
      .put(bsm.bi, 8.0F)
      .put(bsm.bk, 10.0F)
      .put(bsm.bt, 10.0F)
      .put(bsm.bu, 8.0F)
      .put(bsm.bw, 8.0F)
      .build();

   @Override
   protected boolean a(btb $$0, btb $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(btb $$0, btb $$1) {
      float $$2 = (Float)a.get($$1.al());
      return $$1.g((bsg)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected ccf<btb> b() {
      return ccf.A;
   }

   private boolean b(btb $$0) {
      return a.containsKey($$0.al());
   }
}
