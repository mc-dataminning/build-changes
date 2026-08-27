import com.mojang.serialization.MapCodec;

public class dfc extends cxh implements cxb {
   public static final MapCodec<dfc> a = b(dfc::new);
   protected static final float b = 6.0F;
   protected static final emv c = cwy.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dfc> a() {
      return a;
   }

   protected dfc(djo.d $$0) {
      super($$0);
   }

   @Override
   public emv a(djp $$0, ctd $$1, hx $$2, emh $$3) {
      return c;
   }

   @Override
   public boolean b(cua $$0, hx $$1, djp $$2) {
      return true;
   }

   @Override
   public boolean a(ctx $$0, auw $$1, hx $$2, djp $$3) {
      return true;
   }

   @Override
   public void a(ane $$0, auw $$1, hx $$2, djp $$3) {
      czg $$4 = (czg)($$3.a(cxa.bu) ? cxa.iI : cxa.iH);
      if ($$4.o().a($$0, $$2) && $$0.u($$2.c())) {
         czg.a($$0, $$4.o(), $$2, 2);
      }
   }
}
