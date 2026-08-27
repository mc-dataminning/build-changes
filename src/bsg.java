import com.google.common.collect.ImmutableMap;

public class bsg extends bqp<boz> {
   private final blq c;
   private final float d;
   private final float e;
   private final float f;

   public bsg(blq $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bya.n, byb.b, bya.Q, byb.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(apa $$0, boz $$1, long $$2) {
      awt $$3 = $$1.ef();
      float $$4 = awm.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = awm.g($$1.dz() + 2.0F * $$3.i() * this.d - this.d);
      eov $$6 = eov.a($$4, $$5);
      $$1.dM().a(bya.n, new bqs($$1.br().e($$6)));
      $$1.dM().a(bya.Q, this.c.a($$3));
   }
}
