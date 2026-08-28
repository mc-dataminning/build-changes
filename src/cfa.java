import com.google.common.collect.ImmutableMap;

public class cfa extends ceq {
   private static final ImmutableMap<bty<?>, Float> a = ImmutableMap.builder()
      .put(bty.B, 8.0F)
      .put(bty.J, 12.0F)
      .put(bty.ac, 8.0F)
      .put(bty.ad, 12.0F)
      .put(bty.aC, 15.0F)
      .put(bty.aH, 12.0F)
      .put(bty.bi, 8.0F)
      .put(bty.bk, 10.0F)
      .put(bty.bt, 10.0F)
      .put(bty.bu, 8.0F)
      .put(bty.bw, 8.0F)
      .build();

   @Override
   protected boolean a(bun $$0, bun $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bun $$0, bun $$1) {
      float $$2 = (Float)a.get($$1.ao());
      return $$1.g((btr)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cdq<bun> b() {
      return cdq.A;
   }

   private boolean b(bun $$0) {
      return a.containsKey($$0.ao());
   }
}
