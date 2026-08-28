import com.google.common.collect.ImmutableMap;

public class cef extends cdv {
   private static final ImmutableMap<btc<?>, Float> a = ImmutableMap.builder()
      .put(btc.B, 8.0F)
      .put(btc.J, 12.0F)
      .put(btc.ac, 8.0F)
      .put(btc.ad, 12.0F)
      .put(btc.aC, 15.0F)
      .put(btc.aH, 12.0F)
      .put(btc.bi, 8.0F)
      .put(btc.bk, 10.0F)
      .put(btc.bt, 10.0F)
      .put(btc.bu, 8.0F)
      .put(btc.bw, 8.0F)
      .build();

   @Override
   protected boolean a(btr $$0, btr $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(btr $$0, btr $$1) {
      float $$2 = (Float)a.get($$1.ak());
      return $$1.g((bsw)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected ccv<btr> b() {
      return ccv.A;
   }

   private boolean b(btr $$0) {
      return a.containsKey($$0.ak());
   }
}
