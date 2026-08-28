import com.mojang.serialization.MapCodec;

public class djm extends djn {
   public static final MapCodec<djm> a = b(djm::new);
   protected static final float b = 6.0F;
   protected static final fcl c = dkd.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<djm> a() {
      return a;
   }

   protected djm(dxn.d $$0) {
      super($$0);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return c;
   }
}
