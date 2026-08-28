import com.google.common.collect.ImmutableMap;

public class cea extends cdq {
   private static final ImmutableMap<bsw<?>, Float> a = ImmutableMap.builder()
      .put(bsw.B, 8.0F)
      .put(bsw.J, 12.0F)
      .put(bsw.ac, 8.0F)
      .put(bsw.ad, 12.0F)
      .put(bsw.aC, 15.0F)
      .put(bsw.aH, 12.0F)
      .put(bsw.bi, 8.0F)
      .put(bsw.bk, 10.0F)
      .put(bsw.bt, 10.0F)
      .put(bsw.bu, 8.0F)
      .put(bsw.bw, 8.0F)
      .build();

   @Override
   protected boolean a(btl $$0, btl $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(btl $$0, btl $$1) {
      float $$2 = (Float)a.get($$1.am());
      return $$1.g((bsq)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected ccq<btl> b() {
      return ccq.A;
   }

   private boolean b(btl $$0) {
      return a.containsKey($$0.am());
   }
}
