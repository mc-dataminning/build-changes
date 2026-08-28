import com.mojang.serialization.MapCodec;

public class dlo extends dnb {
   public static final MapCodec<dlo> b = b(dlo::new);

   @Override
   public MapCodec<dlo> a() {
      return b;
   }

   protected dlo(dtb.d $$0) {
      super(dnb.b.e, $$0);
   }
}
