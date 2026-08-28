import com.mojang.serialization.MapCodec;

public class dsw extends dta {
   public static final MapCodec<dsw> a = b(dsw::new);

   @Override
   public MapCodec<dsw> a() {
      return a;
   }

   public dsw(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected boolean e_(dxu $$0) {
      return false;
   }

   @Override
   protected int i_(dxu $$0) {
      return 15;
   }
}
