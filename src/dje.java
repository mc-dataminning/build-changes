import com.mojang.serialization.MapCodec;

public abstract class dje extends dey {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final ety h = dcv.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final ety i = dcv.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final ety j = dcv.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dje(dpx.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dje> a();

   @Override
   protected ety a(dpy $$0, cza $$1, im $$2, etk $$3) {
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
   protected dpy a(dpy $$0, dji $$1) {
      return $$0.a(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dpy a(dpy $$0, dhs $$1) {
      return $$0.a(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dpy $$0, emg $$1) {
      return false;
   }
}
