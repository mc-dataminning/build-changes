import com.mojang.serialization.MapCodec;

public class diu extends ddr {
   public static final MapCodec<diu> c = b(diu::new);
   public static final eqm g = dac.a(4.0, 0.0, 4.0, 12.0, 15.0, 12.0);

   @Override
   public MapCodec<diu> a() {
      return c;
   }

   public diu(dna.d $$0) {
      super($$0, ih.b, g, false, 0.1);
   }

   @Override
   protected int a(axd $$0) {
      return dfh.a($$0);
   }

   @Override
   protected dac b() {
      return dae.oC;
   }

   @Override
   protected boolean g(dnb $$0) {
      return dfh.a($$0);
   }
}
