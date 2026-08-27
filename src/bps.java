import com.google.common.collect.ImmutableMap;

public class bps extends bob<bmm> {
   private final bjf c;
   private final float d;
   private final float e;
   private final float f;

   public bps(bjf $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bvm.n, bvn.b, bvm.P, bvn.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(and $$0, bmm $$1, long $$2) {
      auu $$3 = $$1.eg();
      float $$4 = aun.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = aun.g($$1.dC() + 2.0F * $$3.i() * this.d - this.d);
      els $$6 = els.a($$4, $$5);
      $$1.dO().a(bvm.n, new boe($$1.br().e($$6)));
      $$1.dO().a(bvm.P, this.c.a($$3));
   }
}
