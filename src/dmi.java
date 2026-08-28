import com.mojang.serialization.MapCodec;

public abstract class dmi extends dib {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final exv h = dfy.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final exv i = dfy.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final exv j = dfy.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dmi(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dmi> a();

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
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
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dtc a(dtc $$0, dkv $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
