import com.mojang.serialization.MapCodec;

public class dou extends dis {
   public static final MapCodec<dou> a = b(dou::new);
   protected static final float b = 6.0F;
   protected static final fal c = dij.a(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

   @Override
   public MapCodec<dou> a() {
      return a;
   }

   protected dou(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return c;
   }

   @Override
   protected boolean b(dvo $$0, dek $$1, jh $$2) {
      return $$0.a(axd.aN) || $$0.a(dil.dX) || super.b($$0, $$1, $$2);
   }
}
