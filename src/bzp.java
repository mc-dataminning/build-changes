import com.google.common.collect.ImmutableMap;

public class bzp extends bxy<bwh> {
   private final bsn c;
   private final float d;
   private final float e;
   private final float f;

   public bzp(bsn $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cfj.n, cfk.b, cfj.Q, cfk.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(ash $$0, bwh $$1, long $$2) {
      bam $$3 = $$1.dY();
      float $$4 = bae.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = bae.h($$1.dL() + 2.0F * $$3.i() * this.d - this.d);
      fbx $$6 = fbx.a($$4, $$5);
      $$1.eb().a(cfj.n, new byb($$1.bF().e($$6)));
      $$1.eb().a(cfj.Q, this.c.a($$3));
   }
}
