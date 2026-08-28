import com.google.common.collect.ImmutableMap;

public class bys extends bxb<bvk> {
   private final brq c;
   private final float d;
   private final float e;
   private final float f;

   public bys(brq $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cem.n, cen.b, cem.Q, cen.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(ard $$0, bvk $$1, long $$2) {
      azh $$3 = $$1.dY();
      float $$4 = ayz.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = ayz.h($$1.dL() + 2.0F * $$3.i() * this.d - this.d);
      fbb $$6 = fbb.a($$4, $$5);
      $$1.eb().a(cem.n, new bxe($$1.bF().e($$6)));
      $$1.eb().a(cem.Q, this.c.a($$3));
   }
}
