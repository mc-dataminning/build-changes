import com.google.common.collect.ImmutableMap;

public class cfv extends cfl {
   private static final ImmutableMap<bus<?>, Float> a = ImmutableMap.builder()
      .put(bus.J, 8.0F)
      .put(bus.R, 12.0F)
      .put(bus.al, 8.0F)
      .put(bus.am, 12.0F)
      .put(bus.aQ, 15.0F)
      .put(bus.aV, 12.0F)
      .put(bus.by, 8.0F)
      .put(bus.bA, 10.0F)
      .put(bus.bJ, 10.0F)
      .put(bus.bK, 8.0F)
      .put(bus.bM, 8.0F)
      .build();

   @Override
   protected boolean a(arp $$0, bvh $$1, bvh $$2) {
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
