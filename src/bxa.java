import com.google.common.collect.ImmutableMap;

public class bxa extends bwq {
   private static final ImmutableMap<bmc<?>, Float> a = ImmutableMap.builder()
      .put(bmc.A, 8.0F)
      .put(bmc.I, 12.0F)
      .put(bmc.ab, 8.0F)
      .put(bmc.ac, 12.0F)
      .put(bmc.aA, 15.0F)
      .put(bmc.aF, 12.0F)
      .put(bmc.bg, 8.0F)
      .put(bmc.bi, 10.0F)
      .put(bmc.br, 10.0F)
      .put(bmc.bs, 8.0F)
      .put(bmc.bu, 8.0F)
      .build();

   @Override
   protected boolean a(bmo $$0, bmo $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bmo $$0, bmo $$1) {
      float $$2 = (Float)a.get($$1.ai());
      return $$1.f((blw)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bvq<bmo> b() {
      return bvq.A;
   }

   private boolean b(bmo $$0) {
      return a.containsKey($$0.ai());
   }
}
