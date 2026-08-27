import com.google.common.collect.ImmutableMap;

public class bmf extends bkp<bja> {
   private final bfv c;
   private final float d;
   private final float e;
   private final float f;

   public bmf(bfv $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(brz.n, bsa.b, brz.P, bsa.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(akk $$0, bja $$1, long $$2) {
      aru $$3 = $$1.ee();
      float $$4 = arp.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = arp.g($$1.dA() + 2.0F * $$3.i() * this.d - this.d);
      ehd $$6 = ehd.a($$4, $$5);
      $$1.dM().a(brz.n, new bks($$1.bp().e($$6)));
      $$1.dM().a(brz.P, this.c.a($$3));
   }
}
