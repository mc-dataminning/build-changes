import com.google.common.collect.ImmutableMap;

public class cgt extends cgj {
   private static final ImmutableMap<bvq<?>, Float> a = ImmutableMap.builder()
      .put(bvq.L, 8.0F)
      .put(bvq.T, 12.0F)
      .put(bvq.an, 8.0F)
      .put(bvq.ao, 12.0F)
      .put(bvq.aU, 15.0F)
      .put(bvq.aZ, 12.0F)
      .put(bvq.bC, 8.0F)
      .put(bvq.bE, 10.0F)
      .put(bvq.bN, 10.0F)
      .put(bvq.bO, 8.0F)
      .put(bvq.bQ, 8.0F)
      .build();

   @Override
   protected boolean a(ash $$0, bwf $$1, bwf $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(bwf $$0, bwf $$1) {
      float $$2 = (Float)a.get($$1.aq());
      return $$1.g((bvj)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cfj<bwf> b() {
      return cfj.A;
   }

   private boolean b(bwf $$0) {
      return a.containsKey($$0.aq());
   }
}
