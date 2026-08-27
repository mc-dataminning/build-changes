import com.google.common.collect.ImmutableMap;

public class bti extends bsy {
   private static final ImmutableMap<bim<?>, Float> a = ImmutableMap.builder()
      .put(bim.y, 8.0F)
      .put(bim.G, 12.0F)
      .put(bim.Z, 8.0F)
      .put(bim.aa, 12.0F)
      .put(bim.ay, 15.0F)
      .put(bim.aD, 12.0F)
      .put(bim.be, 8.0F)
      .put(bim.bg, 10.0F)
      .put(bim.bo, 10.0F)
      .put(bim.bp, 8.0F)
      .put(bim.br, 8.0F)
      .build();

   @Override
   protected boolean a(biy $$0, biy $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(biy $$0, biy $$1) {
      float $$2 = (Float)a.get($$1.ag());
      return $$1.f((bii)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bsa<biy> b() {
      return bsa.A;
   }

   private boolean b(biy $$0) {
      return a.containsKey($$0.ag());
   }
}
