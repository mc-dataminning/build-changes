import com.mojang.serialization.MapCodec;

public class djw extends dby {
   public static final MapCodec<djw> a = b(djw::new);
   private static final double b = 5.0;
   private static final est c = dby.a(5.0, 5.0, 5.0, 11.0, 11.0, 11.0);

   @Override
   public MapCodec<djw> a() {
      return a;
   }

   protected djw(doy.d $$0) {
      super($$0);
   }

   @Override
   protected did b_(doz $$0) {
      return did.a;
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return c;
   }

   @Override
   protected float d(doz $$0, cyd $$1, ib $$2) {
      return 1.0F;
   }
}
