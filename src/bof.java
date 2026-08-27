import com.google.common.collect.ImmutableMap;

public class bof extends bmp<bla> {
   private final bhv c;
   private final float d;
   private final float e;
   private final float f;

   public bof(bhv $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(btz.n, bua.b, btz.P, bua.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(ama $$0, bla $$1, long $$2) {
      ato $$3 = $$1.ef();
      float $$4 = ati.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = ati.g($$1.dB() + 2.0F * $$3.i() * this.d - this.d);
      eji $$6 = eji.a($$4, $$5);
      $$1.dN().a(btz.n, new bms($$1.bp().e($$6)));
      $$1.dN().a(btz.P, this.c.a($$3));
   }
}
