import com.mojang.serialization.MapCodec;

public class dko extends dma {
   public static final MapCodec<dko> b = b(dko::new);

   @Override
   public MapCodec<dko> a() {
      return b;
   }

   protected dko(dsa.d $$0) {
      super(dma.b.e, $$0);
   }
}
