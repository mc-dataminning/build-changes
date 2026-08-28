import com.google.common.collect.ImmutableMap;

public class cfu extends cfk {
   private static final ImmutableMap<bur<?>, Float> a = ImmutableMap.builder()
      .put(bur.L, 8.0F)
      .put(bur.T, 12.0F)
      .put(bur.an, 8.0F)
      .put(bur.ao, 12.0F)
      .put(bur.aU, 15.0F)
      .put(bur.aZ, 12.0F)
      .put(bur.bC, 8.0F)
      .put(bur.bE, 10.0F)
      .put(bur.bN, 10.0F)
      .put(bur.bO, 8.0F)
      .put(bur.bQ, 8.0F)
      .build();

   @Override
   protected boolean a(arc $$0, bvg $$1, bvg $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(bvg $$0, bvg $$1) {
      float $$2 = (Float)a.get($$1.aq());
      return $$1.g((buk)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cek<bvg> b() {
      return cek.A;
   }

   private boolean b(bvg $$0) {
      return a.containsKey($$0.aq());
   }
}
