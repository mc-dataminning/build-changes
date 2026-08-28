import com.google.common.collect.ImmutableMap;

public class cfu extends cfk {
   private static final ImmutableMap<bur<?>, Float> a = ImmutableMap.builder()
      .put(bur.K, 8.0F)
      .put(bur.S, 12.0F)
      .put(bur.am, 8.0F)
      .put(bur.an, 12.0F)
      .put(bur.aT, 15.0F)
      .put(bur.aY, 12.0F)
      .put(bur.bB, 8.0F)
      .put(bur.bD, 10.0F)
      .put(bur.bM, 10.0F)
      .put(bur.bN, 8.0F)
      .put(bur.bP, 8.0F)
      .build();

   @Override
   protected boolean a(ard $$0, bvg $$1, bvg $$2) {
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
