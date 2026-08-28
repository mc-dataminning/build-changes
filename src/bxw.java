import com.google.common.collect.ImmutableMap;

public class bxw extends bwf<bup> {
   private final bqx c;
   private final float d;
   private final float e;
   private final float f;

   public bxw(bqx $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cdq.n, cdr.b, cdq.Q, cdr.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(arj $$0, bup $$1, long $$2) {
      azn $$3 = $$1.dV();
      float $$4 = azf.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = azf.h($$1.dI() + 2.0F * $$3.i() * this.d - this.d);
      eyw $$6 = eyw.a($$4, $$5);
      $$1.dY().a(cdq.n, new bwi($$1.bC().e($$6)));
      $$1.dY().a(cdq.Q, this.c.a($$3));
   }
}
