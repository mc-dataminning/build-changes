import com.google.common.collect.ImmutableMap;

public class cfo extends cfe {
   private static final ImmutableMap<bul<?>, Float> a = ImmutableMap.builder()
      .put(bul.B, 8.0F)
      .put(bul.J, 12.0F)
      .put(bul.ac, 8.0F)
      .put(bul.ad, 12.0F)
      .put(bul.aC, 15.0F)
      .put(bul.aH, 12.0F)
      .put(bul.bi, 8.0F)
      .put(bul.bk, 10.0F)
      .put(bul.bt, 10.0F)
      .put(bul.bu, 8.0F)
      .put(bul.bw, 8.0F)
      .build();

   @Override
   protected boolean a(bva $$0, bva $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bva $$0, bva $$1) {
      float $$2 = (Float)a.get($$1.ar());
      return $$1.g((bue)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected cee<bva> b() {
      return cee.A;
   }

   private boolean b(bva $$0) {
      return a.containsKey($$0.ar());
   }
}
