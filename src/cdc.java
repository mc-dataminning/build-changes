import com.google.common.collect.ImmutableMap;

public class cdc extends ccs {
   private static final ImmutableMap<bsa<?>, Float> a = ImmutableMap.builder()
      .put(bsa.B, 8.0F)
      .put(bsa.J, 12.0F)
      .put(bsa.ac, 8.0F)
      .put(bsa.ad, 12.0F)
      .put(bsa.aC, 15.0F)
      .put(bsa.aH, 12.0F)
      .put(bsa.bi, 8.0F)
      .put(bsa.bk, 10.0F)
      .put(bsa.bt, 10.0F)
      .put(bsa.bu, 8.0F)
      .put(bsa.bw, 8.0F)
      .build();

   @Override
   protected boolean a(bso $$0, bso $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bso $$0, bso $$1) {
      float $$2 = (Float)a.get($$1.ak());
      return $$1.g((bru)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cbs<bso> b() {
      return cbs.A;
   }

   private boolean b(bso $$0) {
      return a.containsKey($$0.ak());
   }
}
