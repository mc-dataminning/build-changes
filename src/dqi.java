import com.mojang.serialization.MapCodec;

public class dqi extends dij {
   public static final MapCodec<dqi> a = b(dqi::new);
   private static final double b = 5.0;
   private static final fal c = dij.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dqi> a() {
      return a;
   }

   protected dqi(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.a;
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return c;
   }

   @Override
   protected float c(dvo $$0, dek $$1, jh $$2) {
      return 1.0F;
   }
}
