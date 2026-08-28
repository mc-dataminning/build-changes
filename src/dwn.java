import com.mojang.serialization.MapCodec;

public class dwn extends dqw {
   public static final MapCodec<dwn> c = b(dwn::new);
   private static final fgm e = dne.b(8.0, 0.0, 16.0);

   @Override
   public MapCodec<dwn> a() {
      return c;
   }

   public dwn(ebf.d $$0) {
      super($$0, jc.b, e, false);
   }

   @Override
   protected dqx c() {
      return (dqx)dng.ph;
   }
}
