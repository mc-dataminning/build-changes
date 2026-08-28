import com.google.common.collect.ImmutableMap;

public class cfw extends cfm {
   private static final ImmutableMap<but<?>, Float> a = ImmutableMap.builder()
      .put(but.K, 8.0F)
      .put(but.S, 12.0F)
      .put(but.am, 8.0F)
      .put(but.an, 12.0F)
      .put(but.aT, 15.0F)
      .put(but.aY, 12.0F)
      .put(but.bB, 8.0F)
      .put(but.bD, 10.0F)
      .put(but.bM, 10.0F)
      .put(but.bN, 8.0F)
      .put(but.bP, 8.0F)
      .build();

   @Override
   protected boolean a(ard $$0, bvi $$1, bvi $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(bvi $$0, bvi $$1) {
      float $$2 = (Float)a.get($$1.aq());
      return $$1.g((bum)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cem<bvi> b() {
      return cem.A;
   }

   private boolean b(bvi $$0) {
      return a.containsKey($$0.aq());
   }
}
