import com.google.common.collect.ImmutableMap;

public class cee extends cdu {
   private static final ImmutableMap<btb<?>, Float> a = ImmutableMap.builder()
      .put(btb.B, 8.0F)
      .put(btb.J, 12.0F)
      .put(btb.ac, 8.0F)
      .put(btb.ad, 12.0F)
      .put(btb.aC, 15.0F)
      .put(btb.aH, 12.0F)
      .put(btb.bi, 8.0F)
      .put(btb.bk, 10.0F)
      .put(btb.bt, 10.0F)
      .put(btb.bu, 8.0F)
      .put(btb.bw, 8.0F)
      .build();

   @Override
   protected boolean a(btq $$0, btq $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(btq $$0, btq $$1) {
      float $$2 = (Float)a.get($$1.ak());
      return $$1.g((bsv)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected ccu<btq> b() {
      return ccu.A;
   }

   private boolean b(btq $$0) {
      return a.containsKey($$0.ak());
   }
}
