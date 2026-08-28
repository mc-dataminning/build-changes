import com.google.common.collect.ImmutableMap;

public class bzi extends bxr<bwa> {
   private final bsd c;
   private final float d;
   private final float e;
   private final float f;

   public bzi(bsd $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cfc.n, cfd.b, cfc.Q, cfd.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(ard $$0, bwa $$1, long $$2) {
      azh $$3 = $$1.dX();
      float $$4 = ayz.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = ayz.h($$1.dK() + 2.0F * $$3.i() * this.d - this.d);
      fbx $$6 = fbx.a($$4, $$5);
      $$1.ea().a(cfc.n, new bxu($$1.bD().e($$6)));
      $$1.ea().a(cfc.Q, this.c.a($$3));
   }
}
