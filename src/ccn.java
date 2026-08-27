import com.google.common.collect.ImmutableMap;

public class ccn extends ccd {
   private static final ImmutableMap<brn<?>, Float> a = ImmutableMap.builder()
      .put(brn.B, 8.0F)
      .put(brn.J, 12.0F)
      .put(brn.ac, 8.0F)
      .put(brn.ad, 12.0F)
      .put(brn.aB, 15.0F)
      .put(brn.aG, 12.0F)
      .put(brn.bh, 8.0F)
      .put(brn.bj, 10.0F)
      .put(brn.bs, 10.0F)
      .put(brn.bt, 8.0F)
      .put(brn.bv, 8.0F)
      .build();

   @Override
   protected boolean a(bsa $$0, bsa $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bsa $$0, bsa $$1) {
      float $$2 = (Float)a.get($$1.ai());
      return $$1.g((brh)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cbd<bsa> b() {
      return cbd.A;
   }

   private boolean b(bsa $$0) {
      return a.containsKey($$0.ai());
   }
}
