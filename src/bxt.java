import com.google.common.collect.ImmutableMap;

public class bxt extends bwc<bum> {
   private final bqu c;
   private final float d;
   private final float e;
   private final float f;

   public bxt(bqu $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cdn.n, cdo.b, cdn.Q, cdo.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(arh $$0, bum $$1, long $$2) {
      azl $$3 = $$1.dV();
      float $$4 = azd.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = azd.g($$1.dI() + 2.0F * $$3.i() * this.d - this.d);
      eys $$6 = eys.a($$4, $$5);
      $$1.dX().a(cdn.n, new bwf($$1.bC().e($$6)));
      $$1.dX().a(cdn.Q, this.c.a($$3));
   }
}
