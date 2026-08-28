import com.mojang.serialization.MapCodec;

public abstract class dpy extends dlo {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final fbs h = djk.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fbs i = djk.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final fbs j = djk.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dpy(dwu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dpy> a();

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
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
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dwv $$0, etm $$1) {
      return false;
   }
}
