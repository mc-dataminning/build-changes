import com.google.common.collect.ImmutableMap;

public class bxo extends bvx<buh> {
   private final bqp c;
   private final float d;
   private final float e;
   private final float f;

   public bxo(bqp $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cdi.n, cdj.b, cdi.Q, cdj.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(arg $$0, buh $$1, long $$2) {
      azk $$3 = $$1.dV();
      float $$4 = azc.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = azc.g($$1.dI() + 2.0F * $$3.i() * this.d - this.d);
      eye $$6 = eye.a($$4, $$5);
      $$1.dX().a(cdi.n, new bwa($$1.bC().e($$6)));
      $$1.dX().a(cdi.Q, this.c.a($$3));
   }
}
