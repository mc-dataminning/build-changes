import com.google.common.collect.ImmutableMap;

public class byp extends bwy<bvh> {
   private final brn c;
   private final float d;
   private final float e;
   private final float f;

   public byp(brn $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cej.n, cek.b, cej.Q, cek.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(arc $$0, bvh $$1, long $$2) {
      azg $$3 = $$1.dZ();
      float $$4 = ayy.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = ayy.h($$1.dM() + 2.0F * $$3.i() * this.d - this.d);
      fay $$6 = fay.a($$4, $$5);
      $$1.ec().a(cej.n, new bxb($$1.bF().e($$6)));
      $$1.ec().a(cej.Q, this.c.a($$3));
   }
}
