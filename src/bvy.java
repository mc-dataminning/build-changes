import com.google.common.collect.ImmutableMap;

public class bvy extends buh<bsq> {
   private final boz c;
   private final float d;
   private final float e;
   private final float f;

   public bvy(boz $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cbs.n, cbt.b, cbs.Q, cbt.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aqm $$0, bsq $$1, long $$2) {
      ayk $$3 = $$1.el();
      float $$4 = ayd.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = ayd.g($$1.dF() + 2.0F * $$3.i() * this.d - this.d);
      euk $$6 = euk.a($$4, $$5);
      $$1.dS().a(cbs.n, new buk($$1.bx().e($$6)));
      $$1.dS().a(cbs.Q, this.c.a($$3));
   }
}
