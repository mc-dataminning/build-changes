import com.google.common.collect.ImmutableMap;

public class cac extends bzs {
   private static final ImmutableMap<bpd<?>, Float> a = ImmutableMap.builder()
      .put(bpd.C, 8.0F)
      .put(bpd.K, 12.0F)
      .put(bpd.ad, 8.0F)
      .put(bpd.ae, 12.0F)
      .put(bpd.aC, 15.0F)
      .put(bpd.aH, 12.0F)
      .put(bpd.bi, 8.0F)
      .put(bpd.bk, 10.0F)
      .put(bpd.bt, 10.0F)
      .put(bpd.bu, 8.0F)
      .put(bpd.bw, 8.0F)
      .build();

   @Override
   protected boolean a(bpp $$0, bpp $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bpp $$0, bpp $$1) {
      float $$2 = (Float)a.get($$1.ai());
      return $$1.g((box)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected bys<bpp> b() {
      return bys.A;
   }

   private boolean b(bpp $$0) {
      return a.containsKey($$0.ai());
   }
}
