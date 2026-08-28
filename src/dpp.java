import com.mojang.serialization.MapCodec;

public class dpp extends dkk {
   public static final MapCodec<dpp> c = b(dpp::new);
   public static final eyx g = dgv.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<dpp> a() {
      return c;
   }

   public dpp(dtz.d $$0) {
      super($$0, jj.b, g, false, 0.1);
   }

   @Override
   protected int a(azk $$0) {
      return dmb.a($$0);
   }

   @Override
   protected dgv b() {
      return dgx.oC;
   }

   @Override
   protected boolean h(dua $$0) {
      return dmb.a($$0);
   }
}
