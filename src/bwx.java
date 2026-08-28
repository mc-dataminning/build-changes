import com.google.common.collect.ImmutableMap;

public class bwx extends bvg<btp> {
   private final bpx c;
   private final float d;
   private final float e;
   private final float f;

   public bwx(bpx $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(ccr.n, ccs.b, ccr.Q, ccs.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(are $$0, btp $$1, long $$2) {
      azf $$3 = $$1.el();
      float $$4 = ayx.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = ayx.g($$1.dF() + 2.0F * $$3.i() * this.d - this.d);
      evp $$6 = evp.a($$4, $$5);
      $$1.dS().a(ccr.n, new bvj($$1.bx().e($$6)));
      $$1.dS().a(ccr.Q, this.c.a($$3));
   }
}
