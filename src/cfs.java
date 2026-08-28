import com.google.common.collect.ImmutableMap;

public class cfs extends cfi {
   private static final ImmutableMap<bup<?>, Float> a = ImmutableMap.builder()
      .put(bup.B, 8.0F)
      .put(bup.J, 12.0F)
      .put(bup.ac, 8.0F)
      .put(bup.ad, 12.0F)
      .put(bup.aC, 15.0F)
      .put(bup.aH, 12.0F)
      .put(bup.bi, 8.0F)
      .put(bup.bk, 10.0F)
      .put(bup.bt, 10.0F)
      .put(bup.bu, 8.0F)
      .put(bup.bw, 8.0F)
      .build();

   @Override
   protected boolean a(bve $$0, bve $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bve $$0, bve $$1) {
      float $$2 = (Float)a.get($$1.ar());
      return $$1.g((bui)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cei<bve> b() {
      return cei.A;
   }

   private boolean b(bve $$0) {
      return a.containsKey($$0.ar());
   }
}
