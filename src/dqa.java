import com.mojang.serialization.MapCodec;

public abstract class dqa extends dlq {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final fbu h = djm.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fbu i = djm.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final fbu j = djm.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dqa(dww.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqa> a();

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
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
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dwx a(dwx $$0, dol $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }
}
