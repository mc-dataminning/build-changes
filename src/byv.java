import com.google.common.collect.ImmutableMap;

public class byv extends byl {
   private static final ImmutableMap<bnw<?>, Float> a = ImmutableMap.builder()
      .put(bnw.A, 8.0F)
      .put(bnw.I, 12.0F)
      .put(bnw.ab, 8.0F)
      .put(bnw.ac, 12.0F)
      .put(bnw.aA, 15.0F)
      .put(bnw.aF, 12.0F)
      .put(bnw.bg, 8.0F)
      .put(bnw.bi, 10.0F)
      .put(bnw.br, 10.0F)
      .put(bnw.bs, 8.0F)
      .put(bnw.bu, 8.0F)
      .build();

   @Override
   protected boolean a(boi $$0, boi $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(boi $$0, boi $$1) {
      float $$2 = (Float)a.get($$1.ai());
      return $$1.f((bnq)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bxl<boi> b() {
      return bxl.A;
   }

   private boolean b(boi $$0) {
      return a.containsKey($$0.ai());
   }
}
