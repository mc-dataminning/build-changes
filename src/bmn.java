import com.google.common.collect.ImmutableMap;

public class bmn extends bkx<bji> {
   private final bgd c;
   private final float d;
   private final float e;
   private final float f;

   public bmn(bgd $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bsh.n, bsi.b, bsh.P, bsi.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(akr $$0, bji $$1, long $$2) {
      asc $$3 = $$1.ef();
      float $$4 = arx.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = arx.g($$1.dB() + 2.0F * $$3.i() * this.d - this.d);
      ehn $$6 = ehn.a($$4, $$5);
      $$1.dN().a(bsh.n, new bla($$1.bp().e($$6)));
      $$1.dN().a(bsh.P, this.c.a($$3));
   }
}
