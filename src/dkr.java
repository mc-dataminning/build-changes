import com.mojang.serialization.MapCodec;

public class dkr extends dob {
   public static final MapCodec<dkr> b = b(dkr::new);

   @Override
   public MapCodec<dkr> a() {
      return b;
   }

   protected dkr(dsc.d $$0) {
      super(dmc.b.e, $$0);
   }
}
