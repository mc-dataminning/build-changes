import com.google.common.collect.ImmutableMap;

public class bwy extends bvh<btp> {
   private final bpw c;
   private final float d;
   private final float e;
   private final float f;

   public bwy(bpw $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(ccs.n, cct.b, ccs.Q, cct.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aqu $$0, btp $$1, long $$2) {
      ayw $$3 = $$1.dR();
      float $$4 = ayo.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = ayo.g($$1.dE() + 2.0F * $$3.i() * this.d - this.d);
      exc $$6 = exc.a($$4, $$5);
      $$1.dT().a(ccs.n, new bvk($$1.by().e($$6)));
      $$1.dT().a(ccs.Q, this.c.a($$3));
   }
}
