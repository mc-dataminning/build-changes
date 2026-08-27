import com.google.common.collect.ImmutableMap;

public class bqj extends bpz {
   private static final ImmutableMap<bfn<?>, Float> a = ImmutableMap.builder()
      .put(bfn.y, 8.0F)
      .put(bfn.G, 12.0F)
      .put(bfn.Z, 8.0F)
      .put(bfn.aa, 12.0F)
      .put(bfn.ay, 15.0F)
      .put(bfn.aD, 12.0F)
      .put(bfn.be, 8.0F)
      .put(bfn.bg, 10.0F)
      .put(bfn.bo, 10.0F)
      .put(bfn.bp, 8.0F)
      .put(bfn.br, 8.0F)
      .build();

   @Override
   protected boolean a(bfz $$0, bfz $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bfz $$0, bfz $$1) {
      float $$2 = (Float)a.get($$1.ae());
      return $$1.f((bfj)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bpb<bfz> b() {
      return bpb.A;
   }

   private boolean b(bfz $$0) {
      return a.containsKey($$0.ae());
   }
}
