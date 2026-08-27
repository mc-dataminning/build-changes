import com.google.common.collect.ImmutableMap;

public class bos extends bnc<bln> {
   private final big c;
   private final float d;
   private final float e;
   private final float f;

   public bos(big $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(bum.n, bun.b, bum.P, bun.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(ami $$0, bln $$1, long $$2) {
      atw $$3 = $$1.eh();
      float $$4 = atq.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = atq.g($$1.dD() + 2.0F * $$3.i() * this.d - this.d);
      ejz $$6 = ejz.a($$4, $$5);
      $$1.dP().a(bum.n, new bnf($$1.br().e($$6)));
      $$1.dP().a(bum.P, this.c.a($$3));
   }
}
