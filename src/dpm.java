import com.mojang.serialization.MapCodec;

public class dpm extends dhm {
   public static final MapCodec<dpm> a = b(dpm::new);
   private static final double b = 5.0;
   private static final ezq c = dhm.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dpm> a() {
      return a;
   }

   protected dpm(dur.d $$0) {
      super($$0);
   }

   @Override
   protected dnt a_(dus $$0) {
      return dnt.a;
   }

   @Override
   protected ezq a(dus $$0, ddo $$1, jf $$2, ezb $$3) {
      return c;
   }

   @Override
   protected float c(dus $$0, ddo $$1, jf $$2) {
      return 1.0F;
   }
}
