import com.mojang.serialization.MapCodec;

public class czk extends czm {
   public static final MapCodec<czk> a = b(czk::new);
   private static final eqm b = dac.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends czk> a() {
      return a;
   }

   protected czk(dna.d $$0) {
      super($$0);
   }

   @Override
   protected eqm a(dnb $$0, cwh $$1, ib $$2, epy $$3) {
      return b;
   }
}
