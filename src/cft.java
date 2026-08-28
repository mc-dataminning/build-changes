import com.google.common.collect.ImmutableMap;

public class cft extends cfj {
   private static final ImmutableMap<buq<?>, Float> a = ImmutableMap.builder()
      .put(buq.K, 8.0F)
      .put(buq.S, 12.0F)
      .put(buq.am, 8.0F)
      .put(buq.an, 12.0F)
      .put(buq.aT, 15.0F)
      .put(buq.aY, 12.0F)
      .put(buq.bB, 8.0F)
      .put(buq.bD, 10.0F)
      .put(buq.bM, 10.0F)
      .put(buq.bN, 8.0F)
      .put(buq.bP, 8.0F)
      .build();

   @Override
   protected boolean a(arc $$0, bvf $$1, bvf $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(bvf $$0, bvf $$1) {
      float $$2 = (Float)a.get($$1.aq());
      return $$1.g((buj)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cej<bvf> b() {
      return cej.A;
   }

   private boolean b(bvf $$0) {
      return a.containsKey($$0.aq());
   }
}
