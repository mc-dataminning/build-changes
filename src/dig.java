import com.mojang.serialization.MapCodec;

public abstract class dig extends deb {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final est h = dby.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final est i = dby.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final est j = dby.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dig(doy.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dig> a();

   @Override
   protected est a(doz $$0, cyd $$1, ib $$2, esf $$3) {
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
   protected doz a(doz $$0, dik $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected doz a(doz $$0, dgu $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(doz $$0, elh $$1) {
      return false;
   }
}
