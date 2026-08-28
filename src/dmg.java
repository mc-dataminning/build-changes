import com.mojang.serialization.MapCodec;

public abstract class dmg extends dhz {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final exp h = dfw.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final exp i = dfw.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final exp j = dfw.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dmg(dsz.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmg> a();

   @Override
   protected exp a(dta $$0, dca $$1, jd $$2, exb $$3) {
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
   protected dta a(dta $$0, dmk $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dta a(dta $$0, dkt $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dta $$0, epn $$1) {
      return false;
   }
}
