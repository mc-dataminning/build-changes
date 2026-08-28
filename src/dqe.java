import com.mojang.serialization.MapCodec;

public class dqe extends dle {
   public static final MapCodec<dqe> a = b(dqe::new);
   private static final fdo b = dku.b(12.0, 0.0, 3.0);

   @Override
   public MapCodec<dqe> a() {
      return a;
   }

   public dqe(dyl.d $$0) {
      super($$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return b;
   }

   @Override
   protected boolean b(dym $$0, dgv $$1, jj $$2) {
      return $$0.a(awz.aO) || $$0.a(dkw.ek) || super.b($$0, $$1, $$2);
   }
}
