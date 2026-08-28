import com.mojang.serialization.MapCodec;

public class dmn extends dmo {
   public static final MapCodec<dmn> a = b(dmn::new);
   private static final fgm c = dne.b(12.0, 0.0, 15.0);

   @Override
   public MapCodec<dmn> a() {
      return a;
   }

   protected dmn(ebf.d $$0) {
      super($$0);
   }

   @Override
   protected fgm a(ebg $$0, djd $$1, iw $$2, ffx $$3) {
      return c;
   }
}
