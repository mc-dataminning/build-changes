import com.google.common.collect.ImmutableMap;

public class cdb extends ccr {
   private static final ImmutableMap<bsb<?>, Float> a = ImmutableMap.builder()
      .put(bsb.D, 8.0F)
      .put(bsb.L, 12.0F)
      .put(bsb.ae, 8.0F)
      .put(bsb.af, 12.0F)
      .put(bsb.aD, 15.0F)
      .put(bsb.aJ, 12.0F)
      .put(bsb.bm, 8.0F)
      .put(bsb.bo, 10.0F)
      .put(bsb.bx, 10.0F)
      .put(bsb.by, 8.0F)
      .put(bsb.bB, 8.0F)
      .build();

   @Override
   protected boolean a(bso $$0, bso $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bso $$0, bso $$1) {
      float $$2 = (Float)a.get($$1.ak());
      return $$1.g((brv)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cbr<bso> b() {
      return cbr.A;
   }

   private boolean b(bso $$0) {
      return a.containsKey($$0.ak());
   }
}
