import com.mojang.serialization.MapCodec;

public class dia extends dac {
   public static final MapCodec<dia> a = b(dia::new);
   private static final double b = 5.0;
   private static final eqm c = dac.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dia> a() {
      return a;
   }

   protected dia(dna.d $$0) {
      super($$0);
   }

   @Override
   protected dgh b_(dnb $$0) {
      return dgh.a;
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return c;
   }

   @Override
   protected float d(dnb $$0, cwh $$1, ib $$2) {
      return 1.0F;
   }
}
