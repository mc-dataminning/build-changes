import com.google.common.collect.ImmutableMap;

public class byq extends bwz<bvi> {
   private final bro c;
   private final float d;
   private final float e;
   private final float f;

   public byq(bro $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cek.n, cel.b, cek.Q, cel.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(arc $$0, bvi $$1, long $$2) {
      azh $$3 = $$1.dZ();
      float $$4 = ayz.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = ayz.h($$1.dM() + 2.0F * $$3.i() * this.d - this.d);
      fba $$6 = fba.a($$4, $$5);
      $$1.ec().a(cek.n, new bxc($$1.bF().e($$6)));
      $$1.ec().a(cek.Q, this.c.a($$3));
   }
}
