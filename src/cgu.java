import com.google.common.collect.ImmutableMap;

public class cgu extends cgk {
   private static final ImmutableMap<bvr<?>, Float> a = ImmutableMap.builder()
      .put(bvr.L, 8.0F)
      .put(bvr.T, 12.0F)
      .put(bvr.an, 8.0F)
      .put(bvr.ao, 12.0F)
      .put(bvr.aU, 15.0F)
      .put(bvr.aZ, 12.0F)
      .put(bvr.bC, 8.0F)
      .put(bvr.bE, 10.0F)
      .put(bvr.bN, 10.0F)
      .put(bvr.bO, 8.0F)
      .put(bvr.bQ, 8.0F)
      .build();

   @Override
   protected boolean a(ash $$0, bwg $$1, bwg $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(bwg $$0, bwg $$1) {
      float $$2 = (Float)a.get($$1.aq());
      return $$1.g((bvk)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cfk<bwg> b() {
      return cfk.A;
   }

   private boolean b(bwg $$0) {
      return a.containsKey($$0.aq());
   }
}
