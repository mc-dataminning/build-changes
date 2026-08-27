import com.google.common.collect.ImmutableMap;

public class cab extends bzr {
   private static final ImmutableMap<bpc<?>, Float> a = ImmutableMap.builder()
      .put(bpc.B, 8.0F)
      .put(bpc.J, 12.0F)
      .put(bpc.ac, 8.0F)
      .put(bpc.ad, 12.0F)
      .put(bpc.aB, 15.0F)
      .put(bpc.aG, 12.0F)
      .put(bpc.bh, 8.0F)
      .put(bpc.bj, 10.0F)
      .put(bpc.bs, 10.0F)
      .put(bpc.bt, 8.0F)
      .put(bpc.bv, 8.0F)
      .build();

   @Override
   protected boolean a(bpo $$0, bpo $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bpo $$0, bpo $$1) {
      float $$2 = (Float)a.get($$1.ai());
      return $$1.g((bow)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected byr<bpo> b() {
      return byr.A;
   }

   private boolean b(bpo $$0) {
      return a.containsKey($$0.ai());
   }
}
