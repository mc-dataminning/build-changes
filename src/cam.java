import com.google.common.collect.ImmutableMap;

public class cam extends byv<bxg> {
   private final bti c;
   private final float d;
   private final float e;
   private final float f;

   public cam(bti $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cgg.o, cgh.b, cgg.R, cgh.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(arq $$0, bxg $$1, long $$2) {
      azv $$3 = $$1.dY();
      float $$4 = azm.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = azm.h($$1.dL() + 2.0F * $$3.i() * this.d - this.d);
      feq $$6 = feq.a($$4, $$5);
      $$1.ec().a(cgg.o, new byy($$1.bE().e($$6)));
      $$1.ec().a(cgg.R, this.c.a($$3));
   }
}
