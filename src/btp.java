import com.google.common.collect.ImmutableMap;

public class btp extends btf {
   private static final ImmutableMap<biu<?>, Float> a = ImmutableMap.builder()
      .put(biu.y, 8.0F)
      .put(biu.G, 12.0F)
      .put(biu.Z, 8.0F)
      .put(biu.aa, 12.0F)
      .put(biu.ay, 15.0F)
      .put(biu.aD, 12.0F)
      .put(biu.be, 8.0F)
      .put(biu.bg, 10.0F)
      .put(biu.bo, 10.0F)
      .put(biu.bp, 8.0F)
      .put(biu.br, 8.0F)
      .build();

   @Override
   protected boolean a(bjg $$0, bjg $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bjg $$0, bjg $$1) {
      float $$2 = (Float)a.get($$1.ag());
      return $$1.f((biq)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bsh<bjg> b() {
      return bsh.A;
   }

   private boolean b(bjg $$0) {
      return a.containsKey($$0.ag());
   }
}
