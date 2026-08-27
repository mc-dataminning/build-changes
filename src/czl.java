import com.mojang.serialization.MapCodec;

public class czl extends czm {
   public static final MapCodec<czl> a = b(czl::new);
   protected static final float b = 6.0F;
   protected static final eqm c = dac.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<czl> a() {
      return a;
   }

   protected czl(dna.d $$0) {
      super($$0);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return c;
   }
}
