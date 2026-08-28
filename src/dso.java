import com.mojang.serialization.MapCodec;

public class dso extends dkm {
   public static final MapCodec<dso> a = b(dso::new);
   private static final double b = 5.0;
   private static final fcs c = dkm.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dso> a() {
      return a;
   }

   protected dso(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected dqv a_(dxv $$0) {
      return dqv.a;
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return c;
   }

   @Override
   protected float c(dxv $$0, dgn $$1, jh $$2) {
      return 1.0F;
   }
}
