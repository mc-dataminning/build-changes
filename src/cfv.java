import com.google.common.collect.ImmutableMap;

public class cfv extends cfl {
   private static final ImmutableMap<bus<?>, Float> a = ImmutableMap.builder()
      .put(bus.K, 8.0F)
      .put(bus.S, 12.0F)
      .put(bus.am, 8.0F)
      .put(bus.an, 12.0F)
      .put(bus.aT, 15.0F)
      .put(bus.aY, 12.0F)
      .put(bus.bB, 8.0F)
      .put(bus.bD, 10.0F)
      .put(bus.bM, 10.0F)
      .put(bus.bN, 8.0F)
      .put(bus.bP, 8.0F)
      .build();

   @Override
   protected boolean a(ard $$0, bvh $$1, bvh $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(bvh $$0, bvh $$1) {
      float $$2 = (Float)a.get($$1.aq());
      return $$1.g((bul)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cel<bvh> b() {
      return cel.A;
   }

   private boolean b(bvh $$0) {
      return a.containsKey($$0.aq());
   }
}
