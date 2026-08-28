import com.google.common.collect.ImmutableMap;

public class cgl extends cgb {
   private static final ImmutableMap<bvi<?>, Float> a = ImmutableMap.builder()
      .put(bvi.L, 8.0F)
      .put(bvi.T, 12.0F)
      .put(bvi.an, 8.0F)
      .put(bvi.ao, 12.0F)
      .put(bvi.aU, 15.0F)
      .put(bvi.aZ, 12.0F)
      .put(bvi.bC, 8.0F)
      .put(bvi.bE, 10.0F)
      .put(bvi.bN, 10.0F)
      .put(bvi.bO, 8.0F)
      .put(bvi.bQ, 8.0F)
      .build();

   @Override
   protected boolean a(arx $$0, bvx $$1, bvx $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(bvx $$0, bvx $$1) {
      float $$2 = (Float)a.get($$1.aq());
      return $$1.g((bvb)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cfb<bvx> b() {
      return cfb.A;
   }

   private boolean b(bvx $$0) {
      return a.containsKey($$0.aq());
   }
}
