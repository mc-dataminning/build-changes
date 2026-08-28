import com.google.common.collect.ImmutableMap;

public class bzz extends byi<bwt> {
   private final bsv c;
   private final float d;
   private final float e;
   private final float f;

   public bzz(bsv $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cft.o, cfu.b, cft.R, cfu.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(arn $$0, bwt $$1, long $$2) {
      azs $$3 = $$1.dY();
      float $$4 = azk.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = azk.h($$1.dL() + 2.0F * $$3.i() * this.d - this.d);
      fcu $$6 = fcu.a($$4, $$5);
      $$1.eb().a(cft.o, new byl($$1.bE().e($$6)));
      $$1.eb().a(cft.R, this.c.a($$3));
   }
}
