import com.google.common.collect.ImmutableMap;

public class cec extends cds {
   private static final ImmutableMap<bsz<?>, Float> a = ImmutableMap.builder()
      .put(bsz.B, 8.0F)
      .put(bsz.J, 12.0F)
      .put(bsz.ac, 8.0F)
      .put(bsz.ad, 12.0F)
      .put(bsz.aC, 15.0F)
      .put(bsz.aH, 12.0F)
      .put(bsz.bi, 8.0F)
      .put(bsz.bk, 10.0F)
      .put(bsz.bt, 10.0F)
      .put(bsz.bu, 8.0F)
      .put(bsz.bw, 8.0F)
      .build();

   @Override
   protected boolean a(bto $$0, bto $$1) {
      return this.b($$1) && this.e($$0, $$1);
   }

   private boolean e(bto $$0, bto $$1) {
      float $$2 = (Float)a.get($$1.ak());
      return $$1.g((bst)$$0) <= (double)($$2 * $$2);
   }

   @Override
   protected ccs<bto> b() {
      return ccs.A;
   }

   private boolean b(bto $$0) {
      return a.containsKey($$0.ak());
   }
}
