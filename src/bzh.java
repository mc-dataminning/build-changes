import com.google.common.collect.ImmutableMap;

public class bzh extends bxq<bvz> {
   private final bsf c;
   private final float d;
   private final float e;
   private final float f;

   public bzh(bsf $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cfb.n, cfc.b, cfb.Q, cfc.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(arx $$0, bvz $$1, long $$2) {
      bac $$3 = $$1.dZ();
      float $$4 = azu.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = azu.h($$1.dM() + 2.0F * $$3.i() * this.d - this.d);
      fbr $$6 = fbr.a($$4, $$5);
      $$1.ec().a(cfb.n, new bxt($$1.bF().e($$6)));
      $$1.ec().a(cfb.Q, this.c.a($$3));
   }
}
