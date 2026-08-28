import com.google.common.collect.ImmutableMap;

public class cir extends cih {
   private static final ImmutableMap<bxn<?>, Float> a = ImmutableMap.builder()
      .put(bxn.L, 8.0F)
      .put(bxn.T, 12.0F)
      .put(bxn.an, 8.0F)
      .put(bxn.ao, 12.0F)
      .put(bxn.aU, 15.0F)
      .put(bxn.ba, 12.0F)
      .put(bxn.bD, 8.0F)
      .put(bxn.bF, 10.0F)
      .put(bxn.bO, 10.0F)
      .put(bxn.bP, 8.0F)
      .put(bxn.bR, 8.0F)
      .build();

   @Override
   protected boolean a(asb $$0, byf $$1, byf $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(byf $$0, byf $$1) {
      float $$2 = (Float)a.get($$1.an());
      return $$1.g($$0) <= (double)($$2 * $$2);
   }

   @Override
   protected chh<byf> b() {
      return chh.B;
   }

   private boolean b(byf $$0) {
      return a.containsKey($$0.an());
   }
}
