import com.mojang.serialization.MapCodec;

public class dij extends din {
   public static final MapCodec<dij> a = b(dij::new);

   @Override
   public MapCodec<dij> a() {
      return a;
   }

   public dij(dna.d $$0) {
      super($$0);
   }

   @Override
   protected boolean a_(dnb $$0, cwh $$1, ib $$2) {
      return false;
   }

   @Override
   protected int g(dnb $$0, cwh $$1, ib $$2) {
      return $$1.O();
   }
}
