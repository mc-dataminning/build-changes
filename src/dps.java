import com.mojang.serialization.MapCodec;

public class dps extends dhv implements dhp {
   public static final MapCodec<dps> a = b(dps::new);
   protected static final float b = 6.0F;
   protected static final ezq c = dhm.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dps> a() {
      return a;
   }

   protected dps(dur.d $$0) {
      super($$0);
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return c;
   }

   @Override
   public boolean b(dem $$0, jf $$1, dus $$2) {
      return o($$2).n().a($$0, $$1) && $$0.u($$1.d());
   }

   @Override
   public boolean a(dej $$0, azn $$1, jf $$2, dus $$3) {
      return true;
   }

   @Override
   public void a(arj $$0, azn $$1, jf $$2, dus $$3) {
      dju.a($$0, o($$3).n(), $$2, 2);
   }

   private static dju o(dus $$0) {
      return (dju)($$0.a(dho.bu) ? dho.iI : dho.iH);
   }
}
