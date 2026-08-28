import com.google.common.collect.ImmutableMap;

public class cdy extends cdo {
   private static final ImmutableMap<bsv<?>, Float> a = ImmutableMap.builder()
      .put(bsv.B, 8.0F)
      .put(bsv.J, 12.0F)
      .put(bsv.ac, 8.0F)
      .put(bsv.ad, 12.0F)
      .put(bsv.aC, 15.0F)
      .put(bsv.aH, 12.0F)
      .put(bsv.bi, 8.0F)
      .put(bsv.bk, 10.0F)
      .put(bsv.bt, 10.0F)
      .put(bsv.bu, 8.0F)
      .put(bsv.bw, 8.0F)
      .build();

   @Override
   protected boolean a(btk $$0, btk $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(btk $$0, btk $$1) {
      float $$2 = (Float)a.get($$1.ak());
      return $$1.g((bsp)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cco<btk> b() {
      return cco.A;
   }

   private boolean b(btk $$0) {
      return a.containsKey($$0.ak());
   }
}
