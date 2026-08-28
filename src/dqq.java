import com.mojang.serialization.MapCodec;

public abstract class dqq extends dmj {
   protected static final float f = 6.0F;
   protected static final float g = 10.0F;
   protected static final fcm h = dke.a(6.0, 0.0, 6.0, 10.0, 16.0, 10.0);
   protected static final fcm i = dke.a(6.0, 6.0, 0.0, 10.0, 10.0, 16.0);
   protected static final fcm j = dke.a(0.0, 6.0, 6.0, 16.0, 10.0, 10.0);

   protected dqq(dxm.d $$0) {
      super($$0);
   }

   @Override
   protected abstract MapCodec<? extends dqq> a();

   @Override
   protected fcm a(dxn $$0, dgf $$1, jh $$2, fbx $$3) {
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
   protected dxn a(dxn $$0, dqu $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxn a(dxn $$0, dpd $$1) {
      return $$0.b(a, $$1.b($$0.c(a)));
   }

   @Override
   protected boolean a(dxn $$0, eue $$1) {
      return false;
   }
}
