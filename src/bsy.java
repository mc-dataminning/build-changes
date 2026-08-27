import com.google.common.collect.ImmutableMap;

public class bsy extends brh<bpr> {
   private final bmi c;
   private final float d;
   private final float e;
   private final float f;

   public bsy(bmi $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bys.n, byt.b, bys.Q, byt.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(apf $$0, bpr $$1, long $$2) {
      axd $$3 = $$1.ei();
      float $$4 = aww.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = aww.g($$1.dC() + 2.0F * $$3.i() * this.d - this.d);
      ept $$6 = ept.a($$4, $$5);
      $$1.dP().a(bys.n, new brk($$1.bu().e($$6)));
      $$1.dP().a(bys.Q, this.c.a($$3));
   }
}
