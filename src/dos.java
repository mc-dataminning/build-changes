import com.mojang.serialization.MapCodec;

public abstract class dos extends dkm {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final fal h = dij.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fal i = dij.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final fal j = dij.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dos(dvn.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dos> a();

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
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
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
