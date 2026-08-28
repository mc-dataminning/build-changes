import com.google.common.collect.ImmutableMap;

public class bwz extends bvi<btr> {
   private final bpz c;
   private final float d;
   private final float e;
   private final float f;

   public bwz(bpz $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cct.n, ccu.b, cct.Q, ccu.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(arf $$0, btr $$1, long $$2) {
      azh $$3 = $$1.el();
      float $$4 = ayz.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = ayz.g($$1.dF() + 2.0F * $$3.i() * this.d - this.d);
      evr $$6 = evr.a($$4, $$5);
      $$1.dS().a(cct.n, new bvl($$1.bx().e($$6)));
      $$1.dS().a(cct.Q, this.c.a($$3));
   }
}
