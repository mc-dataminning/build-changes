import com.google.common.collect.ImmutableMap;

public class cdm extends cdc {
   private static final ImmutableMap<bsj<?>, Float> a = ImmutableMap.builder()
      .put(bsj.B, 8.0F)
      .put(bsj.J, 12.0F)
      .put(bsj.ac, 8.0F)
      .put(bsj.ad, 12.0F)
      .put(bsj.aC, 15.0F)
      .put(bsj.aH, 12.0F)
      .put(bsj.bi, 8.0F)
      .put(bsj.bk, 10.0F)
      .put(bsj.bt, 10.0F)
      .put(bsj.bu, 8.0F)
      .put(bsj.bw, 8.0F)
      .build();

   @Override
   protected boolean a(bsy $$0, bsy $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bsy $$0, bsy $$1) {
      float $$2 = (Float)a.get($$1.ak());
      return $$1.g((bsd)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected ccc<bsy> b() {
      return ccc.A;
   }

   private boolean b(bsy $$0) {
      return a.containsKey($$0.ak());
   }
}
