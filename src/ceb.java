import com.google.common.collect.ImmutableMap;

public class ceb extends cdr {
   private static final ImmutableMap<bsy<?>, Float> a = ImmutableMap.builder()
      .put(bsy.B, 8.0F)
      .put(bsy.J, 12.0F)
      .put(bsy.ac, 8.0F)
      .put(bsy.ad, 12.0F)
      .put(bsy.aC, 15.0F)
      .put(bsy.aH, 12.0F)
      .put(bsy.bi, 8.0F)
      .put(bsy.bk, 10.0F)
      .put(bsy.bt, 10.0F)
      .put(bsy.bu, 8.0F)
      .put(bsy.bw, 8.0F)
      .build();

   @Override
   protected boolean a(btn $$0, btn $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(btn $$0, btn $$1) {
      float $$2 = (Float)a.get($$1.ak());
      return $$1.g((bss)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected ccr<btn> b() {
      return ccr.A;
   }

   private boolean b(btn $$0) {
      return a.containsKey($$0.ak());
   }
}
