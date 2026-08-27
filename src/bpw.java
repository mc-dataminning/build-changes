import com.google.common.collect.ImmutableMap;

public class bpw extends bof<bmq> {
   private final bjh c;
   private final float d;
   private final float e;
   private final float f;

   public bpw(bjh $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bvq.n, bvr.b, bvq.Q, bvr.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(ane $$0, bmq $$1, long $$2) {
      auw $$3 = $$1.eg();
      float $$4 = aup.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = aup.g($$1.dB() + 2.0F * $$3.i() * this.d - this.d);
      emc $$6 = emc.a($$4, $$5);
      $$1.dN().a(bvq.n, new boi($$1.br().e($$6)));
      $$1.dN().a(bvq.Q, this.c.a($$3));
   }
}
