import com.google.common.collect.ImmutableMap;

public class bwy extends bvh<btq> {
   private final bpy c;
   private final float d;
   private final float e;
   private final float f;

   public bwy(bpy $$0, float $$1, float $$2, float $$3) {
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

   protected void a(are $$0, btq $$1, long $$2) {
      azg $$3 = $$1.el();
      float $$4 = ayy.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = ayy.g($$1.dF() + 2.0F * $$3.i() * this.d - this.d);
      evq $$6 = evq.a($$4, $$5);
      $$1.dS().a(ccs.n, new bvk($$1.bx().e($$6)));
      $$1.dS().a(ccs.Q, this.c.a($$3));
   }
}
