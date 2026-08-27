import com.google.common.collect.ImmutableMap;

public class cde extends ccu {
   private static final ImmutableMap<bsc<?>, Float> a = ImmutableMap.builder()
      .put(bsc.B, 8.0F)
      .put(bsc.J, 12.0F)
      .put(bsc.ac, 8.0F)
      .put(bsc.ad, 12.0F)
      .put(bsc.aC, 15.0F)
      .put(bsc.aH, 12.0F)
      .put(bsc.bi, 8.0F)
      .put(bsc.bk, 10.0F)
      .put(bsc.bt, 10.0F)
      .put(bsc.bu, 8.0F)
      .put(bsc.bw, 8.0F)
      .build();

   @Override
   protected boolean a(bsq $$0, bsq $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bsq $$0, bsq $$1) {
      float $$2 = (Float)a.get($$1.ak());
      return $$1.g((brw)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cbu<bsq> b() {
      return cbu.A;
   }

   private boolean b(bsq $$0) {
      return a.containsKey($$0.ak());
   }
}
