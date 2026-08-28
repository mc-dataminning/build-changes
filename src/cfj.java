import com.google.common.collect.ImmutableMap;

public class cfj extends cez {
   private static final ImmutableMap<bug<?>, Float> a = ImmutableMap.builder()
      .put(bug.B, 8.0F)
      .put(bug.J, 12.0F)
      .put(bug.ac, 8.0F)
      .put(bug.ad, 12.0F)
      .put(bug.aC, 15.0F)
      .put(bug.aH, 12.0F)
      .put(bug.bi, 8.0F)
      .put(bug.bk, 10.0F)
      .put(bug.bt, 10.0F)
      .put(bug.bu, 8.0F)
      .put(bug.bw, 8.0F)
      .build();

   @Override
   protected boolean a(buv $$0, buv $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(buv $$0, buv $$1) {
      float $$2 = (Float)a.get($$1.aq());
      return $$1.g((btz)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cdz<buv> b() {
      return cdz.A;
   }

   private boolean b(buv $$0) {
      return a.containsKey($$0.aq());
   }
}
