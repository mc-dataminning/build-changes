import com.mojang.serialization.MapCodec;

public class dpp extends dhs implements dhm {
   public static final MapCodec<dpp> a = b(dpp::new);
   protected static final float b = 6.0F;
   protected static final ezm c = dhj.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dpp> a() {
      return a;
   }

   protected dpp(dun.d $$0) {
      super($$0);
   }

   @Override
   protected ezm a(duo $$0, ddl $$1, je $$2, eyx $$3) {
      return c;
   }

   @Override
   public boolean b(dej $$0, je $$1, duo $$2) {
      return o($$2).o().a($$0, $$1) && $$0.u($$1.d());
   }

   @Override
   public boolean a(deg $$0, azl $$1, je $$2, duo $$3) {
      return true;
   }

   @Override
   public void a(arh $$0, azl $$1, je $$2, duo $$3) {
      djr.a($$0, o($$3).o(), $$2, 2);
   }

   private static djr o(duo $$0) {
      return (djr)($$0.a(dhl.bu) ? dhl.iI : dhl.iH);
   }
}
