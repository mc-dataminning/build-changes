import com.google.common.collect.ImmutableMap;

public class bww extends bwm {
   private static final ImmutableMap<blz<?>, Float> a = ImmutableMap.builder()
      .put(blz.z, 8.0F)
      .put(blz.H, 12.0F)
      .put(blz.aa, 8.0F)
      .put(blz.ab, 12.0F)
      .put(blz.az, 15.0F)
      .put(blz.aE, 12.0F)
      .put(blz.bf, 8.0F)
      .put(blz.bh, 10.0F)
      .put(blz.bq, 10.0F)
      .put(blz.br, 8.0F)
      .put(blz.bt, 8.0F)
      .build();

   @Override
   protected boolean a(bml $$0, bml $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bml $$0, bml $$1) {
      float $$2 = (Float)a.get($$1.ai());
      return $$1.f((blv)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bvn<bml> b() {
      return bvn.A;
   }

   private boolean b(bml $$0) {
      return a.containsKey($$0.ai());
   }
}
