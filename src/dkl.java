import com.mojang.serialization.MapCodec;

public class dkl extends dcq implements dck {
   public static final MapCodec<dkl> a = b(dkl::new);
   protected static final float b = 6.0F;
   protected static final etc c = dch.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dkl> a() {
      return a;
   }

   protected dkl(dph.d $$0) {
      super($$0);
   }

   @Override
   protected etc a(dpi $$0, cym $$1, id $$2, eso $$3) {
      return c;
   }

   @Override
   public boolean b(czj $$0, id $$1, dpi $$2) {
      return true;
   }

   @Override
   public boolean a(czg $$0, axt $$1, id $$2, dpi $$3) {
      return true;
   }

   @Override
   public void a(apu $$0, axt $$1, id $$2, dpi $$3) {
      dep $$4 = (dep)($$3.a(dcj.bu) ? dcj.iI : dcj.iH);
      if ($$4.n().a($$0, $$2) && $$0.u($$2.c())) {
         dep.a($$0, $$4.n(), $$2, 2);
      }
   }
}
