import com.mojang.serialization.MapCodec;

public class djp extends ddr {
   public static final MapCodec<djp> c = b(djp::new);
   protected static final eqm g = dac.a(4.0, 9.0, 4.0, 12.0, 16.0, 12.0);

   @Override
   public MapCodec<djp> a() {
      return c;
   }

   public djp(dna.d $$0) {
      super($$0, ih.a, g, false, 0.1);
   }

   @Override
   protected int a(axd $$0) {
      return dfh.a($$0);
   }

   @Override
   protected dac b() {
      return dae.oA;
   }

   @Override
   protected boolean g(dnb $$0) {
      return dfh.a($$0);
   }
}
