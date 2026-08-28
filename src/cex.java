import com.google.common.collect.ImmutableMap;

public class cex extends cen {
   private static final ImmutableMap<btv<?>, Float> a = ImmutableMap.builder()
      .put(btv.B, 8.0F)
      .put(btv.J, 12.0F)
      .put(btv.ac, 8.0F)
      .put(btv.ad, 12.0F)
      .put(btv.aC, 15.0F)
      .put(btv.aH, 12.0F)
      .put(btv.bi, 8.0F)
      .put(btv.bk, 10.0F)
      .put(btv.bt, 10.0F)
      .put(btv.bu, 8.0F)
      .put(btv.bw, 8.0F)
      .build();

   @Override
   protected boolean a(buk $$0, buk $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(buk $$0, buk $$1) {
      float $$2 = (Float)a.get($$1.ao());
      return $$1.g((bto)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cdn<buk> b() {
      return cdn.A;
   }

   private boolean b(buk $$0) {
      return a.containsKey($$0.ao());
   }
}
