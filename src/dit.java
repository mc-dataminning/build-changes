import com.mojang.serialization.MapCodec;

public class dit extends diu {
   public static final MapCodec<dit> a = b(dit::new);
   protected static final float b = 6.0F;
   protected static final fbs c = djk.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dit> a() {
      return a;
   }

   protected dit(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return c;
   }
}
