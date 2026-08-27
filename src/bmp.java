import com.google.common.collect.ImmutableMap;

public class bmp extends bkz<bjk> {
   private final bgf c;
   private final float d;
   private final float e;
   private final float f;

   public bmp(bgf $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bsj.n, bsk.b, bsj.P, bsk.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aks $$0, bjk $$1, long $$2) {
      ase $$3 = $$1.ef();
      float $$4 = ary.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = ary.g($$1.dB() + 2.0F * $$3.i() * this.d - this.d);
      ehp $$6 = ehp.a($$4, $$5);
      $$1.dN().a(bsj.n, new blc($$1.bp().e($$6)));
      $$1.dN().a(bsj.P, this.c.a($$3));
   }
}
