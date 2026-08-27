import com.google.common.collect.ImmutableMap;

public class bme extends bko<biy> {
   private final bft c;
   private final float d;
   private final float e;
   private final float f;

   public bme(bft $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bry.n, brz.b, bry.P, brz.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aki $$0, biy $$1, long $$2) {
      art $$3 = $$1.ee();
      float $$4 = aro.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = aro.g($$1.dA() + 2.0F * $$3.i() * this.d - this.d);
      ehf $$6 = ehf.a($$4, $$5);
      $$1.dM().a(bry.n, new bkr($$1.bp().e($$6)));
      $$1.dM().a(bry.P, this.c.a($$3));
   }
}
