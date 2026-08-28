import com.google.common.collect.ImmutableMap;

public class ced extends cdt {
   private static final ImmutableMap<bta<?>, Float> a = ImmutableMap.builder()
      .put(bta.B, 8.0F)
      .put(bta.J, 12.0F)
      .put(bta.ac, 8.0F)
      .put(bta.ad, 12.0F)
      .put(bta.aC, 15.0F)
      .put(bta.aH, 12.0F)
      .put(bta.bi, 8.0F)
      .put(bta.bk, 10.0F)
      .put(bta.bt, 10.0F)
      .put(bta.bu, 8.0F)
      .put(bta.bw, 8.0F)
      .build();

   @Override
   protected boolean a(btp $$0, btp $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(btp $$0, btp $$1) {
      float $$2 = (Float)a.get($$1.ak());
      return $$1.g((bsu)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cct<btp> b() {
      return cct.A;
   }

   private boolean b(btp $$0) {
      return a.containsKey($$0.ak());
   }
}
