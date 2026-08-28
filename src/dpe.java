import com.mojang.serialization.MapCodec;

public class dpe extends dqr {
   public static final MapCodec<dpe> b = b(dpe::new);

   @Override
   public MapCodec<dpe> a() {
      return b;
   }

   protected dpe(dwu.d $$0) {
      super(dqr.b.e, $$0);
   }
}
