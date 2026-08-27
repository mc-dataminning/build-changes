import com.mojang.serialization.MapCodec;

public class dhc extends dch {
   public static final MapCodec<dhc> a = b(dhc::new);
   protected static final est b = dby.a(2.0, 0.0, 2.0, 14.0, 3.0, 14.0);

   @Override
   public MapCodec<dhc> a() {
      return a;
   }

   public dhc(doy.d $$0) {
      super($$0);
   }

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
      return b;
   }

   @Override
   protected boolean b(doz $$0, cyd $$1, ib $$2) {
      return $$0.a(avc.aL) || $$0.a(dca.dX) || super.b($$0, $$1, $$2);
   }
}
