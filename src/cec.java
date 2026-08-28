import com.google.common.collect.ImmutableMap;

public class cec extends cds {
   private static final ImmutableMap<bsx<?>, Float> a = ImmutableMap.builder()
      .put(bsx.B, 8.0F)
      .put(bsx.J, 12.0F)
      .put(bsx.ac, 8.0F)
      .put(bsx.ad, 12.0F)
      .put(bsx.aC, 15.0F)
      .put(bsx.aH, 12.0F)
      .put(bsx.bi, 8.0F)
      .put(bsx.bk, 10.0F)
      .put(bsx.bt, 10.0F)
      .put(bsx.bu, 8.0F)
      .put(bsx.bw, 8.0F)
      .build();

   @Override
   protected boolean a(btn $$0, btn $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(btn $$0, btn $$1) {
      float $$2 = (Float)a.get($$1.am());
      return $$1.g((bsr)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected ccs<btn> b() {
      return ccs.A;
   }

   private boolean b(btn $$0) {
      return a.containsKey($$0.am());
   }
}
