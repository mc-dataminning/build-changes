import com.mojang.serialization.MapCodec;

public class dtd extends dnv {
   public static final MapCodec<dtd> c = b(dtd::new);
   private static final fcr g = dke.b(8.0, 0.0, 15.0);

   @Override
   public MapCodec<dtd> a() {
      return c;
   }

   public dtd(dxp.d $$0) {
      super($$0, jn.b, g, false, 0.1);
   }

   @Override
   protected int a(azh $$0) {
      return dpp.a($$0);
   }

   @Override
   protected dke b() {
      return dkg.pe;
   }

   @Override
   protected boolean h(dxq $$0) {
      return dpp.a($$0);
   }
}
