import com.google.common.collect.ImmutableMap;

public class cho extends che {
   private static final ImmutableMap<bwm<?>, Float> a = ImmutableMap.builder()
      .put(bwm.K, 8.0F)
      .put(bwm.S, 12.0F)
      .put(bwm.am, 8.0F)
      .put(bwm.an, 12.0F)
      .put(bwm.aT, 15.0F)
      .put(bwm.aZ, 12.0F)
      .put(bwm.bC, 8.0F)
      .put(bwm.bE, 10.0F)
      .put(bwm.bN, 10.0F)
      .put(bwm.bO, 8.0F)
      .put(bwm.bQ, 8.0F)
      .build();

   @Override
   protected boolean a(arq $$0, bxc $$1, bxc $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(bxc $$0, bxc $$1) {
      float $$2 = (Float)a.get($$1.aq());
      return $$1.g($$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cge<bxc> b() {
      return cge.B;
   }

   private boolean b(bxc $$0) {
      return a.containsKey($$0.aq());
   }
}
