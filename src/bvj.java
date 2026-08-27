import com.google.common.collect.ImmutableMap;

public class bvj extends bts<bsc> {
   private final bor c;
   private final float d;
   private final float e;
   private final float f;

   public bvj(bor $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cbd.n, cbe.b, cbd.Q, cbe.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aqh $$0, bsc $$1, long $$2) {
      ayg $$3 = $$1.ej();
      float $$4 = axz.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = axz.g($$1.dD() + 2.0F * $$3.i() * this.d - this.d);
      etp $$6 = etp.a($$4, $$5);
      $$1.dQ().a(cbd.n, new btv($$1.bv().e($$6)));
      $$1.dQ().a(cbd.Q, this.c.a($$3));
   }
}
