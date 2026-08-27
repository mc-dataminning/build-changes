import com.mojang.serialization.MapCodec;

public class ddx extends dch {
   public static final MapCodec<ddx> a = b(ddx::new);
   protected static final float b = 6.0F;
   protected static final est c = dby.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<ddx> a() {
      return a;
   }

   protected ddx(doy.d $$0) {
      super($$0);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return c;
   }

   @Override
   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      return $$0.a(avc.cf);
   }
}
