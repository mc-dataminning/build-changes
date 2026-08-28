import com.google.common.collect.ImmutableMap;

public class cah extends byq<bxb> {
   private final btd c;
   private final float d;
   private final float e;
   private final float f;

   public cah(btd $$0, float $$1, float $$2, float $$3) {
      super(ImmutableMap.of(cgb.o, cgc.b, cgb.R, cgc.b));
      if ($$2 > $$3) {
         throw new IllegalArgumentException("Minimum pitch is larger than maximum pitch! " + $$2 + " > " + $$3);
      } else {
         this.c = $$0;
         this.d = $$1;
         this.e = $$2;
         this.f = $$3 - $$2;
      }
   }

   protected void a(aro $$0, bxb $$1, long $$2) {
      azt $$3 = $$1.dY();
      float $$4 = azk.a($$3.i() * this.f + this.e, -90.0F, 90.0F);
      float $$5 = azk.h($$1.dL() + 2.0F * $$3.i() * this.d - this.d);
      fdw $$6 = fdw.a($$4, $$5);
      $$1.eb().a(cgb.o, new byt($$1.bE().e($$6)));
      $$1.eb().a(cgb.R, this.c.a($$3));
   }
}
