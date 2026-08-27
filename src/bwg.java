import com.google.common.collect.ImmutableMap;

public class bwg extends bvw {
   private static final ImmutableMap<blj<?>, Float> a = ImmutableMap.builder()
      .put(blj.z, 8.0F)
      .put(blj.H, 12.0F)
      .put(blj.aa, 8.0F)
      .put(blj.ab, 12.0F)
      .put(blj.az, 15.0F)
      .put(blj.aE, 12.0F)
      .put(blj.bf, 8.0F)
      .put(blj.bh, 10.0F)
      .put(blj.bq, 10.0F)
      .put(blj.br, 8.0F)
      .put(blj.bt, 8.0F)
      .build();

   @Override
   protected boolean a(blv $$0, blv $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(blv $$0, blv $$1) {
      float $$2 = (Float)a.get($$1.ai());
      return $$1.f((blf)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bux<blv> b() {
      return bux.A;
   }

   private boolean b(blv $$0) {
      return a.containsKey($$0.ai());
   }
}
