import com.google.common.collect.ImmutableMap;

public class btv extends btl {
   private static final ImmutableMap<bja<?>, Float> a = ImmutableMap.builder()
      .put(bja.y, 8.0F)
      .put(bja.G, 12.0F)
      .put(bja.Z, 8.0F)
      .put(bja.aa, 12.0F)
      .put(bja.ay, 15.0F)
      .put(bja.aD, 12.0F)
      .put(bja.be, 8.0F)
      .put(bja.bg, 10.0F)
      .put(bja.bo, 10.0F)
      .put(bja.bp, 8.0F)
      .put(bja.br, 8.0F)
      .build();

   @Override
   protected boolean a(bjm $$0, bjm $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bjm $$0, bjm $$1) {
      float $$2 = (Float)a.get($$1.ag());
      return $$1.f((biw)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bsn<bjm> b() {
      return bsn.A;
   }

   private boolean b(bjm $$0) {
      return a.containsKey($$0.ag());
   }
}
