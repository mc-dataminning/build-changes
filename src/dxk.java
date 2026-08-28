import com.mojang.serialization.MapCodec;

public class dxk extends dqw {
   public static final MapCodec<dxk> c = b(dxk::new);
   private static final fgm e = dne.b(14.0, 0.0, 16.0);

   @Override
   public MapCodec<dxk> a() {
      return c;
   }

   public dxk(ebf.d $$0) {
      super($$0, jc.a, e, false);
   }

   @Override
   protected dqx c() {
      return (dqx)dng.pf;
   }
}
