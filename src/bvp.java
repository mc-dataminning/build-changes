import com.google.common.collect.ImmutableMap;

public class bvp extends bvf {
   private static final ImmutableMap<bku<?>, Float> a = ImmutableMap.builder()
      .put(bku.y, 8.0F)
      .put(bku.G, 12.0F)
      .put(bku.Z, 8.0F)
      .put(bku.aa, 12.0F)
      .put(bku.ay, 15.0F)
      .put(bku.aD, 12.0F)
      .put(bku.be, 8.0F)
      .put(bku.bg, 10.0F)
      .put(bku.bo, 10.0F)
      .put(bku.bp, 8.0F)
      .put(bku.br, 8.0F)
      .build();

   @Override
   protected boolean a(blg $$0, blg $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(blg $$0, blg $$1) {
      float $$2 = (Float)a.get($$1.ai());
      return $$1.f((bkq)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected buh<blg> b() {
      return buh.A;
   }

   private boolean b(blg $$0) {
      return a.containsKey($$0.ai());
   }
}
