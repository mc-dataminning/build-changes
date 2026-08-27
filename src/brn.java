import com.google.common.collect.ImmutableMap;

public class brn extends bpw<boi> {
   private final bkz c;
   private final float d;
   private final float e;
   private final float f;

   public brn(bkz $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bxh.n, bxi.b, bxh.Q, bxi.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aov $$0, boi $$1, long $$2) {
      awo $$3 = $$1.eh();
      float $$4 = awh.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = awh.g($$1.dC() + 2.0F * $$3.i() * this.d - this.d);
      ens $$6 = ens.a($$4, $$5);
      $$1.dO().a(bxh.n, new bpz($$1.br().e($$6)));
      $$1.dO().a(bxh.Q, this.c.a($$3));
   }
}
