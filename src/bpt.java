import com.google.common.collect.ImmutableMap;

public class bpt extends boc<bmn> {
   private final bjg c;
   private final float d;
   private final float e;
   private final float f;

   public bpt(bjg $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bvn.n, bvo.b, bvn.P, bvo.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(and $$0, bmn $$1, long $$2) {
      auv $$3 = $$1.eg();
      float $$4 = auo.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = auo.g($$1.dC() + 2.0F * $$3.i() * this.d - this.d);
      elt $$6 = elt.a($$4, $$5);
      $$1.dO().a(bvn.n, new bof($$1.br().e($$6)));
      $$1.dO().a(bvn.P, this.c.a($$3));
   }
}
