import com.google.common.collect.ImmutableMap;

public class btk extends bta {
   private static final ImmutableMap<bip<?>, Float> a = ImmutableMap.builder()
      .put(bip.y, 8.0F)
      .put(bip.G, 12.0F)
      .put(bip.Z, 8.0F)
      .put(bip.aa, 12.0F)
      .put(bip.ay, 15.0F)
      .put(bip.aD, 12.0F)
      .put(bip.be, 8.0F)
      .put(bip.bg, 10.0F)
      .put(bip.bo, 10.0F)
      .put(bip.bp, 8.0F)
      .put(bip.br, 8.0F)
      .build();

   @Override
   protected boolean a(bjb $$0, bjb $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bjb $$0, bjb $$1) {
      float $$2 = (Float)a.get($$1.ag());
      return $$1.f((bil)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bsc<bjb> b() {
      return bsc.A;
   }

   private boolean b(bjb $$0) {
      return a.containsKey($$0.ag());
   }
}
