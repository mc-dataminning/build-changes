import com.google.common.collect.ImmutableMap;

public class byf extends bwo<bux> {
   private final brd c;
   private final float d;
   private final float e;
   private final float f;

   public byf(brd $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cdz.n, cea.b, cdz.Q, cea.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(arm $$0, bux $$1, long $$2) {
      azr $$3 = $$1.ea();
      float $$4 = azj.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = azj.h($$1.dN() + 2.0F * $$3.i() * this.d - this.d);
      ezh $$6 = ezh.a($$4, $$5);
      $$1.ed().a(cdz.n, new bwr($$1.bG().e($$6)));
      $$1.ed().a(cdz.Q, this.c.a($$3));
   }
}
