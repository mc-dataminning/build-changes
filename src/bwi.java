import com.google.common.collect.ImmutableMap;

public class bwi extends bur<bta> {
   private final bpi c;
   private final float d;
   private final float e;
   private final float f;

   public bwi(bpi $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(ccc.n, ccd.b, ccc.Q, ccd.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aqk $$0, bta $$1, long $$2) {
      aym $$3 = $$1.dS();
      float $$4 = aye.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = aye.g($$1.dF() + 2.0F * $$3.i() * this.d - this.d);
      evz $$6 = evz.a($$4, $$5);
      $$1.dT().a(ccc.n, new buu($$1.bx().e($$6)));
      $$1.dT().a(ccc.Q, this.c.a($$3));
   }
}
