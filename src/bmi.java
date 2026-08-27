import com.google.common.collect.ImmutableMap;

public class bmi extends bks<bjd> {
   private final bfy c;
   private final float d;
   private final float e;
   private final float f;

   public bmi(bfy $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bsc.n, bsd.b, bsc.P, bsd.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(akn $$0, bjd $$1, long $$2) {
      arx $$3 = $$1.ee();
      float $$4 = ars.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = ars.g($$1.dA() + 2.0F * $$3.i() * this.d - this.d);
      ehi $$6 = ehi.a($$4, $$5);
      $$1.dM().a(bsc.n, new bkv($$1.bp().e($$6)));
      $$1.dM().a(bsc.P, this.c.a($$3));
   }
}
