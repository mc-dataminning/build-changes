import com.google.common.collect.ImmutableMap;

public class bww extends bvf<btn> {
   private final bpv c;
   private final float d;
   private final float e;
   private final float f;

   public bww(bpv $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(ccq.n, ccr.b, ccq.Q, ccr.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aqt $$0, btn $$1, long $$2) {
      ayv $$3 = $$1.dT();
      float $$4 = ayn.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = ayn.g($$1.dG() + 2.0F * $$3.i() * this.d - this.d);
      eww $$6 = eww.a($$4, $$5);
      $$1.dU().a(ccq.n, new bvi($$1.by().e($$6)));
      $$1.dU().a(ccq.Q, this.c.a($$3));
   }
}
