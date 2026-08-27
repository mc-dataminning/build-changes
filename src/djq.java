import com.mojang.serialization.MapCodec;

public class djq extends ddq {
   public static final MapCodec<djq> c = b(djq::new);
   public static final eqm e = dac.a(1.0, 0.0, 1.0, 15.0, 16.0, 15.0);

   @Override
   public MapCodec<djq> a() {
      return c;
   }

   public djq(dna.d $$0) {
      super($$0, ih.a, e, false);
   }

   @Override
   protected ddr c() {
      return (ddr)dae.oz;
   }
}
