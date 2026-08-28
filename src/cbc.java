import com.google.common.collect.ImmutableMap;

public class cbc extends bzl<bxw> {
   private final btw c;
   private final float d;
   private final float e;
   private final float f;

   public cbc(btw $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cgw.o, cgx.b, cgw.R, cgx.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(ars $$0, bxw $$1, long $$2) {
      azx $$3 = $$1.dY();
      float $$4 = azo.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = azo.h($$1.dL() + 2.0F * $$3.i() * this.d - this.d);
      ffq $$6 = ffq.a($$4, $$5);
      $$1.ec().a(cgw.o, new bzo($$1.bD().e($$6)));
      $$1.ec().a(cgw.R, this.c.a($$3));
   }
}
