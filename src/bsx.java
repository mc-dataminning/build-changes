import com.google.common.collect.ImmutableMap;

public class bsx extends brg<bpq> {
   private final bmh c;
   private final float d;
   private final float e;
   private final float f;

   public bsx(bmh $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(byr.n, bys.b, byr.Q, bys.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(apf $$0, bpq $$1, long $$2) {
      axd $$3 = $$1.ei();
      float $$4 = aww.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = aww.g($$1.dC() + 2.0F * $$3.i() * this.d - this.d);
      epr $$6 = epr.a($$4, $$5);
      $$1.dP().a(byr.n, new brj($$1.bu().e($$6)));
      $$1.dP().a(byr.Q, this.c.a($$3));
   }
}
