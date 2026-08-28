import com.google.common.collect.ImmutableMap;

public class byk extends bwt<bvc> {
   private final bri c;
   private final float d;
   private final float e;
   private final float f;

   public byk(bri $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cee.n, cef.b, cee.Q, cef.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(arn $$0, bvc $$1, long $$2) {
      azs $$3 = $$1.ea();
      float $$4 = azk.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = azk.h($$1.dN() + 2.0F * $$3.i() * this.d - this.d);
      ezn $$6 = ezn.a($$4, $$5);
      $$1.ed().a(cee.n, new bww($$1.bG().e($$6)));
      $$1.ed().a(cee.Q, this.c.a($$3));
   }
}
