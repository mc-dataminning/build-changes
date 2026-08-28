import com.google.common.collect.ImmutableMap;

public class cgm extends cgc {
   private static final ImmutableMap<bvi<?>, Float> a = ImmutableMap.builder()
      .put(bvi.K, 8.0F)
      .put(bvi.S, 12.0F)
      .put(bvi.am, 8.0F)
      .put(bvi.an, 12.0F)
      .put(bvi.aT, 15.0F)
      .put(bvi.aY, 12.0F)
      .put(bvi.bB, 8.0F)
      .put(bvi.bD, 10.0F)
      .put(bvi.bM, 10.0F)
      .put(bvi.bN, 8.0F)
      .put(bvi.bP, 8.0F)
      .build();

   @Override
   protected boolean a(ard $$0, bvy $$1, bvy $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(bvy $$0, bvy $$1) {
      float $$2 = (Float)a.get($$1.aq());
      return $$1.g((bva)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cfc<bvy> b() {
      return cfc.A;
   }

   private boolean b(bvy $$0) {
      return a.containsKey($$0.aq());
   }
}
