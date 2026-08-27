import com.google.common.collect.ImmutableMap;

public class bwq extends bwg {
   private static final ImmutableMap<blt<?>, Float> a = ImmutableMap.builder()
      .put(blt.z, 8.0F)
      .put(blt.H, 12.0F)
      .put(blt.aa, 8.0F)
      .put(blt.ab, 12.0F)
      .put(blt.az, 15.0F)
      .put(blt.aE, 12.0F)
      .put(blt.bf, 8.0F)
      .put(blt.bh, 10.0F)
      .put(blt.bq, 10.0F)
      .put(blt.br, 8.0F)
      .put(blt.bt, 8.0F)
      .build();

   @Override
   protected boolean a(bmf $$0, bmf $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bmf $$0, bmf $$1) {
      float $$2 = (Float)a.get($$1.ai());
      return $$1.f((blp)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bvh<bmf> b() {
      return bvh.A;
   }

   private boolean b(bmf $$0) {
      return a.containsKey($$0.ai());
   }
}
