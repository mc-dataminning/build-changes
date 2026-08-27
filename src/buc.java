import com.google.common.collect.ImmutableMap;

public class buc extends bsl<bqv> {
   private final bnk c;
   private final float d;
   private final float e;
   private final float f;

   public buc(bnk $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bzw.n, bzx.b, bzw.Q, bzx.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(apu $$0, bqv $$1, long $$2) {
      axt $$3 = $$1.ei();
      float $$4 = axm.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = axm.g($$1.dC() + 2.0F * $$3.i() * this.d - this.d);
      esj $$6 = esj.a($$4, $$5);
      $$1.dP().a(bzw.n, new bso($$1.bu().e($$6)));
      $$1.dP().a(bzw.Q, this.c.a($$3));
   }
}
