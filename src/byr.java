import com.google.common.collect.ImmutableMap;

public class byr extends bxa<bvj> {
   private final brp c;
   private final float d;
   private final float e;
   private final float f;

   public byr(brp $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cel.n, cem.b, cel.Q, cem.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(arp $$0, bvj $$1, long $$2) {
      azu $$3 = $$1.dY();
      float $$4 = azm.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = azm.h($$1.dL() + 2.0F * $$3.i() * this.d - this.d);
      ezy $$6 = ezy.a($$4, $$5);
      $$1.eb().a(cel.n, new bxd($$1.bF().e($$6)));
      $$1.eb().a(cel.Q, this.c.a($$3));
   }
}
