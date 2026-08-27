import com.google.common.collect.ImmutableMap;

public class bzk extends bza {
   private static final ImmutableMap<bol<?>, Float> a = ImmutableMap.builder()
      .put(bol.A, 8.0F)
      .put(bol.I, 12.0F)
      .put(bol.ab, 8.0F)
      .put(bol.ac, 12.0F)
      .put(bol.aA, 15.0F)
      .put(bol.aF, 12.0F)
      .put(bol.bg, 8.0F)
      .put(bol.bi, 10.0F)
      .put(bol.br, 10.0F)
      .put(bol.bs, 8.0F)
      .put(bol.bu, 8.0F)
      .build();

   @Override
   protected boolean a(box $$0, box $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(box $$0, box $$1) {
      float $$2 = (Float)a.get($$1.ai());
      return $$1.f((bof)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bya<box> b() {
      return bya.A;
   }

   private boolean b(box $$0) {
      return a.containsKey($$0.ai());
   }
}
