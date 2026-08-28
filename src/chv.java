import com.google.common.collect.ImmutableMap;

public class chv extends chl {
   private static final ImmutableMap<bwr<?>, Float> a = ImmutableMap.builder()
      .put(bwr.K, 8.0F)
      .put(bwr.S, 12.0F)
      .put(bwr.am, 8.0F)
      .put(bwr.an, 12.0F)
      .put(bwr.aT, 15.0F)
      .put(bwr.aZ, 12.0F)
      .put(bwr.bC, 8.0F)
      .put(bwr.bE, 10.0F)
      .put(bwr.bN, 10.0F)
      .put(bwr.bO, 8.0F)
      .put(bwr.bQ, 8.0F)
      .build();

   @Override
   protected boolean a(arq $$0, bxj $$1, bxj $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(bxj $$0, bxj $$1) {
      float $$2 = (Float)a.get($$1.an());
      return $$1.g($$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cgl<bxj> b() {
      return cgl.B;
   }

   private boolean b(bxj $$0) {
      return a.containsKey($$0.an());
   }
}
