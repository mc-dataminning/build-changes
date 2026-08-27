import com.mojang.serialization.MapCodec;

public class ddm extends ddq {
   public static final MapCodec<ddm> a = b(ddm::new);

   @Override
   public MapCodec<ddm> a() {
      return a;
   }

   public ddm(dhm.d $$0) {
      super($$0);
   }

   @Override
   public boolean a_(dhn $$0, crl $$1, hx $$2) {
      return false;
   }

   @Override
   public int g(dhn $$0, crl $$1, hx $$2) {
      return $$1.N();
   }
}
