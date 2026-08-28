import com.mojang.serialization.MapCodec;

public abstract class dlh extends dhb {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final ewj h = dey.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ewj i = dey.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final ewj j = dey.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dlh(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dlh> a();

   @Override
   protected ewj a(dsb $$0, dbd $$1, iz $$2, evv $$3) {
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
   protected dsb a(dsb $$0, dll $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dsb a(dsb $$0, djv $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dsb $$0, eoj $$1) {
      return false;
   }
}
