import com.mojang.serialization.MapCodec;

public class dmm extends dmo {
   public static final MapCodec<dmm> a = b(dmm::new);
   private static final fgm c = dne.b(12.0, 0.0, 4.0);

   @Override
   public MapCodec<? extends dmm> a() {
      return a;
   }

   protected dmm(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return c;
   }
}
