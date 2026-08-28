import com.mojang.serialization.MapCodec;

public class djv extends djw {
   public static final MapCodec<djv> a = b(djv::new);
   protected static final float b = 6.0F;
   protected static final fcs c = dkm.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<djv> a() {
      return a;
   }

   protected djv(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
      return c;
   }
}
