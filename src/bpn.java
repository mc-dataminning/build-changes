import com.google.common.collect.ImmutableMap;

public class bpn extends bnw<bmh> {
   private final bja c;
   private final float d;
   private final float e;
   private final float f;

   public bpn(bja $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bvh.n, bvi.b, bvh.P, bvi.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(amz $$0, bmh $$1, long $$2) {
      aup $$3 = $$1.eg();
      float $$4 = aui.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = aui.g($$1.dC() + 2.0F * $$3.i() * this.d - this.d);
      elm $$6 = elm.a($$4, $$5);
      $$1.dO().a(bvh.n, new bnz($$1.br().e($$6)));
      $$1.dO().a(bvh.P, this.c.a($$3));
   }
}
