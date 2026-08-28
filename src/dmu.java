import com.mojang.serialization.MapCodec;

public class dmu extends dle {
   public static final MapCodec<dmu> a = b(dmu::new);
   private static final fdo b = dku.b(12.0, 0.0, 13.0);

   @Override
   public MapCodec<dmu> a() {
      return a;
   }

   protected dmu(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b;
   }

   @Override
   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      return $$0.a(awz.cp);
   }
}
