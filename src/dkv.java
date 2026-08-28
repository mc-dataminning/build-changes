import com.mojang.serialization.MapCodec;

public class dkv extends dmh {
   public static final MapCodec<dkv> b = b(dkv::new);

   @Override
   public MapCodec<dkv> a() {
      return b;
   }

   protected dkv(dsg.d $$0) {
      super(dmh.b.e, $$0);
   }
}
