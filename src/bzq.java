import com.google.common.collect.ImmutableMap;

public class bzq extends bxz<bwi> {
   private final bso c;
   private final float d;
   private final float e;
   private final float f;

   public bzq(bso $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cfk.n, cfl.b, cfk.Q, cfl.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(ash $$0, bwi $$1, long $$2) {
      bam $$3 = $$1.dZ();
      float $$4 = bae.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = bae.h($$1.dM() + 2.0F * $$3.i() * this.d - this.d);
      fby $$6 = fby.a($$4, $$5);
      $$1.ec().a(cfk.n, new byc($$1.bF().e($$6)));
      $$1.ec().a(cfk.Q, this.c.a($$3));
   }
}
