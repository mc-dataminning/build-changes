import com.google.common.collect.ImmutableMap;

public class cgp extends cgf {
   private static final ImmutableMap<bvm<?>, Float> a = ImmutableMap.builder()
      .put(bvm.L, 8.0F)
      .put(bvm.T, 12.0F)
      .put(bvm.an, 8.0F)
      .put(bvm.ao, 12.0F)
      .put(bvm.aU, 15.0F)
      .put(bvm.aZ, 12.0F)
      .put(bvm.bC, 8.0F)
      .put(bvm.bE, 10.0F)
      .put(bvm.bN, 10.0F)
      .put(bvm.bO, 8.0F)
      .put(bvm.bQ, 8.0F)
      .build();

   @Override
   protected boolean a(ash $$0, bwb $$1, bwb $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(bwb $$0, bwb $$1) {
      float $$2 = (Float)a.get($$1.aq());
      return $$1.g((bvf)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cff<bwb> b() {
      return cff.A;
   }

   private boolean b(bwb $$0) {
      return a.containsKey($$0.aq());
   }
}
