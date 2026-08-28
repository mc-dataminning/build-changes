import com.google.common.collect.ImmutableMap;

public class car extends bza<bxl> {
   private final btl c;
   private final float d;
   private final float e;
   private final float f;

   public car(btl $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cgl.o, cgm.b, cgl.R, cgm.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(arq $$0, bxl $$1, long $$2) {
      azv $$3 = $$1.dX();
      float $$4 = azm.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = azm.h($$1.dK() + 2.0F * $$3.i() * this.d - this.d);
      ffc $$6 = ffc.a($$4, $$5);
      $$1.eb().a(cgl.o, new bzd($$1.bC().e($$6)));
      $$1.eb().a(cgl.R, this.c.a($$3));
   }
}
