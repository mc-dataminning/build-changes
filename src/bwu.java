import com.google.common.collect.ImmutableMap;

public class bwu extends bvd<btm> {
   private final bpu c;
   private final float d;
   private final float e;
   private final float f;

   public bwu(bpu $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cco.n, ccp.b, cco.Q, ccp.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(arb $$0, btm $$1, long $$2) {
      azc $$3 = $$1.el();
      float $$4 = ayu.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = ayu.g($$1.dF() + 2.0F * $$3.i() * this.d - this.d);
      evm $$6 = evm.a($$4, $$5);
      $$1.dS().a(cco.n, new bvg($$1.bx().e($$6)));
      $$1.dS().a(cco.Q, this.c.a($$3));
   }
}
