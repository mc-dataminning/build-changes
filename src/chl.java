import com.google.common.collect.ImmutableMap;

public class chl extends chb {
   private static final ImmutableMap<bwj<?>, Float> a = ImmutableMap.builder()
      .put(bwj.K, 8.0F)
      .put(bwj.S, 12.0F)
      .put(bwj.am, 8.0F)
      .put(bwj.an, 12.0F)
      .put(bwj.aT, 15.0F)
      .put(bwj.aZ, 12.0F)
      .put(bwj.bC, 8.0F)
      .put(bwj.bE, 10.0F)
      .put(bwj.bN, 10.0F)
      .put(bwj.bO, 8.0F)
      .put(bwj.bQ, 8.0F)
      .build();

   @Override
   protected boolean a(aro $$0, bwz $$1, bwz $$2) {
      return this.b($$2) && this.a($$1, $$2);
   }

   private boolean a(bwz $$0, bwz $$1) {
      float $$2 = (Float)a.get($$1.aq());
      return $$1.g($$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cgb<bwz> b() {
      return cgb.B;
   }

   private boolean b(bwz $$0) {
      return a.containsKey($$0.aq());
   }
}
