import com.mojang.serialization.MapCodec;

public class dty extends dnv {
   public static final MapCodec<dty> c = b(dty::new);
   private static final fcr g = dke.b(8.0, 9.0, 16.0);

   @Override
   public MapCodec<dty> a() {
      return c;
   }

   public dty(dxp.d $$0) {
      super($$0, jn.a, g, false, 0.1);
   }

   @Override
   protected int a(azh $$0) {
      return dpp.a($$0);
   }

   @Override
   protected dke b() {
      return dkg.pc;
   }

   @Override
   protected boolean h(dxq $$0) {
      return dpp.a($$0);
   }
}
