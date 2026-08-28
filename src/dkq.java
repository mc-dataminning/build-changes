import com.mojang.serialization.MapCodec;

public class dkq extends dmc {
   public static final MapCodec<dkq> b = b(dkq::new);

   @Override
   public MapCodec<dkq> a() {
      return b;
   }

   protected dkq(dsc.d $$0) {
      super(dmc.b.e, $$0);
   }
}
