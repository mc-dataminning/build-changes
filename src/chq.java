import com.google.common.collect.ImmutableMap;

public class chq extends chg {
   private static final ImmutableMap<bwo<?>, Float> a = ImmutableMap.builder()
      .put(bwo.K, 8.0F)
      .put(bwo.S, 12.0F)
      .put(bwo.am, 8.0F)
      .put(bwo.an, 12.0F)
      .put(bwo.aT, 15.0F)
      .put(bwo.aZ, 12.0F)
      .put(bwo.bC, 8.0F)
      .put(bwo.bE, 10.0F)
      .put(bwo.bN, 10.0F)
      .put(bwo.bO, 8.0F)
      .put(bwo.bQ, 8.0F)
      .build();

   @Override
   protected boolean a(arq $$0, bxe $$1, bxe $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(bxe $$0, bxe $$1) {
      float $$2 = (Float)a.get($$1.aq());
      return $$1.g($$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cgg<bxe> b() {
      return cgg.B;
   }

   private boolean b(bxe $$0) {
      return a.containsKey($$0.aq());
   }
}
