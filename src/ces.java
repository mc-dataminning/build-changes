import com.google.common.collect.ImmutableMap;

public class ces extends cei {
   private static final ImmutableMap<btq<?>, Float> a = ImmutableMap.builder()
      .put(btq.B, 8.0F)
      .put(btq.J, 12.0F)
      .put(btq.ac, 8.0F)
      .put(btq.ad, 12.0F)
      .put(btq.aC, 15.0F)
      .put(btq.aH, 12.0F)
      .put(btq.bi, 8.0F)
      .put(btq.bk, 10.0F)
      .put(btq.bt, 10.0F)
      .put(btq.bu, 8.0F)
      .put(btq.bw, 8.0F)
      .build();

   @Override
   protected boolean a(buf $$0, buf $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(buf $$0, buf $$1) {
      float $$2 = (Float)a.get($$1.ao());
      return $$1.g((btj)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cdi<buf> b() {
      return cdi.A;
   }

   private boolean b(buf $$0) {
      return a.containsKey($$0.ao());
   }
}
