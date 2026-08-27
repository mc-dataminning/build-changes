import com.google.common.collect.ImmutableMap;

public class btx extends bsg<bqq> {
   private final bnf c;
   private final float d;
   private final float e;
   private final float f;

   public btx(bnf $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bzr.n, bzs.b, bzr.Q, bzs.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aps $$0, bqq $$1, long $$2) {
      axr $$3 = $$1.ei();
      float $$4 = axk.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = axk.g($$1.dC() + 2.0F * $$3.i() * this.d - this.d);
      esa $$6 = esa.a($$4, $$5);
      $$1.dP().a(bzr.n, new bsj($$1.bu().e($$6)));
      $$1.dP().a(bzr.Q, this.c.a($$3));
   }
}
