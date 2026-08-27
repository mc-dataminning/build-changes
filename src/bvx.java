import com.google.common.collect.ImmutableMap;

public class bvx extends bug<bsq> {
   private final bpf c;
   private final float d;
   private final float e;
   private final float f;

   public bvx(bpf $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cbr.n, cbs.b, cbr.Q, cbs.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aqt $$0, bsq $$1, long $$2) {
      ayt $$3 = $$1.et();
      float $$4 = aym.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = aym.g($$1.dK() + 2.0F * $$3.i() * this.d - this.d);
      ewu $$6 = ewu.a($$4, $$5);
      $$1.dZ().a(cbr.n, new buj($$1.bC().e($$6)));
      $$1.dZ().a(cbr.Q, this.c.a($$3));
   }
}
