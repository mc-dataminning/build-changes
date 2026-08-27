import com.google.common.collect.ImmutableMap;

public class bmt extends bld<bjo> {
   private final bgj c;
   private final float d;
   private final float e;
   private final float f;

   public bmt(bgj $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bsn.n, bso.b, bsn.P, bso.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(akt $$0, bjo $$1, long $$2) {
      ash $$3 = $$1.ef();
      float $$4 = asb.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = asb.g($$1.dB() + 2.0F * $$3.i() * this.d - this.d);
      ehh $$6 = ehh.a($$4, $$5);
      $$1.dN().a(bsn.n, new blg($$1.bp().e($$6)));
      $$1.dN().a(bsn.P, this.c.a($$3));
   }
}
