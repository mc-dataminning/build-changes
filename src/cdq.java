import com.google.common.collect.ImmutableMap;

public class cdq extends cdg {
   private static final ImmutableMap<bsn<?>, Float> a = ImmutableMap.builder()
      .put(bsn.B, 8.0F)
      .put(bsn.J, 12.0F)
      .put(bsn.ac, 8.0F)
      .put(bsn.ad, 12.0F)
      .put(bsn.aC, 15.0F)
      .put(bsn.aH, 12.0F)
      .put(bsn.bi, 8.0F)
      .put(bsn.bk, 10.0F)
      .put(bsn.bt, 10.0F)
      .put(bsn.bu, 8.0F)
      .put(bsn.bw, 8.0F)
      .build();

   @Override
   protected boolean a(btc $$0, btc $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(btc $$0, btc $$1) {
      float $$2 = (Float)a.get($$1.am());
      return $$1.g((bsh)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected ccg<btc> b() {
      return ccg.A;
   }

   private boolean b(btc $$0) {
      return a.containsKey($$0.am());
   }
}
