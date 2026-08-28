import com.mojang.serialization.MapCodec;

public class dpx extends dti {
   public static final MapCodec<dpx> b = b(dpx::new);

   @Override
   public MapCodec<dpx> a() {
      return b;
   }

   protected dpx(dxm.d $$0) {
      super(drj.b.e, $$0);
   }
}
