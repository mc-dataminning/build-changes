import com.mojang.serialization.MapCodec;

public abstract class dqx extends dmq {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final fcr h = dkl.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fcr i = dkl.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final fcr j = dkl.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dqx(dxt.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqx> a();

   @Override
   protected fcr a(dxu $$0, dgm $$1, jh $$2, fcc $$3) {
      switch ($$0.c(a).o()) {
         case a:
         default:
            return j;
         case c:
            return i;
         case b:
            return h;
      }
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dxu $$0, eul $$1) {
      return false;
   }
}
