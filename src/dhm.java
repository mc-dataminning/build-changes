import com.mojang.serialization.MapCodec;

public class dhm extends dhq {
   public static final MapCodec<dhm> a = b(dhm::new);

   @Override
   public MapCodec<dhm> a() {
      return a;
   }

   public dhm(dmd.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(dme $$0, cvk $$1, ib $$2) {
      return false;
   }

   @Override
   protected int g(dme $$0, cvk $$1, ib $$2) {
      return $$1.O();
   }
}
