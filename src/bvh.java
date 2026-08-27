import com.google.common.collect.ImmutableMap;

public class bvh extends bux {
   private static final ImmutableMap<bkm<?>, Float> a = ImmutableMap.builder()
      .put(bkm.y, 8.0F)
      .put(bkm.G, 12.0F)
      .put(bkm.Z, 8.0F)
      .put(bkm.aa, 12.0F)
      .put(bkm.ay, 15.0F)
      .put(bkm.aD, 12.0F)
      .put(bkm.be, 8.0F)
      .put(bkm.bg, 10.0F)
      .put(bkm.bo, 10.0F)
      .put(bkm.bp, 8.0F)
      .put(bkm.br, 8.0F)
      .build();

   @Override
   protected boolean a(bky $$0, bky $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bky $$0, bky $$1) {
      float $$2 = (Float)a.get($$1.ag());
      return $$1.f((bki)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected btz<bky> b() {
      return btz.A;
   }

   private boolean b(bky $$0) {
      return a.containsKey($$0.ag());
   }
}
