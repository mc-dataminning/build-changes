import com.mojang.serialization.MapCodec;

public abstract class dqy extends dmr {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final fcs h = dkm.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fcs i = dkm.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final fcs j = dkm.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dqy(dxu.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqy> a();

   @Override
   protected fcs a(dxv $$0, dgn $$1, jh $$2, fcd $$3) {
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
   protected dxv a(dxv $$0, drc $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxv a(dxv $$0, dpl $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dxv $$0, eum $$1) {
      return false;
   }
}
