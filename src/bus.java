import com.google.common.collect.ImmutableMap;

public class bus extends bui {
   private static final ImmutableMap<bjx<?>, Float> a = ImmutableMap.builder()
      .put(bjx.y, 8.0F)
      .put(bjx.G, 12.0F)
      .put(bjx.Z, 8.0F)
      .put(bjx.aa, 12.0F)
      .put(bjx.ay, 15.0F)
      .put(bjx.aD, 12.0F)
      .put(bjx.be, 8.0F)
      .put(bjx.bg, 10.0F)
      .put(bjx.bo, 10.0F)
      .put(bjx.bp, 8.0F)
      .put(bjx.br, 8.0F)
      .build();

   @Override
   protected boolean a(bkj $$0, bkj $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bkj $$0, bkj $$1) {
      float $$2 = (Float)a.get($$1.ag());
      return $$1.f((bjt)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected btk<bkj> b() {
      return btk.A;
   }

   private boolean b(bkj $$0) {
      return a.containsKey($$0.ag());
   }
}
