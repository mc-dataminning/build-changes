import com.google.common.collect.ImmutableMap;

public class bvu extends bvk {
   private static final ImmutableMap<bkz<?>, Float> a = ImmutableMap.builder()
      .put(bkz.y, 8.0F)
      .put(bkz.G, 12.0F)
      .put(bkz.Z, 8.0F)
      .put(bkz.aa, 12.0F)
      .put(bkz.ay, 15.0F)
      .put(bkz.aD, 12.0F)
      .put(bkz.be, 8.0F)
      .put(bkz.bg, 10.0F)
      .put(bkz.bo, 10.0F)
      .put(bkz.bp, 8.0F)
      .put(bkz.br, 8.0F)
      .build();

   @Override
   protected boolean a(bll $$0, bll $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bll $$0, bll $$1) {
      float $$2 = (Float)a.get($$1.ai());
      return $$1.f((bkv)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bum<bll> b() {
      return bum.A;
   }

   private boolean b(bll $$0) {
      return a.containsKey($$0.ai());
   }
}
