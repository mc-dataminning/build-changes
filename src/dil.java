import com.mojang.serialization.MapCodec;

public class dil extends djx {
   public static final MapCodec<dil> b = b(dil::new);

   @Override
   public MapCodec<dil> a() {
      return b;
   }

   protected dil(dpx.d $$0) {
      super(djx.b.e, $$0);
   }
}
