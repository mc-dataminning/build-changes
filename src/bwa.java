import com.google.common.collect.ImmutableMap;

public class bwa extends buj<bss> {
   private final bpb c;
   private final float d;
   private final float e;
   private final float f;

   public bwa(bpb $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cbu.n, cbv.b, cbu.Q, cbv.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aqn $$0, bss $$1, long $$2) {
      aym $$3 = $$1.el();
      float $$4 = ayf.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = ayf.g($$1.dF() + 2.0F * $$3.i() * this.d - this.d);
      eum $$6 = eum.a($$4, $$5);
      $$1.dS().a(cbu.n, new bum($$1.bx().e($$6)));
      $$1.dS().a(cbu.Q, this.c.a($$3));
   }
}
