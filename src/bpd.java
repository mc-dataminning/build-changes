import com.google.common.collect.ImmutableMap;

public class bpd extends bnm<blx> {
   private final biq c;
   private final float d;
   private final float e;
   private final float f;

   public bpd(biq $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bux.n, buy.b, bux.P, buy.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(amp $$0, blx $$1, long $$2) {
      auf $$3 = $$1.eg();
      float $$4 = aty.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = aty.g($$1.dC() + 2.0F * $$3.i() * this.d - this.d);
      elb $$6 = elb.a($$4, $$5);
      $$1.dO().a(bux.n, new bnp($$1.br().e($$6)));
      $$1.dO().a(bux.P, this.c.a($$3));
   }
}
