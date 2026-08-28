import com.google.common.collect.ImmutableMap;

public class bwm extends buv<bte> {
   private final bpm c;
   private final float d;
   private final float e;
   private final float f;

   public bwm(bpm $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(ccg.n, cch.b, ccg.Q, cch.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aqm $$0, bte $$1, long $$2) {
      ayo $$3 = $$1.dU();
      float $$4 = ayg.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = ayg.g($$1.dH() + 2.0F * $$3.i() * this.d - this.d);
      ewh $$6 = ewh.a($$4, $$5);
      $$1.dV().a(ccg.n, new buy($$1.bz().e($$6)));
      $$1.dV().a(ccg.Q, this.c.a($$3));
   }
}
