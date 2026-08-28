import com.google.common.collect.ImmutableMap;

public class cak extends byt<bxe> {
   private final btg c;
   private final float d;
   private final float e;
   private final float f;

   public cak(btg $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cge.o, cgf.b, cge.R, cgf.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(arq $$0, bxe $$1, long $$2) {
      azv $$3 = $$1.dY();
      float $$4 = azm.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = azm.h($$1.dL() + 2.0F * $$3.i() * this.d - this.d);
      fei $$6 = fei.a($$4, $$5);
      $$1.eb().a(cge.o, new byw($$1.bE().e($$6)));
      $$1.eb().a(cge.R, this.c.a($$3));
   }
}
