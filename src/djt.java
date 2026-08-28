import com.mojang.serialization.MapCodec;

public class djt extends djv {
   public static final MapCodec<djt> a = b(djt::new);
   private static final fcr b = dkl.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);

   @Override
   public MapCodec<? extends djt> a() {
      return a;
   }

   protected djt(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      return b;
   }
}
