import com.google.common.collect.ImmutableMap;

public class bwv extends bwl {
   private static final ImmutableMap<bly<?>, Float> a = ImmutableMap.builder()
      .put(bly.z, 8.0F)
      .put(bly.H, 12.0F)
      .put(bly.aa, 8.0F)
      .put(bly.ab, 12.0F)
      .put(bly.az, 15.0F)
      .put(bly.aE, 12.0F)
      .put(bly.bf, 8.0F)
      .put(bly.bh, 10.0F)
      .put(bly.bq, 10.0F)
      .put(bly.br, 8.0F)
      .put(bly.bt, 8.0F)
      .build();

   @Override
   protected boolean a(bmk $$0, bmk $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bmk $$0, bmk $$1) {
      float $$2 = (Float)a.get($$1.ai());
      return $$1.f((blu)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bvm<bmk> b() {
      return bvm.A;
   }

   private boolean b(bmk $$0) {
      return a.containsKey($$0.ai());
   }
}
