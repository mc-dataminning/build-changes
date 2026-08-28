import com.mojang.serialization.MapCodec;

public class dhz extends dia {
   public static final MapCodec<dhz> a = b(dhz::new);
   protected static final float b = 6.0F;
   protected static final fas c = diq.a(2.0, 0.0, 2.0, 14.0, 15.0, 14.0);

   @Override
   public MapCodec<dhz> a() {
      return a;
   }

   protected dhz(dvu.d $$0) {
      super($$0);
   }

   @Override
   protected fas a(dvv $$0, der $$1, jh $$2, fad $$3) {
      return c;
   }
}
