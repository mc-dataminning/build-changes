import com.google.common.collect.ImmutableMap;

public class cbe extends bzn<bxy> {
   private final bty c;
   private final float d;
   private final float e;
   private final float f;

   public cbe(bty $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cgy.o, cgz.b, cgy.R, cgz.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aru $$0, bxy $$1, long $$2) {
      azz $$3 = $$1.dY();
      float $$4 = azq.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = azq.h($$1.dL() + 2.0F * $$3.i() * this.d - this.d);
      ffs $$6 = ffs.a($$4, $$5);
      $$1.ec().a(cgy.o, new bzq($$1.bD().e($$6)));
      $$1.ec().a(cgy.R, this.c.a($$3));
   }
}
