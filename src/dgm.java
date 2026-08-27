import com.mojang.serialization.MapCodec;

public class dgm extends dal {
   public static final MapCodec<dgm> a = b(dgm::new);
   protected static final float b = 6.0F;
   protected static final eqm c = dac.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dgm> a() {
      return a;
   }

   protected dgm(dna.d $$0) {
      super($$0);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return c;
   }

   @Override
   protected boolean b(dnb $$0, cwh $$1, ib $$2) {
      return $$0.a(aun.aL) || $$0.a(dae.dX) || super.b($$0, $$1, $$2);
   }
}
