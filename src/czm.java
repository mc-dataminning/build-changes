import com.mojang.serialization.MapCodec;

public class czm extends cty {
   public static final MapCodec<czm> d = b(czm::new);

   @Override
   public MapCodec<czm> a() {
      return d;
   }

   public czm(dhm.d $$0) {
      super($$0, jc.e);
   }

   @Override
   protected double b(dhn $$0) {
      return 0.9375;
   }

   @Override
   public boolean d(dhn $$0) {
      return true;
   }

   @Override
   public void a(dhn $$0, csf $$1, hx $$2, bkv $$3) {
      if (this.a($$0, $$2, $$3)) {
         $$3.ay();
      }
   }

   @Override
   public int a(dhn $$0, csf $$1, hx $$2) {
      return 3;
   }
}
