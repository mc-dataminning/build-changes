import com.google.common.collect.ImmutableMap;

public class btg extends bsw {
   private static final ImmutableMap<bik<?>, Float> a = ImmutableMap.builder()
      .put(bik.y, 8.0F)
      .put(bik.G, 12.0F)
      .put(bik.Z, 8.0F)
      .put(bik.aa, 12.0F)
      .put(bik.ay, 15.0F)
      .put(bik.aD, 12.0F)
      .put(bik.be, 8.0F)
      .put(bik.bg, 10.0F)
      .put(bik.bo, 10.0F)
      .put(bik.bp, 8.0F)
      .put(bik.br, 8.0F)
      .build();

   @Override
   protected boolean a(biw $$0, biw $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(biw $$0, biw $$1) {
      float $$2 = (Float)a.get($$1.ag());
      return $$1.f((big)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bry<biw> b() {
      return bry.A;
   }

   private boolean b(biw $$0) {
      return a.containsKey($$0.ag());
   }
}
