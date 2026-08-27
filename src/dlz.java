import com.mojang.serialization.MapCodec;

public abstract class dlz extends dhg {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final exn h = dfc.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final exn i = dfc.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final exn j = dfc.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dlz(dtb.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlz> a();

   @Override
   protected exn a(dtc $$0, dbg $$1, ir $$2, ewz $$3) {
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
   protected dtc a(dtc $$0, dmd $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dtc a(dtc $$0, dke $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }
}
