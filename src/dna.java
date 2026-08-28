import com.mojang.serialization.MapCodec;

public class dna extends dfb {
   public static final MapCodec<dna> a = b(dna::new);
   private static final double b = 5.0;
   private static final ewm c = dfb.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<dna> a() {
      return a;
   }

   protected dna(dsd.d $$0) {
      super($$0);
   }

   @Override
   protected dlh a_(dse $$0) {
      return dlh.a;
   }

   @Override
   protected ewm a(dse $$0, dbg $$1, iz $$2, evy $$3) {
      return c;
   }

   @Override
   protected float d(dse $$0, dbg $$1, iz $$2) {
      return 1.0F;
   }
}
