import com.google.common.collect.ImmutableMap;

public class btr extends bth {
   private static final ImmutableMap<biw<?>, Float> a = ImmutableMap.builder()
      .put(biw.y, 8.0F)
      .put(biw.G, 12.0F)
      .put(biw.Z, 8.0F)
      .put(biw.aa, 12.0F)
      .put(biw.ay, 15.0F)
      .put(biw.aD, 12.0F)
      .put(biw.be, 8.0F)
      .put(biw.bg, 10.0F)
      .put(biw.bo, 10.0F)
      .put(biw.bp, 8.0F)
      .put(biw.br, 8.0F)
      .build();

   @Override
   protected boolean a(bji $$0, bji $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bji $$0, bji $$1) {
      float $$2 = (Float)a.get($$1.ag());
      return $$1.f((bis)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bsj<bji> b() {
      return bsj.A;
   }

   private boolean b(bji $$0) {
      return a.containsKey($$0.ag());
   }
}
