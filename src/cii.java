import com.google.common.collect.ImmutableMap;

public class cii extends chy {
   private static final ImmutableMap<bxe<?>, Float> a = ImmutableMap.builder()
      .put(bxe.L, 8.0F)
      .put(bxe.T, 12.0F)
      .put(bxe.an, 8.0F)
      .put(bxe.ao, 12.0F)
      .put(bxe.aU, 15.0F)
      .put(bxe.ba, 12.0F)
      .put(bxe.bD, 8.0F)
      .put(bxe.bF, 10.0F)
      .put(bxe.bO, 10.0F)
      .put(bxe.bP, 8.0F)
      .put(bxe.bR, 8.0F)
      .build();

   @Override
   protected boolean a(aru $$0, bxw $$1, bxw $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(bxw $$0, bxw $$1) {
      float $$2 = (Float)a.get($$1.an());
      return $$1.g($$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cgy<bxw> b() {
      return cgy.B;
   }

   private boolean b(bxw $$0) {
      return a.containsKey($$0.an());
   }
}
