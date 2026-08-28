import com.google.common.collect.ImmutableMap;

public class bwl extends buu<btd> {
   private final bpl c;
   private final float d;
   private final float e;
   private final float f;

   public bwl(bpl $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(ccf.n, ccg.b, ccf.Q, ccg.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aqm $$0, btd $$1, long $$2) {
      ayo $$3 = $$1.dT();
      float $$4 = ayg.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = ayg.g($$1.dG() + 2.0F * $$3.i() * this.d - this.d);
      ewf $$6 = ewf.a($$4, $$5);
      $$1.dU().a(ccf.n, new bux($$1.by().e($$6)));
      $$1.dU().a(ccf.Q, this.c.a($$3));
   }
}
