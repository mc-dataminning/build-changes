import com.google.common.collect.ImmutableMap;

public class cig extends chw {
   private static final ImmutableMap<bxc<?>, Float> a = ImmutableMap.builder()
      .put(bxc.L, 8.0F)
      .put(bxc.T, 12.0F)
      .put(bxc.an, 8.0F)
      .put(bxc.ao, 12.0F)
      .put(bxc.aU, 15.0F)
      .put(bxc.ba, 12.0F)
      .put(bxc.bD, 8.0F)
      .put(bxc.bF, 10.0F)
      .put(bxc.bO, 10.0F)
      .put(bxc.bP, 8.0F)
      .put(bxc.bR, 8.0F)
      .build();

   @Override
   protected boolean a(ars $$0, bxu $$1, bxu $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(bxu $$0, bxu $$1) {
      float $$2 = (Float)a.get($$1.an());
      return $$1.g($$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cgw<bxu> b() {
      return cgw.B;
   }

   private boolean b(bxu $$0) {
      return a.containsKey($$0.an());
   }
}
