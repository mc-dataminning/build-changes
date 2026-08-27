import com.google.common.collect.ImmutableMap;

public class brr extends bqa<bok> {
   private final blb c;
   private final float d;
   private final float e;
   private final float f;

   public brr(blb $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bxl.n, bxm.b, bxl.Q, bxm.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aow $$0, bok $$1, long $$2) {
      awp $$3 = $$1.eh();
      float $$4 = awi.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = awi.g($$1.dC() + 2.0F * $$3.i() * this.d - this.d);
      enz $$6 = enz.a($$4, $$5);
      $$1.dO().a(bxl.n, new bqd($$1.br().e($$6)));
      $$1.dO().a(bxl.Q, this.c.a($$3));
   }
}
