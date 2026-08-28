import com.google.common.collect.ImmutableMap;

public class chd extends cgt {
   private static final ImmutableMap<bwb<?>, Float> a = ImmutableMap.builder()
      .put(bwb.K, 8.0F)
      .put(bwb.S, 12.0F)
      .put(bwb.am, 8.0F)
      .put(bwb.an, 12.0F)
      .put(bwb.aT, 15.0F)
      .put(bwb.aY, 12.0F)
      .put(bwb.bB, 8.0F)
      .put(bwb.bD, 10.0F)
      .put(bwb.bM, 10.0F)
      .put(bwb.bN, 8.0F)
      .put(bwb.bP, 8.0F)
      .build();

   @Override
   protected boolean a(arn $$0, bwr $$1, bwr $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(bwr $$0, bwr $$1) {
      float $$2 = (Float)a.get($$1.aq());
      return $$1.g((bvs)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cft<bwr> b() {
      return cft.B;
   }

   private boolean b(bwr $$0) {
      return a.containsKey($$0.aq());
   }
}
