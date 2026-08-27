import com.google.common.collect.ImmutableMap;

public class byr extends byh {
   private static final ImmutableMap<bnu<?>, Float> a = ImmutableMap.builder()
      .put(bnu.A, 8.0F)
      .put(bnu.I, 12.0F)
      .put(bnu.ab, 8.0F)
      .put(bnu.ac, 12.0F)
      .put(bnu.aA, 15.0F)
      .put(bnu.aF, 12.0F)
      .put(bnu.bg, 8.0F)
      .put(bnu.bi, 10.0F)
      .put(bnu.br, 10.0F)
      .put(bnu.bs, 8.0F)
      .put(bnu.bu, 8.0F)
      .build();

   @Override
   protected boolean a(bog $$0, bog $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bog $$0, bog $$1) {
      float $$2 = (Float)a.get($$1.ai());
      return $$1.f((bno)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bxh<bog> b() {
      return bxh.A;
   }

   private boolean b(bog $$0) {
      return a.containsKey($$0.ai());
   }
}
