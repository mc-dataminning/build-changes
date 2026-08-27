import com.google.common.collect.ImmutableMap;

public class bun extends bsw<brg> {
   private final bnv c;
   private final float d;
   private final float e;
   private final float f;

   public bun(bnv $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cah.n, cai.b, cah.Q, cai.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aqe $$0, brg $$1, long $$2) {
      ayd $$3 = $$1.ej();
      float $$4 = axw.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = axw.g($$1.dD() + 2.0F * $$3.i() * this.d - this.d);
      etf $$6 = etf.a($$4, $$5);
      $$1.dQ().a(cah.n, new bsz($$1.bv().e($$6)));
      $$1.dQ().a(cah.Q, this.c.a($$3));
   }
}
