import com.google.common.collect.ImmutableMap;

public class cbn extends bzw<byh> {
   private final buh c;
   private final float d;
   private final float e;
   private final float f;

   public cbn(buh $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(chh.o, chi.b, chh.R, chi.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(asb $$0, byh $$1, long $$2) {
      bai $$3 = $$1.dY();
      float $$4 = azz.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = azz.h($$1.dL() + 2.0F * $$3.i() * this.d - this.d);
      fgc $$6 = fgc.a($$4, $$5);
      $$1.ec().a(chh.o, new bzz($$1.bD().e($$6)));
      $$1.ec().a(chh.R, this.c.a($$3));
   }
}
